import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Trapezio {

	public static void main(String[] args) throws IOException {
	InputStreamReader In = new InputStreamReader(System.in);
	BufferedReader Tastiera = new BufferedReader(In);
	double BASE, base, Altezza;
	double Area;
	System.out.println("Calcolo Area Trapezio");
	System.out.println("inserire la base maggiore: ");
	BASE = Integer.parseInt(Tastiera.readLine());
	System.out.println("inserire la base minore: ");
	base = Integer.parseInt(Tastiera.readLine());
	System.out.println("inserire l'altezza: ");
	Altezza = Integer.parseInt(Tastiera.readLine());
	Area = ((BASE+base)/2)*Altezza;
	System.out.println("L'area del Trapezio e' "+Area);
	
	}

}
