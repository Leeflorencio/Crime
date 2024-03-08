package com.br.beecrowd;

import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer resposta = 0;

        System.out.println("Responda as perguntas com '1' para sim' e '0' para nao'");

        System.out.println("Telefonou para a vítima?");
        resposta += sc.nextInt();

        System.out.println("Esteve no local do crime?");
        resposta += sc.nextInt();

        System.out.println("Mora perto da vítima?");
        resposta += sc.nextInt();

        System.out.println("Devia para a vítima?");
        resposta += sc.nextInt();

        System.out.println("Já trabalhou com a vítima?");
        resposta += sc.nextInt();


        if (resposta == 2) {
            System.out.println("Suspeito");
        } else if (resposta >= 3 && resposta <= 4) {
            System.out.println("Cúmplice");
        } else if (resposta == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}
