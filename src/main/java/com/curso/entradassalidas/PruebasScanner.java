package com.curso.entradassalidas;

import java.util.Locale;
import java.util.Scanner;

public class PruebasScanner {
	
	
	public static void main(String[] args) {
		
		
		String linea = "12#Luis Ramos#Matematicas#4.5#445.7";
		
		String[]  campos = linea.split("#");
		int id =  Integer.parseInt(campos[0]);
		
		//clase SCANNER  - Tiene encuenta el Locale 
		
		Locale ingles = new Locale("es","us");  //IDIOMA INGLES DE ESTADO UNIDOS
		
		Scanner sc = new Scanner(linea);
		sc.useLocale(ingles);
		sc.useDelimiter("#");
		
		int idAlumno = sc.nextInt();
		String nombreAl = sc.next();
		String asignatura = sc.next();
		double nota = sc.nextDouble();
	
		
	
		
		
		
	}

}
