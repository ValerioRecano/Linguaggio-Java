package Polinomio1g;

public class Polinomio1G {
	protected int a0;
	protected int a1;

public Polinomio1G(int a0){
	this.a0=a0;	
}
public Polinomio1G(int a0,int a1){
	this.a0=a0;
	this.a1=a1;
	
}
public String toString(){
	return Integer.toString(this.a0,this.a1);
}
public float solution(){
	
	if(this.a0==0){
		return 0;
	}else{
	this.a0=this.a0*-1;
	float result;
	result=(float)this.a0/(float)this.a1;
	return result;
	}
	}
}
