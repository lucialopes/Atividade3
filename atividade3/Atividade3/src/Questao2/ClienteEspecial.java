package Questao2;

public class ClienteEspecial extends ContaCorrente {

	public void sacar(double valor) {
		if (saldo < valor) 
			System.out.println(" Saldo insuficiente");
			else {
					saldo -= valor;
					saldo -= 0.1 / 100 * valor; // taxa de 0.1%
				}
			}
	}
