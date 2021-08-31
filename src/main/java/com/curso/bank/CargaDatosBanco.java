package com.curso.bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class CargaDatosBanco {
	
	public static void main(String[] args) {
		
		/*
		 *  Leer el fichero DatosALeer.txt para crear los clientes del 
		 *  banco.
		 *  
		 *  Por cada línea leer los dato para crear cliente y su
		 *  cuenta bancaria. 
		 *  
		 *  Si el tipo de cuenta es "C" creamos un CheckingAccount  con los
		 *  dos ultimos números decimales que se carga en la linea
		 *  . el primero es saldo, el segundo es del límite de credito
		 *  
		 *  Si es un tipo de cuetna "S" creamos un SavingAccont donde
		 *  los dos úlimos decimales son saldo y el interes
		 *  
		 *  
		 *  USO: Scanner , DateTimeFormatter 
		 */

		 //leer lineas fichero con Scanner
		try {
			int n = 1;
			Scanner scFichero = new Scanner(new File("DatosALeer.txt"));
			while(scFichero.hasNext()) {
				String linea = scFichero.nextLine();
				
				CustomerList cliente =  crearCliente(linea);
				
				BankMap.addCustomer(cliente, "A"+ n ++);
				
				
			}//fin leer fichero
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no existe " + e.getMessage());
			e.printStackTrace();
		}

		
		/*
		 * Recorrer los clientes del banco mostrando sus  cuentas bancarias
		 */
		  
		 for(int dni = 1 ; dni <= BankMap.getNumOfCustomers() ; dni ++) {
			 CustomerList c = BankMap.getCustomer("A"+dni);
			 System.out.printf(". cliente %s %s %tD %n", c.getFirstName(), c.getLastName(), c.getFechaAlta());
		
			 Account ac = c.getAccount(0);
			 if( ac instanceof SavingsAccount) {
				 SavingsAccount sa = (SavingsAccount) ac;
				 System.out.printf("Cuenta Ahorro con saldo %f a un tipo de interes %f %n", sa.getBalance(),
						 sa.getInterestRate());
			 }else {
				 CheckingAccount ca = (CheckingAccount) ac;
				 System.out.printf("Cuenta Credito con saldo %f con un credito de %f %n", ca.getBalance(),
						 ca.getOverdraftAmount());
			 }
		 
		 }
		
		
	}
	
	
	private static  CustomerList crearCliente(String linea) {
		
		Scanner scLinea = new Scanner(linea);
		scLinea.useDelimiter("#");
		scLinea.useLocale(Locale.ENGLISH); // 5.0
		
		String f = scLinea.next();
		String n = scLinea.next();
		String sFecha = scLinea.next();
		String tipo = scLinea.next();
		double  saldo = scLinea.nextDouble();
		double  dato = scLinea.nextDouble();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaAlta = LocalDate.parse(sFecha,formatter);
				
		CustomerList cliente = new CustomerList(f, n, fechaAlta);
		
		Account cuentaBancaria = null;
		switch (tipo) {
		case "S":
			cuentaBancaria = new SavingsAccount(saldo, dato);
			break;
		case "C":
			cuentaBancaria = new CheckingAccount(saldo, dato);
		}
		
		cliente.addAccount(cuentaBancaria);
		return cliente;
		
		
	}
	
	

}
