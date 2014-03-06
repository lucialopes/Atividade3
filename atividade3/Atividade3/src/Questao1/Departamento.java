package Questao1;


import java.util.ArrayList;


public class Departamento {

	String nomeDep;
	// departamento tem uma lista de funcinarios
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario> ();
	
	
	public String getNomeDep() {
		return nomeDep;
	}
	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((funcionarios == null) ? 0 : funcionarios.hashCode());
		result = prime * result + ((nomeDep == null) ? 0 : nomeDep.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (funcionarios == null) {
			if (other.funcionarios != null)
				return false;
		} else if (!funcionarios.equals(other.funcionarios))
			return false;
		if (nomeDep == null) {
			if (other.nomeDep != null)
				return false;
		} else if (!nomeDep.equals(other.nomeDep))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Departamento [nomeDep=" + nomeDep + ", funcionarios="
				+ funcionarios + "]";
	}
	

}
    
    