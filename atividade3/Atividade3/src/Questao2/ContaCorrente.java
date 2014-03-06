package Questao2;

public class ContaCorrente {

	
	protected double saldo = 0;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor){
		saldo += valor;
	}

	public void sacar (double valor){
		if (saldo < valor) {
        System.out.println("Saldo insuficiente");
        } else {
        	saldo -= valor;
        	saldo -= 0.5 / 100 * valor; // taxa debatida
        }
	}

	

	@Override
	public String toString() {
	return "Saldo: " + saldo;
	}
}
