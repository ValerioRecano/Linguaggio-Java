import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Intero {

	public static void main(String[] args) throws IOException {
		InputStreamReader In = new InputStreamReader(System.in);
		BufferedReader Tastiera = new BufferedReader(In);
		int a;
		System.out.print("Immetti numero: ");
		a=Integer.parseInt(Tastiera.readLine());
		
		System.out.println("il numero è: "+a);
		}
	}