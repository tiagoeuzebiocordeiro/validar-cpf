package com.br.utils;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Validar {

	public static void main(String[] args) {
		
	/*Customização do JOptionPane*/	
	UIManager.put("OptionPane.cancelButtonText", "Cancelar");
	UIManager.put("OptionPane.noButtonText", "Não");
	UIManager.put("OptionPane.okButtonText", "OK");
	UIManager.put("OptionPane.yesButtonText", "Sim");
	
	
		int resposta;
		do {
	
		String cpf = JOptionPane.showInputDialog("Informe o CPF");
		                         
		char n1 = cpf.charAt(0);
		char n2 = cpf.charAt(1);
		char n3 = cpf.charAt(2);
		char n5 = cpf.charAt(4);
		char n6 = cpf.charAt(5);			/*pegando os numeros do cpf no string*/
		char n7 = cpf.charAt(6);
		char n8 = cpf.charAt(8);
		char n9 = cpf.charAt(9);
		char n10 = cpf.charAt(10);
		char n11 = cpf.charAt(12);
		char n12 = cpf.charAt(13);
		
		int n1Valor = Character.getNumericValue(n1);
		int n2Valor = Character.getNumericValue(n2);
		int n3Valor = Character.getNumericValue(n3);
		int n5Valor = Character.getNumericValue(n5);
		int n6Valor = Character.getNumericValue(n6); /*Convertendo para inteiro*/
		int n7Valor = Character.getNumericValue(n7);
		int n8Valor = Character.getNumericValue(n8);
		int n9Valor = Character.getNumericValue(n9);
		int n10Valor = Character.getNumericValue(n10);
		int n11Valor = Character.getNumericValue(n11);
		int n12Valor = Character.getNumericValue(n12);

		int verificacao1 = (n1Valor * 1) + (n2Valor * 2) +  (n3Valor * 3) + 
				(n5Valor * 4) + (n6Valor * 5) + (n7Valor * 6) + 
				(n8Valor * 7) + (n9Valor * 8) + (n10Valor * 9);
		
		int b1 = verificacao1 % 11;
																			/*Cálculos*/
		if (b1 % 11 == 10) {
			b1 = 0;
		}
		
		int verificacao2 = (n1Valor * 9) + (n2Valor * 8) +  (n3Valor * 7) + 
				(n5Valor * 6) + (n6Valor * 5) + (n7Valor * 4) + 
				(n8Valor * 3) + (n9Valor * 2) + (n10Valor * 1);
		
		int b2 = verificacao2 % 11;
		if (b2 % 11 == 10) {
			b2 = 0;
		}
		
		if (b1 == n11Valor && b2 == n12Valor) {
			JOptionPane.showMessageDialog(null, "CPF Valido");
		} else {
			JOptionPane.showMessageDialog(null, "CPF invalido");
		}
			resposta = JOptionPane.showConfirmDialog(null, "Deseja repetir a operação?");
			if (resposta == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Você escolheu sair.");
			} else if (resposta == JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "Operação cancelada");
			}
			  
		} while (resposta == JOptionPane.YES_OPTION);
		
	}
}
//}
