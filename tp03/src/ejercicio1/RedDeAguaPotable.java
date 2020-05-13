package tp02.ejercicio1;

import tp02.ejercicio2.ListaGenerica;

public class RedDeAguaPotable {
	ArbolGeneral<Double> arbolRed;
	public RedDeAguaPotable(ArbolGeneral<Double> arbolRed) {
		super();
		this.arbolRed = arbolRed; //upcasting?
		
		
	public double minimoCaudal(double valorCaudal) {
		if (arbolRed.esHoja()) {
			return valorCaudal;
		} else {
			ListaGenerica<ArbolGeneral<Double>> hijos = arbolRed.getHijo();
			double min = valorCaudal;
			double calculado = 0;
			hijos.comenzar();
			while (!hijos.fin()) {
				 ArbolGeneral<Double> unHijo= hijos.proximo();
				 RedDeAguaPotable subRed = new RedDeAguaPotable(unHijo);
				 calculado = subRed.minimoCaudal(valorCaudal/hijos.tamanio());
				 if(calculado < min)
					 min = calculado;
			}
			return min;
		}
	}
	public double minimoCaudal2(double valorcaudal) {
		double[] resultado = {valorCaudal};
		minimoCaudal2(valorCaudal, resultado);
		return resultado[0];
	}
	
	private void minimoCaudal2 (double valorCaudal, double[] resultMin) {
		if (arbolRed.esHoja()) {
			if( resultMin[0] > valorCaudal)
				resultmin[0] = valorCaudal;
		}else {
			ListaGenerica<Double> hijos = arbolRed.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {
				ArbolGeneral<Double> unHijo = hijos.proximo();
				RedDeAguaPotable subRed = new RedDeAguaPotable(unHijo);
				subRed.minimoCaudal2(valorCaudal/hijos.tamanio(), resultMin);
			}
		}
	}
	}

}
