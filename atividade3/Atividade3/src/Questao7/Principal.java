package Questao7;

import Questao2.ClienteEspecial;
import Questao2.ContaCorrente;

public class Principal {

	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaCorrente ce = new ClienteEspecial();
		
		
		cc.depositar(500);
		System.out.println(cc.getSaldo());
		try {
		cc.sacar(400);
		} catch (QualquerCoisaException f) {
			 f.printStackTrace();
		}
		System.out.println(cc.getSaldo());
		try {
		  cc.sacar(600);
		} catch (QualquerCoisaException f) {
		     f.printStackTrace();
		}

		//Testes com conta corrente especial
			ce.depositar(300);
		System.out.println(ce.getSaldo());
		try {
			ce.sacar(500);
		} catch (QualquerCoisaException f) {
		
			f.printStackTrace();
		}
		System.out.println(ce.getSaldo());
		try {
			ce.sacar(1900);
		} catch (QualquerCoisaException f) {
			f.printStackTrace();
		}


	}

}
