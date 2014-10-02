
import javax.swing.*;

public class Nome_e_Cognome_OPanel {
	public static void main(String[] args){
		String nome = JOptionPane.showInputDialog("Inserisci Nome");
		String cognome = JOptionPane.showInputDialog("Inserisci Cognome");
		String testo = "Ciao "+nome+" "+cognome;
		JOptionPane.showMessageDialog(null,testo);
	}
}