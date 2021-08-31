
package com.curso.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author begonaolea
 */
public class PruebaDateTimeFormatter {
    
    public static void main(String[] args) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d = LocalDate.now();
        
        //pasa un LocalDate a un String con el formato indicado
        String fecha = d.format(formatter);
        
        System.out.println(" fecha: " + fecha);
        
        
        // convierte un String en LocaDate
        String sFecha = "22/10/2018";
        LocalDate d2 = LocalDate.parse(sFecha, formatter);
        
        System.out.println("fecha " + d2);
        
        
    }
    
}

//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#patterns
