package Questao6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class LerAquivo{
	
	public static void main(String[] args){
	   FileReader filer;
	    BufferedReader buff;
		
		try {
			  filer = new FileReader("Aruivo.text"); // abri o arquivo
			  buff = new BufferedReader(filer); // instacia dentro do buff p/ poder ler o arquivo
		}catch(FileNotFoundException e){
			
			System.out.println("Arquivo não encontrado!");
		}
		
		String linha;
		try{
			  while(buff.ready()){//retorna um boolean, se tiver alguma coisa.
				  linha=buff.readLine();
				  System.out.println(linha); // ler uma linha e retorna uma string p/ cada linha	  
			 
			  }catch (FileNotFoundException e) {
				System.out.println(" Arquivo não encontrado");
			}	
}
	}
