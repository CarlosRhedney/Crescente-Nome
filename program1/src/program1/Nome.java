package program1;

import javax.swing.JOptionPane;

public class Nome {
	/**
	 * @autor Carlos Rhedney
	 */
	public static void main(String[] args) {
		String nome = null;
		int resposta;
		nome = JOptionPane.showInputDialog("Qual seu nome?");
		resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + " ?");
		if(resposta == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "O seu nome é " + nome + " !");
			JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome + " !");
		}else {
			JOptionPane.showMessageDialog(null, "O seu nome não é " + nome + " !");
		}
	}

}
