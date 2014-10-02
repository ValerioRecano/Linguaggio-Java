import java.io.*;

public class CaricamentoArray {

	
	public static void main(String[] args)throws NumberFormatException, IOException {
		int vect[]= new int[10];
		InputStreamReader In = new InputStreamReader(System.in);
		BufferedReader Tastiera = new BufferedReader(In);
		for(int i = 0;i<10; i++ ){
			System.out.println("Immetti numero: ");
			vect[i]=Integer.parseInt(Tastiera.readLine());
		}
		for(int i = 0;i<10; i++ ){
			System.out.println("v["+i+"] = "+vect[i]);
		}
	}

}
