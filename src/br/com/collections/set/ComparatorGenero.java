package br.com.collections.set;

import java.util.Comparator;

class ComparatorGenero implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		 
		return s1.getGenero().compareToIgnoreCase(s2.getGenero());
	}}