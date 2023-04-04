package Conversor;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public void convertirCelsius() {
		JComboBox comb=new JComboBox();
		comb.addItem("a Kelvin");
		comb.addItem("a Fahrenheit");
		comb.addItem("-- Salir --");
				
	
		do {
			JOptionPane.showMessageDialog(null, comb);
  
			switch(comb.getSelectedIndex()) {
			case 0:
				String valor=JOptionPane.showInputDialog("Ingrese la cantiad");
				if(!validarNumero(valor.trim())) {
					JOptionPane.showMessageDialog(null, "Solo número sin espacio");
				}else {
					double result = Double.parseDouble(valor);
					double resultado = result + 273.15;
					JOptionPane.showMessageDialog(null,valor+" °C"+" cambiados a"+ resultado +" K");
				}
				break;
			case 1:
				valor=JOptionPane.showInputDialog("Ingrese la cantiad");
				if(!validarNumero(valor.trim())) {
					JOptionPane.showMessageDialog(null, "Solo numero sin espacio");
				}else {
					double result = Double.parseDouble(valor);
					double resultado = (result * (9/5) + 32);
					JOptionPane.showMessageDialog(null,valor+" °C"+" cambiados a "+ resultado +" °F");
				}
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "FIN del programa");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Dato no valido");
				break;
			}
			
		}while(comb.getSelectedIndex()!=2);
	}
	
	public void convertirKelvien() {
		JComboBox comb1=new JComboBox();
		comb1.addItem("a Celcius");
		comb1.addItem("a Fahrenheit");
		comb1.addItem("-- Salir --");
				
	
		do {
			JOptionPane.showMessageDialog(null, comb1);
  
			switch(comb1.getSelectedIndex()) {
			case 0:
				String valor=JOptionPane.showInputDialog("Ingrese la cantiad");
				if(!validarNumero(valor.trim())) {
					JOptionPane.showMessageDialog(null, "Solo número sin espacio");
				}else {
					double result = Double.parseDouble(valor);
					double resultado = result - 273.15;
					JOptionPane.showMessageDialog(null,valor+" K"+" cambiados a"+ resultado +" °C");
				}
				break;
			case 1:
				valor=JOptionPane.showInputDialog("Ingrese la cantiad");
				if(!validarNumero(valor.trim())) {
					JOptionPane.showMessageDialog(null, "Solo numero sin espacio");
				}else {
					double result = Double.parseDouble(valor);
					double resultado = ((result - 273.15) * (9/5) + 32);
					JOptionPane.showMessageDialog(null,valor+" K"+" cambiados a "+ resultado +" °F");
				}
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "FIN del programa");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Dato no valido");
				break;
			}
			
		}while(comb1.getSelectedIndex()!=2);
	}
	
	public void convertirFahrenheit() {
		JComboBox comb2=new JComboBox();
		comb2.addItem("a Celcius");
		comb2.addItem("a Kelvin");
		comb2.addItem("-- Salir --");
				
	
		do {
			JOptionPane.showMessageDialog(null, comb2);
  
			switch(comb2.getSelectedIndex()) {
			case 0:
				String valor=JOptionPane.showInputDialog("Ingrese la cantiad");
				if(!validarNumero(valor.trim())) {
					JOptionPane.showMessageDialog(null, "Solo número sin espacio");
				}else {
					double result = Double.parseDouble(valor);
					double resultado = (result - 32) * (5/9);
					JOptionPane.showMessageDialog(null,valor+" °F"+" cambiados a"+ resultado +" °C");
				}
				break;
			case 1:
				valor=JOptionPane.showInputDialog("Ingrese la cantiad");
				if(!validarNumero(valor.trim())) {
					JOptionPane.showMessageDialog(null, "Solo numero sin espacio");
				}else {
					double result = Double.parseDouble(valor);
					double resultado = ((result - 32) * (9/5) / 273.15);
					JOptionPane.showMessageDialog(null,valor+" °F"+" cambiados a "+ resultado +" K");
				}
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "FIN del programa");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Dato no valido");
				break;
			}
			
		}while(comb2.getSelectedIndex()!=2);
	}
	
	public boolean validarNumero(String datos) {
		try {
			double x = Double.parseDouble(datos);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
 	}
}
