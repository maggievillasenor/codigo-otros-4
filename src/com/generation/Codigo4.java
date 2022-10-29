package com.generation;

import java.util.Scanner; //importamos java.util.scanner

public class Codigo4 {

	public static void main(String[] args) {
		// se agrego clase main
		
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): "); 
	    Scanner s = new Scanner(System.in); // cambiamos de posición esta línea //agregamos el argumento
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //jugador 2
	    Scanner s2 = new Scanner(System.in); //agregamos el argumento
	    String j2 = s.nextLine();
	    
	    if (j1.equals(j2)) { //agregamos equals
	        System.out.println("Empate");
	      } else {
	        int g = 2;
	        switch(j1) {
	          case "piedra":
	            if (j2.equals("tijeras")) { //parentesis y agregamos equals
	              g = 1;
	            }

	          case "papel":
	            if (j2.equals("piedra")) { //parentesis y agregamos equals
	              g = 1;
	            } //llave faltante
	            
	          case "tijeras": //tijera
	            if (j2.equals ("papel")) { 
	              g = 1;
	            }
	            break;
	          default:
	        	  System.out.println("Gana el jugador 1"); //se agrega print de default
	        }
	        System.out.println("Gana el jugador " + g);
	      }
	    s.close(); //cierra scanner jugador 1
	    s2.close();//cierra scanner jugador 2
	}

}
