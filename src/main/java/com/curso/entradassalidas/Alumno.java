package com.curso.entradassalidas;

import java.io.Serializable;

public class Alumno  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;  
	private String nombre;
//	private String apellidos;
	private transient Nota nota = new Nota(); // como nota no es Serializable 
	
	
	public Alumno(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	 public int getId() {
		return id;
	}

	 public String getNombre() {
		return nombre;
	}
}
