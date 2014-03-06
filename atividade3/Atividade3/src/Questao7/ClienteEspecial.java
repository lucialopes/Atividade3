package Questao7;

public class ClienteEspecial extends ContaCorrente {
	
	public void sacar(double valor) throws QualquerCoisaException {
		if (saldo < valor) {
			throw new QualquerCoisaException();
		}
		else {
				saldo -= valor;
				saldo -= 0.1 / 100 * valor;
			}
		}

}
