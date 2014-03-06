package Questao3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Principal {

	/*
	 *Set � uma interface que n�o permite elementos duplicados, ela tem v�rias implmenta��es como: 
	 *TreeSet e HashSet. ArrayList � uma implementa��o da interface List. 
	 *Set n�o deixa repetir elementos na lista. 
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();

		// conjunto list
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(9);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(8);
		list.add(5);
		
		System.out.println(" Imprimindo Lista:");
        //// Usamos o iterator para mostrar o conte�do do ArrayList
		Iterator<Integer> a = list.iterator();
		while (a.hasNext()) {
		Integer valor = (Integer) a.next();
		System.out.print((valor + " "));
		}
		
		
		System.out.println();
     // conjunto set
		set.add(2);
		set.add(5);
		set.add(3);
		set.add(9);
		set.add(2);
		set.add(4);
		set.add(3);
		set.add(8);
		set.add(5);
		
		System.out.println(" Imprimindo set:");
        //// Usamos o iterator para mostrar o conte�do 
		Iterator<Integer> b = set.iterator();
		while (b.hasNext()) {
		Integer valor = (Integer) b.next();
		System.out.print((valor + " "));
		}
		
	}

}
