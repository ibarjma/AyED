package ej2tp2;
import c_1b.Estudiante;
import tp02.ejercicio2.ListaEnlazadaGenerica;
public class TestListaEnlazadaGenerica {
	
public static void main(String[] args) {	
	Estudiante a = new Estudiante();
	a.setNombre("manuel");
	a.setApellido("ibarra");
	a.setComision("2");
	a.setEmail("sdfasdasd");
	a.setDireccion("23 n2589");
	Estudiante b = new Estudiante();
	b.setNombre("caca");
	b.setApellido("olarra");
	b.setComision("6");
	b.setEmail("el+kpohotmail.com");
	b.setDireccion("56 n4545");
	Estudiante c= new Estudiante();
	c.setNombre("jose");
	c.setApellido("lara");
	c.setComision("6");
	c.setEmail("sdasdasdasd5555sdasd");
	c.setDireccion("23 n258wer");
	Estudiante d = new Estudiante();
	d.setNombre("caaaaaaaa");
	d.setApellido("gergf");
	d.setComision("1");
	d.setEmail("easdil.com");
	d.setDireccion("ggggw2125");
	ListaEnlazadaGenerica<Estudiante> l = new ListaEnlazadaGenerica();
	l.agregarFinal(a);
	l.agregarFinal(b);
	l.agregarFinal(c);
	l.agregarFinal(d);
	l.comenzar();
	while(!l.fin()) {
	Estudiante e= new Estudiante();
	e = l.proximo();
	System.out.println(e.tusDatos(e));
	 
	}
	
	
	
	
	
}}

