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

public class ConversorMoeda{
	
	public void ConverterReaisADolar(double valor) {
		double moedaDolar = valor/ 5.23;
		moedaDolar = (double) Math.round(moedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem US$ "+moedaDolar+"Dolares");
	}
	
	public void ConverterReaisAEuro(double valor) {
		double moedaEuro = valor/ 5.50;
		moedaEuro = (double) Math.round(moedaEuro*100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem US$ "+moedaEuro+"Euros");
	}
	
	
}