package Persona;


public class Studente extends Persona{
	private int matricola;
	private int esami;
	public Studente(String nome, String cognome, int matricola){
		super(nome,cognome);
		this.matricola=matricola;
	}
	public int getMatricola(){
	return matricola;
	}
	public void setEsami(int esami){
		this.esami=esami;
	}
	public int getEsami(){
		return esami;
	}

}



