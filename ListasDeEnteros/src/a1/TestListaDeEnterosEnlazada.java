package a1;
import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {
	public static void imprimirInverso (ListaDeEnterosEnlazada lista) {
		if(!lista.fin()) { 
			int dato = lista.proximo();
			imprimirInverso(lista);
			System.out.println(dato);}
	}
	public static void main(String[] args) {
		ListaDeEnterosEnlazada a = new ListaDeEnterosEnlazada();
		for (int i = 0; i < args.length; i++) {
		a.agregarFinal(Integer.parseInt(args[i]));
		}	
		
       	a.comenzar();
       	System.out.println(a.proximo());
		 
       while (!a.fin()) {
    	   
          	System.out.println(a.proximo());

				
			}	
       a.comenzar();
      
       for(int i=1;i==a.tamanio();i++) {
		
    	   System.out.println(a.proximo());
		}
       imprimirInverso(a);
       
		
		
	
}
}