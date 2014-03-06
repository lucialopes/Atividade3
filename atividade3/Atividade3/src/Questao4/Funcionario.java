package Questao4;

import java.io.Serializable;


public class Funcionario implements Serializable {


	String nome;
	double salario;
	String dataAdm;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataAdm() {
		return dataAdm;
	}
	public void setDataAdm(String dataAdm) {
		this.dataAdm = dataAdm;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAdm == null) ? 0 : dataAdm.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Funcionario other = (Funcionario) obj;
		if (dataAdm == null) {
			if (other.dataAdm != null)
				return false;
		} else if (!dataAdm.equals(other.dataAdm))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salario) != Double
				.doubleToLongBits(other.salario))
			return false;
		return true;
	}
	
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario
				+ ", dataAdm=" + dataAdm + "]";
	}

	

}
