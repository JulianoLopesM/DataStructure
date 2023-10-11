package com.projeto.fila;

public class main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");//estou adicionando um elemento ao final da fila
        minhaFila.enqueue("segundo");//estou adicionando um elemento ao final da fila
        minhaFila.enqueue("terceiro");//estou adicionando um elemento ao final da fila
        minhaFila.enqueue("quarto");//estou adicionando um elemento ao final da fila


        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());//estou dando retorno no meu primeiro elemento e o retirando da fila

        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());//estou apenas dando retorno no meu primeiro elemento da fila

        System.out.println(minhaFila);
    }
}
