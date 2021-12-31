package br.com.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {

	public static void main(String[] args) {
		Set<String> arcoIris = new HashSet<>();

		arcoIris.add("violeta");
		arcoIris.add("anil");
		arcoIris.add("azul");
		arcoIris.add("verde");
		arcoIris.add("amarelo");
		arcoIris.add("laranja");
		arcoIris.add("vermelho");
		System.out.println(arcoIris);

		// a
		System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
		for (String cores : arcoIris) {
			System.out.println(cores);
		}
//b
		System.out.println("A quantidade de cores que o arco-íris tem: " + arcoIris.size());

		// c
		System.out.println("Exiba as cores em ordem alfabética: ");

		Set<String> arcoIris2 = new TreeSet<>(arcoIris);
		System.out.println(arcoIris2);

		System.out.println("Exiba as cores na ordem inversa da que foi informada ");
		Set<String> arcoIris3 = new LinkedHashSet<>(arcoIris);
		System.out.println(arcoIris3);
		List<String> coresArcoIrisList = new ArrayList<>(arcoIris3);
		Collections.reverse(coresArcoIrisList);
		System.out.println(coresArcoIrisList);

		System.out.println("Exiba as cores com a letra v ");
		for (String cores : arcoIris) {
			if(cores.startsWith("v"))System.out.println(cores);;
			
		}
		
		  System.out.println("Remova todas as cores que não começam com a letra “v”: ");
		  
		  Iterator<String> iterator2 = arcoIris.iterator();
		  while(iterator2.hasNext()) {
			  if(iterator2.next().startsWith("v")) iterator2.remove();
		  }
		  System.out.println(arcoIris);
		System.out.println("Limpe o conjunto: ");
		arcoIris.clear();
		
		System.out.println("Confira se o conjunto está vazio: " + arcoIris.isEmpty());
	}

}
