import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> autos = new HashSet<String>();
		System.out.println(autos.add("Volvo"));
		System.out.println(autos.add("BMW"));
		System.out.println(autos.add("VW"));
		System.out.println(autos.add("Ford"));
		System.out.println(autos.add("Audi"));
		System.out.println(autos.add("BMW"));
		
		System.out.println(autos.size());
		System.out.println(autos.contains("BMW"));
		System.out.println(autos.isEmpty());
		System.out.println("===========================");
//		for (String auto:autos) {
//			System.out.println(auto);
//		}
		HashSet<String> pc = new HashSet<String>();
		pc.add("Lenovo");
		pc.add("HP");
		pc.add("Acer");
		pc.add("DELL");
		pc.add("Gateway");
		pc.add("Compaq");
		pc.add("Toshiba");
		pc.add("VAIO");
		pc.add("Apple");
		pc.add("ASUS");
		
		autos.forEach((marca)-> mostrarMarcas(marca));
		System.out.println("*******************************************");
		pc.forEach((marca)-> mostrarMarcas(marca));
		
	}
	
	private static void mostrarMarcas(String marca) {
		System.out.println("+---------------------------");
		System.out.println("| " + marca);
		System.out.println("+---------------------------");
	}

}
