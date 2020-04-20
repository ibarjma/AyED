package a1;
import tp02.ejercicio1.ListaDeEnterosConArreglos;

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		ListaDeEnterosConArreglos a = new ListaDeEnterosConArreglos();
		
		a.agregarFinal(2);
		a.agregarFinal(3);
		a.agregarFinal(4);
		a.agregarFinal(5);
		a.agregarFinal(6);
		a.comenzar();
		while(!a.fin()) {
		 System.out.println(a.proximo());
}
		a.comenzar();
		for(int i=0;i==a.tamanio();i++) {
			 System.out.println(a.proximo());
}
}}