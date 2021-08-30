package com.curso.colecciones;

import java.util.*;

public class PruebaList {
    
    public static void main(String[] args) {
        
        
        List<String> l = new Vector<String>();
                          //new ArrayList();

        l.add("Zorro"); //0
        l.add("Gato");  //1
        l.add("Avion");  //2
        
        l.add(2, "Zapato"); //2 y Avion pasa a la posición 3
        
        System.out.println("ver 2: " + l.get(2));
        
        System.out.println("ver 3: " + l.get(3));
        
        System.out.println("listar todos:");
        for(String s : l){
            System.out.println(s);
        }
        
        
        LinkedList<String> l2 = new LinkedList();
        
        l2.addFirst("UNO");
        l2.add("OTRO");
        l2.addLast("FIN");
        
        
        
        
    }
    
}
