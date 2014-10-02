package Rubrica;

public class Rubrica {
	
	private String nomerubrica[]; 
	private int numerorubrica[];
	private int posizione;
	
	public Rubrica (String nominativo, int numero){
		nominativo=nomerubrica[posizione];
		numero=numerorubrica[posizione];
	}
	public int trovaNumero(String nominativo){
		return numerorubrica[posizione];
	}
	public boolean inserisci (String nominativo, int numero){
		if (numerorubrica[posizione]!=0){
			return false;
		} else return true;
	}
	public int getDimensione(){
		return numerorubrica.length;
	}
}




