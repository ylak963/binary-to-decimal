package es.studium.BinarioAdecimal;

import java.util.Scanner;

public class BinarioAdecimal {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0, e = 0, resultado;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el valor de la primera cifra:");
		e=teclado.nextInt();
		System.out.println("Introduce el valor de la segunda cifra:");
		d=teclado.nextInt();
		System.out.println("Introduce el valor de la tercera cifra:");
		c=teclado.nextInt();
		System.out.println("Introduce el valor de la cuarta cifra:");
		b=teclado.nextInt();
		System.out.println("Introduce el valor de la quinta cifra:");
		a=teclado.nextInt();
	
		resultado=funConversion(a,b,c,d,e);
		System.out.println("El número introducido en decimal vale:" +" "+ resultado);
		
		teclado.close();
	}

	private static int funConversion(int a, int b, int c, int d, int e) {
		int resultado=0;
		resultado=(e*16)+(d*8)+(c*4)+(b*2)+(a*11);
		return (resultado);
	}

}
