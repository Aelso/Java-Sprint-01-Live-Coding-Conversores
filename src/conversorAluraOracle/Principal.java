/**
 * 
 */
/**
 * @author aelso
 * documentação- https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
 * Java Sprint 01 Live Coding Conversor de Moedas -> https://www.youtube.com/watch?v=cj0fu9VpH_E
 */
package conversorAluraOracle;

import javax.swing.JOptionPane;

public static void main (String[] args) {
	Funcao moeda = new Funcao();
	String opcoes =JOptionPane.showInputDialog(null,"Escolha opção", "Menu",JOptionPane.INFORMATION_MESSAGE, null,new Object[]{"Conversor de Moeda","Conversor de Temperatura"},"Escolha").toString();
	
	switch(opcoes) {
	case "Conversor de Moeda":
		String input = JOptionPane.showInputDialog("Insira O valor");
		double valorRecebido = Double.parseDouble(input);
		moeda.ConverterMoedas(valorRecebido);
		
	}
}
