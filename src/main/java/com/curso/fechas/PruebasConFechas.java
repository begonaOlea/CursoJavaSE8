package com.curso.fechas;

import java.time.*;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;  

public class PruebasConFechas {
	
	/**
	 * 
	 *  @deprecated
	 *  @see  java.util.Date
	 */
	public void suma() {
		//lo que sea
	}
	
	
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
	    System.out.println(LocalTime.now());
	    System.out.println(LocalDateTime.now());
	    
	    LocalDate ahora = LocalDate.now();
	    LocalDate haceDosDias = ahora.minusDays(2);
	
	    //31 de agosto de 2021
	    java.util.Date fecha = new java.util.Date(121, 7, 31);
	    
	    Calendar cal = Calendar.getInstance();
	    cal.set(2021, Calendar.AUGUST, 31);
	    fecha = cal.getTime();
	    
	    cal.add(Calendar.DAY_OF_MONTH, 2);
	    
	    //NUEVA java 8
	    
	    LocalDate date1 = LocalDate.of(2021, 8, 31);
	    date1.plusDays(2);
	    
	    
	}
}
