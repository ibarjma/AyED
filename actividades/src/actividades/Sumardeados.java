package actividades;
import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class Sumardeados {
	static Integer actual1; 
	static Integer actual2;
	public static ListaDeEnterosEnlazada lista1;
	public static ListaDeEnterosEnlazada lista2;

public static void main(String[] args) {
	int a = 1;
	int b=10;
	ListaDeEnterosEnlazada lista1= new ListaDeEnterosEnlazada(); 
	ListaDeEnterosEnlazada lista2= new ListaDeEnterosEnlazada(); 
	for (var i=1;i==10;i++) {
		lista1.agregarFinal(a);
		lista2.agregarFinal(b);
		a++;
		b++;	
	}
	lista1.comenzar();
	lista2.comenzar();
	while(!lista1.fin()){
		actual1 = lista1.proximo();
		actual2= lista2.proximo();
		ListaDeEnterosEnlazada answer= new ListaDeEnterosEnlazada(); 
		answer.agregarFinal(actual1+actual2); 
	}}}
