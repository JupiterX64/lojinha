package br.com.lojinha;

import br.com.lojinha.pojos.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome ("Playstation 5");
        meuProduto.setValor(55.00);
        meuProduto.setMarca ("Sony");
        meuProduto.setTamanho("Médio");

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("2 Controles");
        itensInclusos.add("3 Jogos");
        itensInclusos.add("2 Cabos de energia");
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos());

        System.out.println(meuProduto.getValor());
    }

}


