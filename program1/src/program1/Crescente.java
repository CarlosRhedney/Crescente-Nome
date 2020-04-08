package program1;

import javax.swing.JOptionPane;

public class Crescente {
	/**
	 * @autor Carlos Rhedney
	 */

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int i, j, num;
		for(i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número"));
		}
		for(i = 0; i < 10; i++) {
			for(j = i+1; j < 10; j++) {
				if(numeros[i] > numeros[j]) {
					num = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = num;
				}
			}
		}

	}

}
