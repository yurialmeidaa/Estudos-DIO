package br.com.collections.set;

import java.util.Comparator;

class ComparatorIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1,LinguagemFavorita l2 ) {
       

        return l1.ide.compareToIgnoreCase(l2.ide);

}}