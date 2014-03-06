package Questao7;

public class ContaCorrente {

	
	protected double saldo = 0;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor){
		saldo += valor;
	}

	public void sacar (double valor) throws QualquerCoisaException{
		if (saldo < valor) {
			throw new QualquerCoisaException();
		} 
		else {
				saldo -= valor;
				saldo -= 0.5 / 100 * valor;
			}
	}

	@Override
	public String toString() {
	return "Saldo: " + saldo;
	}
}
