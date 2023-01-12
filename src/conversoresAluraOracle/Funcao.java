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

public class Funcao{
	
	ConversorMoeda moedas = new ConversorMoeda();
	
    public void ConversorMoedas (double valorRecebido) {
        String opcao = JOptionPane.showInputDialog(null,
			"Escolha a moeda para qual você deseja converter", "Moedas", JOptionPane.INFORMATION_MESSAGE, null,
			new Object[]{"De Reais para Dólares","De Reais para Euros"}, null).toString();
			
		switch(opcao) {
			case "De Reais para Dólares":
				moedas.ConverterReaisADolar(valorRecebido);
				break;
			case "De Reais para Euros":
				moedas.ConverterReaisAEuro(valorRecebido);
				break;
		}
	}
}
