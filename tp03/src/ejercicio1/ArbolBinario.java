package tp03.ejercicio1;

import ej2.$missing$;
import ej2.ArbolBinario;
import tp02.ejercicio2.*;
public class ArbolBinario<T> {

	private NodoBinario<T> raiz;

	public ArbolBinario(T dato) {
		this.raiz = new NodoBinario<T>(dato);
	}

	private ArbolBinario(NodoBinario<T> nodo) {
		this.raiz = nodo;
	}

	private NodoBinario<T> getRaiz() {
		return raiz;
	}

	public T getDatoRaiz() {
		if (this.getRaiz() != null) {
			return this.getRaiz().getDato();
		} else {
			return null;
		}
	}

	public ArbolBinario<T> getHijoIzquierdo() {
		return new ArbolBinario<T>(this.raiz.getHijoIzquierdo());
	}

	public ArbolBinario<T> getHijoDerecho() {
		return new ArbolBinario<T>(this.raiz.getHijoDerecho());
	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.raiz.setHijoIzquierdo(hijo.getRaiz());
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.raiz.setHijoDerecho(hijo.getRaiz());
	}

	public void eliminarHijoIzquierdo() {
		this.raiz.setHijoIzquierdo(null);
	}

	public void eliminarHijoDerecho() {
		this.raiz.setHijoDerecho(null);
	}

	public boolean esVacio() {
		return this.getDatoRaiz() == null;
	}

	public boolean esHoja() {
		return this.getDatoRaiz() != null && this.getHijoIzquierdo().esVacio() && this.getHijoDerecho().esVacio();
	}
	
	public int contarHojas() {
		if (this.esVacio()) {
			return 0;
		} else { 
			if (this.esHoja()) {
				return 1;
			}else {
				return (this.getHijoIzquierdo().contarHojas() + this.getHijoDerecho().contarHojas());
			}
			
		}
		
		}
	public ArbolBinario<Integer> arbolEspejo(){
		ArbolBinario<Integer> answer;
		if(this.esVacio()) {
			answer = new ArbolBinario<Integer>(null);
		} else {
			answer = new ArbolBinario<Integer>(this.getDatoRaiz());
			answer.agregarHijoDerecho(arbolEspejo(this.getHijoIzquierdo());
			answer.agregarHijoIzquierdo(arbolEspejo(this.getHijoDerecho()));
		}
			return answer;
		}
		
}  