package com.curso.entradassalidas;
import java.io.*;

public class PruebaDesserializa {
	
	public static void main(String[] args) {
		
		Alumno a = null;
		
		//desderializo
		
		try {
		    FileInputStream f =  new FileInputStream ("alumno.ser");
		    
		    ObjectInputStream s = new ObjectInputStream (f);
		    a = (Alumno) s.readObject ();
		    s.close ();
		} catch (Exception e) {
		    	   e.printStackTrace ();
		}
		
		System.out.println("Alumno es " + a.getNombre() );
		
	}

}
