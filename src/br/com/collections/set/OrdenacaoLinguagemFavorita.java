package br.com.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoLinguagemFavorita {

	public static void main(String[] args) {

		System.out.println("--\tOrdem inserção\t--");
		Set<LinguagemFavorita> linguagem = new LinkedHashSet<>() {
			{
				add(new LinguagemFavorita("Python", 1995, "pycharm"));
				add(new LinguagemFavorita("Java", 1996, "eclipse"));
				add(new LinguagemFavorita("JavaScript", 1995, "vs"));
			}
		};
		for (LinguagemFavorita lin : linguagem)
			System.out.println(lin.getNome() + " - " + lin.getAnoDeCriacao() + " - " + lin.getIde());

		System.out.println("--\tOrdem natural (Nome)\t--");
		Set<LinguagemFavorita> linguagem2 = new TreeSet<>(linguagem);
		for (LinguagemFavorita lin : linguagem2)
			System.out.println(lin.getNome() + " - " + lin.getAnoDeCriacao() + " - " + lin.getIde());

		System.out.println("--\tOrdem IDE\t--");
		Set<LinguagemFavorita> linguagem3 = new TreeSet<>(new ComparatorIDE());
		 linguagem3.addAll(linguagem);
		for (LinguagemFavorita lin : linguagem3)
			System.out.println(lin.getNome() + " - " + lin.getAnoDeCriacao() + " - " + lin.getIde());

		System.out.println("--\tOrdem Ano e nome\t--");
		Set<LinguagemFavorita> linguagem4 = new TreeSet<>(new ComparatorAnoNome());
		 linguagem4.addAll(linguagem);
		for (LinguagemFavorita lin : linguagem4)
			System.out.println(lin.getNome() + " - " + lin.getAnoDeCriacao() + " - " + lin.getIde());

		System.out.println("--\tOrdem Nome,ano e ide\t--");
		Set<LinguagemFavorita> linguagem5 = new TreeSet<>(new ComparatorNomeAnoIde());
		 linguagem5.addAll(linguagem);
		for (LinguagemFavorita lin : linguagem5)
			System.out.println(lin.getNome() + " - " + lin.getAnoDeCriacao() + " - " + lin.getIde());
		
	}
}
