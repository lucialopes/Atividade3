package Questao4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.Box.Filler;

import Questao1.Departamento;
import Questao1.Empresa;
import Questao1.Funcionario;

public class Principal {

public static void main(String[] args) throws IOException {
		
	
		Empresa sc = new Empresa();
		// escrever arquivo
		try{
			FileOutputStream out = new FileOutputStream("C://atividade02.text");
			// criar o objeto
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			objOut.writeObject(sc);
			objOut.close();
			System.out.println("Escrevi");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		  // resgatar o estado do objeto
		try{
			FileInputStream in = new FileInputStream("C://atividade02.text"); // referencia pra persistir
			ObjectInputStream objIn = new ObjectInputStream(in);
			// ler o que persistiu no arquivo
			Empresa se = (Empresa)objIn.readObject(); // arquivo persistido
			System.out.println(se.getCnpj());
		}catch(FileNotFoundException e){
			e.printStackTrace();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
