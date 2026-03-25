package br.com.lojinha;

import br.com.lojinha.pojos.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.nome = "Playstation 5";
        meuProduto.valor = 4999.99;
        meuProduto.marca = "Sony";
        meuProduto.tamanho = "Médio";
        meuProduto.itensInclusos = "2 Controles e 3 Jogos";

        System.out.println(meuProduto.nome);
    }
}
