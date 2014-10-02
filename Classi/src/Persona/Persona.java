package Persona;

public class Persona {

	protected String nome;
	protected String cognome;
	
	public Persona(String nome,String cognome){
		this.nome=nome;
		this.cognome=cognome;
	}
	
	public void setNome (String nome){
		this.nome=nome;
	}
	public String getNome(){
		return nome;
	}
	public void setCognome (String cognome){
		this.cognome=cognome;
	}
	public String getCognome(){
		return cognome;
	}
}

