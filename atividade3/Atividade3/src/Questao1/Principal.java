package Questao1;

public class Principal {

	
	public static void main(String[] args) {
		
		Empresa sc = new Empresa();
		Departamento a = new Departamento();
		a.setNomeDep("Departamento A");
		Departamento b = new Departamento();
		b.setNomeDep("Departamento B");
		
		Funcionario ae = new Funcionario();
		ae.setNome("mario");
		ae.setSalario(100);
		Funcionario af = new Funcionario();
		af.setNome("cassio");
		af.setSalario(400);
		Funcionario ag= new Funcionario();
		ag.setNome("maria");
		ag.setSalario(50);
		Funcionario ah = new Funcionario();
		ah.setNome("jose");
		ah.setSalario(500);
		
		 // adcionando departamento a e b na empresa sc
		sc.addDepartamento(a);
		sc.addDepartamento(b);
		//adcionando funcionarios nos departamentos da empresa sc
		a.addFuncionario(ae);
		a.addFuncionario(af);
		b.addFuncionario(ag);
		b.addFuncionario(ah);
		//tranferindo funcionario de um departamento para o outro
		sc.transferenciaDeFuncionario(ah, a);
		//Aumento de 10% ao funcionario de um departamento
		for (int i = 0; i < a.getFuncionarios().size(); i++) {
			double salario = a.getFuncionarios().get(i).getSalario();
			salario = salario + (0.10 * salario);
			   a.getFuncionarios().get(i).setSalario(salario);
			}
	



	}
}