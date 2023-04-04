package Conversor;

import javax.swing.JOptionPane;

public class OpcionesConversion {

	ConvertirMonedas pesosARS = new ConvertirMonedas();
	ConvertirMonedas ARSMoneda = new ConvertirMonedas();
	
    public void ConvertirARS(double pesos) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir ", "Moneda", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"ARS a Dolar", "ARS a Euro", "ARS a Libras","ARS a Yen Japones","ARS a Won Coreano"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "ARS a Dolar":
        	pesosARS.ConvertirARSaDolar(pesos);
        	break;
        case "ARS a Euro":
        	pesosARS.ConvertirARSaEuros(pesos);
        	break;
        case "ARS a Libras":
        	pesosARS.ConvertirARSaALibra(pesos);
        	break;
        case "ARS a Yen Japones":
        	pesosARS.ConvertirARSaYen(pesos);
        	break;
        case "ARS a Won Coreano":
        	pesosARS.ConvertirARSaWon(pesos);
        	break;    	    	                          
        }      
    }
    
    public void ConvertirMonedaARS(double moneda) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la opcion a convertir ", "Pesos ARS", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"Dolar a ARS", "Euro a ARS", "Libras a ARS","Yen Japones a ARS","Won Coreano a ARS"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "Dolar a ARS":
        	ARSMoneda.ConvertirDolaresaPesos(moneda);;
        	break;
        case "Euro a ARS":
        	ARSMoneda.ConvertirEurosaPesos(moneda);;
        	break;
        case "Libras a ARS":
        	ARSMoneda.ConvertirLibraPesos(moneda);;
        	break;
        case "Yen Japones a ARS":
        	ARSMoneda.ConvertirYenaPesos(moneda);;
        	break;
        case "Won Coreano a ARS":
        	ARSMoneda.ConvertirWonaPesos(moneda);;
        	break;    	    	                          
        }
    }
    
    public void ConvertirKilometraje() {
    	
    }
}