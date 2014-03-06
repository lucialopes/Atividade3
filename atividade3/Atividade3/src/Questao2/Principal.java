package Questao2;

public class Principal {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		ContaCorrente ce = new ClienteEspecial();
		cc.depositar(500);
		System.out.println(cc.getSaldo());
		cc.sacar(300);
		cc.sacar(1900);
		ce.depositar(800);
		System.out.println(ce.getSaldo());
		ce.sacar(500);
		ce.sacar(1300);

	}

}
