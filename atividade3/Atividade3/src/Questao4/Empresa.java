package Questao4;

import java.io.Serializable;
import java.util.ArrayList;

import Questao1.Departamento;
import Questao1.Funcionario;

public class Empresa implements Serializable {
	String nome;
	int cnpj;
	//  ArrayList<String> bandas = new ArrayList<String> ();
	//empresa tem uma lista de departamentos
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	
	// adcionando departamento
	public void addDepartamento(Departamento departamento) {
		departamentos.add(departamento);
		}

	public void transferenciaDeFuncionario(Funcionario funcionario,Departamento Depdestino) {
			for (int i = 0; i < departamentos.size(); i++) {
			for (int j = 0; j < departamentos.get(i).getFuncionarios().size(); j++) {
			if (departamentos.get(i).getFuncionarios().get(j) == funcionario) {
			        Depdestino.addFuncionario(funcionario);
			  return;
		      }
	       }
	     }
	}	
	
		
	
	
	

}
