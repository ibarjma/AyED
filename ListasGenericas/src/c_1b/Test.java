package c_1b;
public class Test {

	public static void main(String[] args) {
		Estudiante[] arrae = new Estudiante[2];
		arrae[0] = new Estudiante();
		arrae[0].setNombre("manuel");
		arrae[0].setApellido("ibarra");
		arrae[0].setComision("2");
		arrae[0].setEmail("sdfasdasd");
		arrae[0].setDireccion("23 n2589");
		arrae[1] = new Estudiante();
		arrae[1].setNombre("caca");
		arrae[1].setApellido("olarra");
		arrae[1].setComision("6");
		arrae[1].setEmail("el+kpohotmail.com");
		arrae[1].setDireccion("56 n4545");
		System.out.println(arrae[0].toString());
		System.out.println(arrae[1].tusDatos(arrae[1]));		
		
	}
}
