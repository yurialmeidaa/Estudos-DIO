package br.com.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Nomes {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		Iterator <String> iterator = nomes.iterator();
		
		while(iterator.hasNext()) {
		System.out.println("---> " + iterator.next());	
		}
		
		nomes.set(2, "Roberto");
		System.out.println(nomes);
		
		System.out.println(nomes.get(1));
		//nomes.remove(4);
		nomes.remove("João");
		System.out.println(nomes);
		
		System.out.println(nomes.size());
		
		System.out.println(nomes.contains("Juliano"));
		
		List<String> nomes2 = new ArrayList<>();
		nomes2.add("Ismael");
		nomes2.add("Rodrigo");
		
		nomes.addAll(nomes2);
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		System.out.println("Lista vazia? " + nomes.isEmpty());
		

	}

}
