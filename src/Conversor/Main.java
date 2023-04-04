package Conversor;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		OpcionesConversion monedas = new OpcionesConversion();
		ConvertirTemperatura temp = new ConvertirTemperatura();

		while (true) {

			String opciones = (JOptionPane.showInputDialog(null, "Menu de opciones ", "Conversor de divisas",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Conversor de ARS a","Conversor de moneda a ARS", "Conversor de temperatura" }, "Seleccion")).toString();

			switch (opciones) {
			case "Conversor de ARS a":
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de pesos a convertir: ");
				if (ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirARS(Minput);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Error - valor inválido");
				}
				break;

			case "Conversor de moneda a ARS":
				input = JOptionPane.showInputDialog("Ingresa el valor de la moneda a convertir: ");
				if (ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirMonedaARS(Minput);
					int respuesta = 0;
					respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if ((respuesta == 0) && (ValidarNumero(input) == true)) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Error - valor inválido");
				}
				break;
				
			case "Conversor de temperatura":
				JComboBox combo = new JComboBox();
					
				combo.addItem("Grados Celsius (°C) a");
				combo.addItem("Grados Fahrenheit (°F) a");
				combo.addItem("Grados Kelvin (K) a");
				JOptionPane.showMessageDialog(null,combo);

				if (combo.getSelectedIndex() == 0) {
					temp.convertirCelsius();
				} else if (combo.getSelectedIndex() == 1) {
					temp.convertirFahrenheit();
				}else if(combo.getSelectedIndex()==2) {
					temp.convertirKelvien();
				}
				break;
			}
		}
	}

	public static boolean ValidarNumero(String input) {
		return input.matches("[0-9]*");
	}

}
