package Conversor;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	public void ConvertirARSaDolar (double valor) {
		double dolar = valor * 0.0048;
		JOptionPane.showMessageDialog(null, "Tienes " + dolar + " Dolar");
	}
	public void ConvertirARSaEuros(double valor) {
		double euro = valor * 0.0044;
		JOptionPane.showMessageDialog(null, "Tienes " + euro + " Euro");
	}
	public void ConvertirARSaALibra(double valor) {
		double libra = valor * 0.0039;
		JOptionPane.showMessageDialog(null, "Tienes " + libra + " Libra esterlina");
	}
	public void ConvertirARSaYen(double valor) {
		double yen = valor * 0.64;
		JOptionPane.showMessageDialog(null, "Tienes " + yen + " Yen Japones");
	}
	public void ConvertirARSaWon(double valor) {
		double won = valor * 6.27;
		JOptionPane.showMessageDialog(null, "Tienes " + won + " Won sur Coreano");
	}
	
	
	
	public void ConvertirDolaresaPesos(double valor) {
		double monedaDolar = valor * 208.39;
        JOptionPane.showMessageDialog(null, "Tienes " +monedaDolar+ " Pesos");
	}
	
	public void ConvertirEurosaPesos(double valor) {
		double monedaEuro = valor * 226.53;
		JOptionPane.showMessageDialog(null, "Tienes " +monedaEuro+ " Pesos");
	}
	
	public void ConvertirLibraPesos(double valor) {
		double monedaLibra = valor * 257.26;
        JOptionPane.showMessageDialog(null, "Tienes " +monedaLibra+ " Pesos");
	}
	
	public void ConvertirYenaPesos(double valor) {
		double monedaYen = valor * 1.57;
        JOptionPane.showMessageDialog(null, "Tienes " +monedaYen+ " Pesos");
	}
	
	public void ConvertirWonaPesos(double valor) {
		double monedaWon = valor * 0.16;
        JOptionPane.showMessageDialog(null, "Tienes " +monedaWon+ " Pesos");
	}
	
}