package br.com.collections.set;

import java.util.Comparator;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {

	public String nome;
	public int anoDeCriacao;
	public String ide;

	public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
		super();
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public String getIde() {
		return ide;
	}

	@Override
	public String toString() {
		return " [nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoDeCriacao;
		result = prime * result + ((ide == null) ? 0 : ide.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		if (anoDeCriacao != other.anoDeCriacao)
			return false;
		if (ide == null) {
			if (other.ide != null)
				return false;
		} else if (!ide.equals(other.ide))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	//ORDENAR POR NOME
	@Override
	public int compareTo(LinguagemFavorita lin) {
		 
		return this.nome.compareTo(lin.nome);
	}

	
	
	
}
