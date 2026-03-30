package br.com.lojinha;

import br.com.lojinha.pojos.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome ("Playstation 5");
        meuProduto.setValor(23.50);
        meuProduto.setMarca ("Sony");
        meuProduto.setTamanho("Médio");
        meuProduto.setItensInclusos ("2 Controles e 3 Jogos");

        System.out.println(meuProduto.getNome());
    }

}

