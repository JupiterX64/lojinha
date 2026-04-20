package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("BK", Tamanho.MEDIO);

        meuProduto.setNome ("Playstation 5");
        meuProduto.setValor(55.00);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso); //1

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogos", 3);
        itensInclusos.add(segundoItemIncluso); //2

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabos", 2);
        itensInclusos.add(terceiroItemIncluso); //3

        System.out.println(meuProduto.getItensInclusos());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
    }

}


