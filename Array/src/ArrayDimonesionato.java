
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayDimonesionato {

	
	public static void main(String[] args)throws NumberFormatException, IOException {
		
		InputStreamReader In = new InputStreamReader(System.in);
		BufferedReader Tastiera = new BufferedReader(In);
		System.out.println("Definisci la Grandezza dell'Array...");
		int c;
		c=Integer.parseInt(Tastiera.readLine());
		int a[]= new int[c];
		for(int i = 0;i<c; i++ ){
			System.out.println("Immetti numero: ");
			a[i]=Integer.parseInt(Tastiera.readLine());
		}
		for(int i = 0;i<c; i++ ){
			System.out.println("v["+i+"] = "+a[i]);
		}
	}

}