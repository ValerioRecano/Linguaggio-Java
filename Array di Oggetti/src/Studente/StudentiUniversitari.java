package Studente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StudentiUniversitari {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String a;
		String b;
		int c;
		int d=0;
		String f;
		int g;
		InputStreamReader In = new InputStreamReader(System.in);
		BufferedReader Tastiera = new BufferedReader(In);
		System.out.println("Inserisci Numero Studenti:");
		g=Integer.parseInt(Tastiera.readLine());
		Studente Studenti[]= new Studente[g];
		
		for(int j=0;j<g;j++){
		
		System.out.println("Inserisci Nome studente"+(j+1)+": ");
		a=Tastiera.readLine();
		System.out.println("Inserisci Cognome studente"+(j+1)+": ");
		b=Tastiera.readLine();
		System.out.println("Inserisci Matricola studente"+(j+1)+": ");
		c=Integer.parseInt(Tastiera.readLine());
		System.out.println("Inserisci Codice Fiscale studente"+(j+1)+": ");
		f=Tastiera.readLine();
		Studenti [j] = new Studente(a,b,c,f);
		System.out.println("Quanti esami hai effettuato? ");
		d=Integer.parseInt(Tastiera.readLine());
		Studenti[j].setEsami(d);
		System.out.println("____________________________________");
		System.out.println("");
		
		
		}
		for(int i=0; i<g; i++){
		System.out.println("Scheda Universitaria Studente"+(i+1)+":");	
		System.out.println("");
		System.out.println("Nome: "+Studenti[i].getNome());
		System.out.println("Cognome: "+Studenti[i].getCognome());
		System.out.println("Matricola: "+Studenti[i].getMatricola());
		System.out.println("Esami Effettuati: "+Studenti[i].getEsami());
		System.out.println("____________________________________");
		System.out.println("");
		
		}
		

	}
	}


