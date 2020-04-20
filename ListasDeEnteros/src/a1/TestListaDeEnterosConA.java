package a1;
import tp02.ejercicio1.ListaDeEnterosConArreglos;
public class TestListaDeEnterosConA {
	public static void main(String[] args) {
		ListaDeEnterosConArreglos a = new ListaDeEnterosConArreglos();
		for (int i = 0; i < args.length; i++) {
			   a.agregarFinal(Integer.parseInt(args[i]));
			
		}	
		a.comenzar();
		while(!a.fin()) {
			 System.out.println(a.proximo());
	}
		
		a.comenzar();

		for(int i=1;i==a.tamanio();i++) {
		System.out.println(a.proximo());}
		}} 