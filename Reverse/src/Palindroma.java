import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Palindroma {

	public static void main(String[] args) throws IOException {
		InputStreamReader In = new InputStreamReader(System.in);
		BufferedReader Tastiera = new BufferedReader(In);
		System.out.print("Immetti testo: ");
		String miotesto;
		miotesto=Tastiera.readLine();
		for(int dx = miotesto.length()-1;dx>=0;dx--){
			System.out.print(miotesto.charAt(dx));
			
		}
		

}
}
