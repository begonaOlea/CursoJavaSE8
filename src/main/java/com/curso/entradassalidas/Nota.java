package com.curso.entradassalidas;

import java.io.Serializable;

public class Nota {///implements Serializable{
	
	public double nota;

}


class NotaMejorada extends Nota implements Serializable{
	
	public int otraNotaMejorada;
}
