package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;
        System.out.println( "int a= " + intA +  " e " +"int b = " + intB);
        intA = 3;
        System.out.println(intA);
        System.out.println( "int a= " + intA +  " e " +"int b = " + intB);

        MeuObj obj1 = new MeuObj(1);
        MeuObj obj2 = obj1;
        System.out.println("obj1 = " + obj1 + " obj2 = " + obj2);
        obj1.setNum(3);
        System.out.println("obj1 = " + obj1 + " obj2 = " + obj2);
        obj2.setNum(4);
        System.out.println("obj1 = " + obj1 + " obj2 = " + obj2);


    }
}
