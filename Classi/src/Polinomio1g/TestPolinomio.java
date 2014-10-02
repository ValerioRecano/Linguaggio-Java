package Polinomio1g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestPolinomio {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a;
		int b;
		int c;
		InputStreamReader In = new InputStreamReader(System.in);
		BufferedReader Tastiera = new BufferedReader(In);
		System.out.println("inserisci a1: ");
		b=Integer.parseInt(Tastiera.readLine());
		System.out.println("inserisci a0: ");
		a=Integer.parseInt(Tastiera.readLine());
		System.out.println("inserisci a2: ");
		c=Integer.parseInt(Tastiera.readLine());
		Polinomio2G p = new Polinomio2G(a,b,c);
		System.out.println("la soluzione di "+a+"x+"+b+"=0 è:----> x="+p.solution());

	}

}
