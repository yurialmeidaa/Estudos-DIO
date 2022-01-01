package br.com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lista {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Integer> temperatura = new ArrayList();

		for (int i = 1; i <= 6; i++) {
			System.out.println("Digite o a temperatura do " + i + "º mês.");
			int temp = scan.nextInt();
			temperatura.add(temp);
		}
		System.out.println(temperatura);

		Iterator<Integer> iterator = temperatura.iterator();
		int soma = 0;
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			soma += next;
		}
		System.out.println("Soma: " + soma);
		Integer media = (soma / temperatura.size());
		System.out.println("Media: " + media);

		Iterator<Integer> iterator1 = temperatura.iterator();
		while (iterator1.hasNext()) {
			Integer next1 = iterator1.next();
			if (next1 > media) {

				if (temperatura.lastIndexOf(next1) + 1 == 1)
					System.out.println("1- Janeiro " + next1);
				if (temperatura.lastIndexOf(next1) + 1 == 2)
					System.out.println("2- Fevereiro " + next1);
				if (temperatura.lastIndexOf(next1) + 1 == 3)
					System.out.println("3- Março " + next1);
				if (temperatura.lastIndexOf(next1) + 1 == 4)
					System.out.println("4- Abril " + next1);
				if (temperatura.lastIndexOf(next1) + 1 == 5)
					System.out.println("5- Maio " + next1);
				if (temperatura.lastIndexOf(next1) + 1 == 6)
					System.out.println("6- Junho " + next1);

			}
		}

	}
}
