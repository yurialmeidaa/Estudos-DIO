package br.com.collections.set;

import java.util.Comparator;

public class ComparatorAnoNome implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		
		        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
		        if (anoDeCriacao != 0) return anoDeCriacao;

		       

		        return l1.nome.compareToIgnoreCase(l2.nome);
		    }
		
	}

