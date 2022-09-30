package Ej5;

public class Ej5App {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int var_intermedia;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("c = " +c);
		System.out.println("d = " +d);
		
		var_intermedia=b;
		b = c;
		c = a;
		a = d;
		d = var_intermedia;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("c = " +c);
		System.out.println("d = " +d);
				
	}

}
