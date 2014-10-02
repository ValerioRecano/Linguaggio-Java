package ContoCorrente;

public class TestCC {

	public static void main(String[] args) {
		ContoCorrente cc1= new ContoCorrente("Mario","Rossi",1000);
		ContoCorrente cc2= new ContoCorrente("Tizio","Caio", 2000);
		cc1.print();
		cc2.print();
		cc1.preleva(500);
		cc2.deposita(500);
		cc1.print();
		cc2.print();
		
	}

}
