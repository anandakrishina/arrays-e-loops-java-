package src.loop;

import java.util.Scanner;

/*
Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma;


        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        soma = numero;
        for (int i = numero-1; i > 0; i--) {
            soma = soma*i;
        }
        System.out.println(soma);


    }
}
