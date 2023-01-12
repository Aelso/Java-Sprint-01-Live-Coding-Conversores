package conversoresAluraOracle;

public class ConversordeTemperatura {
    
    public void converteCelsiusParaFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        JOptionPane.showMessageDialog(null, celsius + " graus Celsius é equivalente a " + fahrenheit + " graus Fahrenheit.");
    }

    public void converteFahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        JOptionPane.showMessageDialog(null, fahrenheit + " graus Fahrenheit é equivalente a " + celsius + " graus Celsius.");
    }
}
    
}
