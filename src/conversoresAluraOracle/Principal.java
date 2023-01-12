/**
 * 
 */
/**
 * @author aelso
 * documentação- https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
 * Java Sprint 01 Live Coding Conversor de Moedas -> https://www.youtube.com/watch?v=cj0fu9VpH_E
 */
package conversoresAluraOracle;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Funcao moeda = new Funcao();
		String opcoes = JOptionPane.showInputDialog(null, "Escolha opção", "Menu", JOptionPane.INFORMATION_MESSAGE,
				null, new Object[] { "Conversor de Moeda", "Conversor de Temperatura" }, "Escolha").toString();

		switch (opcoes) {
			case "Conversor de Moeda":
				try {
					String input = JOptionPane.showInputDialog("Insira o valor");
					double valorRecebido = Double.parseDouble(input);
					moeda.ConversorMoedas(valorRecebido);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor inserido inválido", "Erro", JOptionPane.ERROR_MESSAGE);
				}
				break;
			case "Conversor de Temperatura":
				try {
					String input = JOptionPane.showInputDialog("Insira o valor");
					double valorRecebido = Double.parseDouble(input);
					String opcao = JOptionPane.showInputDialog(null, "Escolha a unidade a ser convertida", "Menu",
							JOptionPane.INFORMATION_MESSAGE,
							null, new Object[] { "Celsius para Fahrenheit", "Fahrenheit para Celsius" }, "Escolha")
							.toString();
					if (opcao.equals("Celsius para Fahrenheit")) {
						moeda.converteCelsiusParaFahrenheit(valorRecebido);
					} else if (opcao.equals("Fahrenheit para Celsius")) {
						moeda.converteFahrenheitParaCelsius(valorRecebido);
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor inserido inválido", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			default:
				break;
		}
	}
}
