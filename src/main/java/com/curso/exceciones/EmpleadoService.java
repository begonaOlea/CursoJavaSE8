package com.curso.exceciones;

public class EmpleadoService {
	
	
	public void hazAlgo(int i ) {
		if(i < 0 ) throw new EmpleadoException("No puede ser negativo");
	}

}
