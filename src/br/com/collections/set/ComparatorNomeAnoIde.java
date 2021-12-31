package br.com.collections.set;

import java.util.Comparator;

public class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		
		 int nome = l1.nome.compareToIgnoreCase(l2.nome);
	      
	        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
	        		  if (nome != 0) return nome;
	        if (anoDeCriacao != 0) return anoDeCriacao;
		
		return l1.ide.compareToIgnoreCase(l2.ide) ;
	}

}
