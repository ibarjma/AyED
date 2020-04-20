package a1;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class ej1_6 {
	private static ListaDeEnterosEnlazada l= new ListaDeEnterosEnlazada();

	public static ListaDeEnterosEnlazada calcularSucesion (int num) {
	  l.agregarFinal(num)	;
	  l.comenzar();
	  if (num!=1) {
		  if (num%2==0) {
			  num= num/2;
			  calcularSucesion(num);}
			  else {
				  num=(num *3)+1;
				  calcularSucesion(num);
			  }
		  } return l;
		  
  }
  
public static void main (String[] args) {
	int num= 67;
	ListaDeEnterosEnlazada l = calcularSucesion(num);
	l.comenzar();
   	System.out.println(l.proximo());
	 
   while (!l.fin()) {
	   
      	System.out.println(l.proximo());

			
		}	
	
	
}
}