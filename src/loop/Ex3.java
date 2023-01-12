package src.loop;

/*
Maior e Média: Faça um programa que leia 5 números
e informe o maior número e a média desses números.
*/

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,soma,media,maior;

        soma = 0;
        maior = 0;
        System.out.println("Insira 5 números: ");

        for (int i = 0; i < 5; i++) {

            numero = sc.nextInt();
            soma += numero;
            if(numero>maior){
                maior = numero;
            }
        }

        media = soma/5;
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("A media dos números é: " + media);

    }
}
