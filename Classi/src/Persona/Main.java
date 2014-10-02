package Persona;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		String a;
		String b;
		int c;
		int d=0;
		InputStreamReader In = new InputStreamReader(System.in);
		BufferedReader Tastiera = new BufferedReader(In);
		System.out.println("Inserisci Nome:");
		a=Tastiera.readLine();
		System.out.println("Inserisci Cognome:");
		b=Tastiera.readLine();
		System.out.println("Inserisci Matricola:");
		c=Integer.parseInt(Tastiera.readLine());
		Studente p = new Studente(a,b,c);
		System.out.println("Quanti esami hai effettuato? ");
		d=Integer.parseInt(Tastiera.readLine());
		p.setEsami(d);
		String esami[]= new String[d];
		for(int i=0;i<d;i++){
			System.out.println("Inserisci esame n°"+(i+1));
			esami[i]=Tastiera.readLine();
		}
		System.out.println("La Tua Scheda Universitaria:");	
		System.out.println("");
		System.out.println("Nome: "+p.getNome());
		System.out.println("Cognome: "+p.getCognome());
		System.out.println("Matricola: "+p.getMatricola());
		System.out.println("Esami Effettuati: "+p.getEsami());
		for(int i=0; i<d; i++){
			System.out.print("esame n°"+(i+1)+"=");
			System.out.println(esami[i]);
		}
		

	}

}
