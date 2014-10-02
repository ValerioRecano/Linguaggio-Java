package Studente;

public class Studente {
	private int matricola;
	private int esami;
	private String nome;
	private String cognome;
	private String cfisc;
	public Studente(String nome, String cognome, int matricola, String cfisc){
		
		this.nome=nome;
		this.cognome=cognome;
		this.cfisc=cfisc;
		this.matricola=matricola;
	}
	public String getNome(){
		return this.nome;
	}
	public String getCognome(){
		return this.cognome;
	}
	public int getMatricola(){
	return matricola;
	}
	public String getcfisc(){
		return cfisc;
	}
	public void setEsami(int esami){
		this.esami=esami;
	}
	public int getEsami(){
		return esami;
	}

}


