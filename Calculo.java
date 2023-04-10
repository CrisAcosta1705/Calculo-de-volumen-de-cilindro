package Ejercicio;
import java.util.Scanner;
public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		double pi = 3.1416;
		double v;
		int r, h;
		
		System.out.println("Ingrese el radio del cilindro");
		r = tc.nextInt();
		
		System.out.println("Ingrese la altura del cilindro");
		h = tc.nextInt();
		
		v = pi*r*r*h;
		
		System.out.println("Radio del cilindro: "+r);
		System.out.println("Altura del cilindro: "+h);
		System.out.println("El volumen del cilindro es: "+v);
	}

}
