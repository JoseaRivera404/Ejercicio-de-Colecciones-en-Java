import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(35);
		numeros.add(33);
		numeros.add(42);
		numeros.add(10);
		numeros.add(14);
		numeros.add(19);
		numeros.add(27);
		numeros.add(44);
		numeros.add(26);
		numeros.add(31);
		numeros.add(33);
		System.out.println(numeros.size());
		System.out.println(numeros.get(2)); 
		// numeros.clear();
		System.out.println(numeros.isEmpty());
		
		System.out.println(numeros.indexOf(33));
		System.out.println(numeros.lastIndexOf(33));
		
		System.out.println(numeros.contains(44));
		numeros.add(6, 21);
		System.out.println(numeros.size());
		System.out.println(numeros.get(6));
		System.out.println(numeros.get(7));
		System.out.println(numeros.set(11, 23));
		System.out.println(numeros.get(11));
		
		System.out.println(numeros.remove(3));
		System.out.println("======================================");
//		for (Integer num: numeros) {
//			System.out.println(num);
//		}
		numeros.forEach((num)-> imprimirParesImpares(num));
		
	}

	private static void imprimirParesImpares(Integer num) {
		if(num%2 == 0) {
			System.out.println(num + " es par");
		}else {
			System.out.println(num + " es impar");
		}
	}

}
