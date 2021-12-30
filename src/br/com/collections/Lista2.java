package br.com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> crime = new ArrayList();

		System.out.println("Telefonou para a vítima?");
		String resposta = scan.next();
		crime.add(resposta.toLowerCase());

		System.out.println("Esteve no local do crime?");
		resposta = scan.next();
		crime.add(resposta.toLowerCase());

		System.out.println("Mora perto da vítima?");
		resposta = scan.next();
		crime.add(resposta.toLowerCase());

		System.out.println("Devia para a vítima?");
		resposta = scan.next();
		crime.add(resposta.toLowerCase());

		System.out.println("Já trabalhou com a vítima?");
		resposta = scan.next();
		crime.add(resposta.toLowerCase());

		System.out.println(crime);

		int count = 0;
		Iterator<String> iterator = crime.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (next == "s")
				count++;

		}

		switch (count) {
		case 2:
			System.out.println(">> SUSPEITA <<");
			break;
		case 3:
		case 4:
			System.out.println(">> CÚMPLICE <<");
			break;
		case 5:
			System.out.println(">> ASSASSINO <<");
			break;
		default:
			System.out.println(">> INOCENTE <<");
			break;
		}
	}

}
