package src.loop;

import java.util.Scanner;

/*
Nome e Idade: Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;


        do {
            System.out.println("Nome: ");
            nome = sc.nextLine();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = sc.nextInt();
            sc.nextLine();
        } while (true);

        System.out.println("Programa encerrado");
    }
}
