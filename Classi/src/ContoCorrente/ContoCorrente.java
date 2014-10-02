package ContoCorrente;

public class ContoCorrente {
	private String NomeI;
	private String CognomeI;
	private long nCC;
	private double Sresiduo;
	private static long contatoreCC=1;


	public ContoCorrente(String nome, String cognome,double saldo){
	NomeI=nome;
	CognomeI=cognome;
	nCC=contatoreCC;
	Sresiduo=saldo;
	contatoreCC++;
}
	public void deposita (double importo){
		Sresiduo=Sresiduo+importo;
	}
	public void preleva (double importo){
		Sresiduo=Sresiduo-importo;
	}
	public void print(){
		System.out.println("l'intestatario del C/C n°"+nCC+" è: "+NomeI+" "+CognomeI+" con saldo pari a "+Sresiduo+" €");
			
	}
}