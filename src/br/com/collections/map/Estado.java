package br.com.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Estado {

	public static void main(String[] args) {

		System.out.println("Crie um dicionario e relacione os estados e suas populações");
		Map<String, Integer> populacao = new HashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);

			}
		};

		System.out.println(populacao.toString());

		System.out.println("Substitua a população do estado do RN por 3.534.165;");
		populacao.put("RN", 3534165);
		System.out.println(populacao);

		System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB -\r\n" + "4.039.277: "
				+ populacao.containsKey("PB"));

		if (!populacao.containsKey("PB")) {
			populacao.put("PB", 4039277);
		}

		System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB -\r\n" + "4.039.277: "
				+ populacao.containsKey("PB"));

		System.out.println("Exiba a populacao de PE: " + populacao.get("PE"));

		System.out.println("Exiba todos os estados e suas populações na ordem que foi\r\n" + "informado;");

		Map<String, Integer> populacao2 = new LinkedHashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);

			}
		};

		System.out.println(populacao2.toString());

		System.out.println("Exiba os estados e suas populações em ordem alfabética;");

		Map<String, Integer> populacao3 = new TreeMap<>(populacao);
		System.out.println(populacao3.toString());

		System.out.println("Exiba o estado com o menor população e sua quantidade;");

		Integer menorPop = Collections.min(populacao.values());
		String estadoMenorPop = "";

		for (Map.Entry<String, Integer> entry : populacao.entrySet()) {
			if (entry.getValue().equals(menorPop)) {
				estadoMenorPop = entry.getKey();
				System.out.println("Menor população: " + estadoMenorPop + " - " + menorPop);
			}

		}

		System.out.println("Exiba o estado com a maior população e sua quantidade");

		Integer maiorPop = Collections.max(populacao.values());
		String estadoMaiorPop = "";
		for (Map.Entry<String, Integer> entry1 : populacao.entrySet()) {
			if (entry1.getValue().equals(maiorPop)) {
				estadoMaiorPop = entry1.getKey();
				System.out.println("Maior população: " + estadoMaiorPop + "-" + menorPop);
			}

		}

		Iterator<Integer> iterator = populacao.values().iterator();
		Integer soma = 0;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("A soma das populações dos estados: " + soma);
		System.out.println("A media da população dos estados: " + (soma / populacao.size()));
		System.out.println("Remova os estados com a população menor que 4.000.000;");
		
		Iterator<Integer> iterator1 = populacao.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
	System.out.println(populacao);
	
	
	System.out.println("Apague o dicionário de estados;");
	
	populacao.clear();
	
	System.out.println("Confira se o dicionario está vazio: " + populacao.isEmpty());
	
	}
}
