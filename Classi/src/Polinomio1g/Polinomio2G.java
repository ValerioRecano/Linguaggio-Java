package Polinomio1g;


public class Polinomio2G extends Polinomio1G {
	protected int a2;
	
	public  Polinomio2G(int a2){
		super(a2);
		this.a2=a2;
	}
	public Polinomio2G(int a1, int a2){
		super(a1);
		this.a2=a2;	
	}
	public Polinomio2G(int a0, int a1, int a2){
		super(a0, a1);
		this.a2=a2;
	}
	public String toString(){
		return Integer.toString(this.a2);
	}
}


