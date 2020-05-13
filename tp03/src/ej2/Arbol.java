package ej2;

public class Arbol {
	ArbolBinario<Integer> arbolContar;
	public Arbol(ArbolBinario<Integer> arbolContar) {
		super();
		this.arbolContar = arbolContar; //upcasting?- creo que downcasting
	}
	
	public static void main(String[] args) {
		ArbolBinario <Integer> arbolHoja7 = new ArbolBinario<Integer>(7);
		ArbolBinario <Integer> arbolHoja9 = new ArbolBinario<Integer>(9);
		ArbolBinario <Integer> arbolHoja2 = new ArbolBinario<Integer>(2);
		ArbolBinario <Integer> arbolRaiz3 = new ArbolBinario<Integer>(3);
		ArbolBinario <Integer> arbolRaiz5 = new ArbolBinario<Integer>(5);
		arbolRaiz3.agregarHijoIzquierdo(arbolHoja7);
		arbolRaiz3.agregarHijoDerecho(arbolHoja9);
		arbolRaiz5.agregarHijoDerecho(arbolRaiz3);
		arbolRaiz5.agregarHijoIzquierdo(arbolHoja2);
		System.out.println(arbolRaiz3.contarHojas());
		System.out.println(arbolRaiz5.contarHojas());
	}

		
	}



