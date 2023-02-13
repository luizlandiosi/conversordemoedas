package ConversorMoedas;

import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class InterfaceDoConversor {
	
	public static void main(String[] args) {
			
		JOptionPane.showMessageDialog(null, "conversor de moedas");
		
		String[] escolhas = {"Real para Dólar", "Dólar para Real", "Real para Euro", "Euro para Real", 
				"Real para Libras Esterlinas", "Libras Esterlinas para Real", "Real para Peso Argentino", 
				"Peso Argentino para Real", "Real para Peso Chileno", "Peso Chileno para Real"};
		
	    
	     
	    String tipoConversao =  (String) JOptionPane.showInputDialog(null, "Escolha uma opção ", "Moeda", 
	    		 JOptionPane.PLAIN_MESSAGE, null, escolhas, 0); 
	    
	    
	    String valorDinheiro = JOptionPane.showInputDialog("Qual o valor a ser convertido? ", "Insira um valor");
		try { int valor = Integer.parseInt(valorDinheiro); }
		catch (NumberFormatException valor) {
			JOptionPane.showMessageDialog(null, "Digite somente números");
			System.exit(0);
		}
	    
	    
	    
	    int valorDinheiroEmInt = Integer.parseInt(valorDinheiro);
	    DecimalFormat df = new DecimalFormat("#,###.00");
	       if(tipoConversao == "Real para Dólar") {
	    	 
	    	 double valorMoeda = 5.48;
	    	 double conta = valorDinheiroEmInt / valorMoeda;
	    	 String valorFinal = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + "US$" + valorFinal);
	    	
	     } else if (tipoConversao == "Dólar para Real") {
	    	 double valorMoeda = 5.48;
	    	 double conta = valorMoeda * valorDinheiroEmInt;
	    	 String valorFinal = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + "R$" + valorFinal);
	     } else if (tipoConversao == "Euro para Real") {
	    	 double valorMoeda = 5.85;
	    	 double conta = valorMoeda * valorDinheiroEmInt;
	    	 String valorFinal = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + "R$" + valorFinal);
	    	 
	     } else if(tipoConversao == "Real para Euro") {
	    	 double valorMoeda = 5.85;
	    	 double conta = valorDinheiroEmInt / valorMoeda;
	    	 String valorFinal = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + "€" + valorFinal);
	     } else if (tipoConversao == "Real para Libras Esterlinas") {
	    	 double valorMoeda = 6.77;
	    	 double conta = valorDinheiroEmInt / valorMoeda;
	    	 String valorFinal = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + "£" + valorFinal);
	     } else if(tipoConversao == "Libras Esterlinas para Real") {
	    	 double valorMoeda = 6.77;
	    	 double conta = valorMoeda * valorDinheiroEmInt;
	    	 String valorFinal = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + "R$" + valorFinal);
	     } else if (tipoConversao == "Real para Peso Argentino") {
	    	 double valorMoeda = 0.031;
	    	 double conta = valorDinheiroEmInt / valorMoeda;
	    	 String valorFinal = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + "ARS$" + valorFinal);
	     } else if(tipoConversao == "Peso Argentino para Real") {
	    	 double valorMoeda = 0.031;
	    	 double conta = valorMoeda * valorDinheiroEmInt;
	    	 String valorFinal = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + "R$" + valorFinal);
	     } else if(tipoConversao == "Real para Peso Chileno") {
	    	 double valorMoeda = 0.0076;
	    	 double conta = valorDinheiroEmInt / valorMoeda;
	    	 String valorFinal = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + "CLP$" + valorFinal);
	     } else if(tipoConversao == "Peso Chileno para Real") {
	    	 double valorMoeda = 0.0076;
	    	 double conta = valorMoeda * valorDinheiroEmInt;
	    	 String valorFinal = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + "R$" + valorFinal);
	     }

	}

}

