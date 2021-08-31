package com.curso.entradassalidas;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PruebaSerializacion {


	public static void main(String[] args) {
		
		//creo u alumno
		
		Alumno a = new Alumno(88881,"Luis Ramos");
		
		//serializo
		

		 try {
		   FileOutputStream f = new FileOutputStream ("alumno.ser");
		   ObjectOutputStream s =  new ObjectOutputStream (f);
		   s.writeObject (a);
		   s.close ();
		 } catch (IOException e) {
		   e.printStackTrace ();
		} 
		
		
		//deserializo
		
		//mostar datos
		
	}
}
