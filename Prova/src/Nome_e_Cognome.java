import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Nome_e_Cognome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader In = new InputStreamReader(System.in);
		BufferedReader Tastiera = new BufferedReader(In);
		String cognome,nome;
		System.out.print("Immetti cognome: ");
		cognome=Tastiera.readLine();
		System.out.print("Immetti nome: ");
		nome=Tastiera.readLine();
		System.out.println("Sono "+cognome+" "+nome);
		}
	}