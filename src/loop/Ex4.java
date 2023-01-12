package src.loop;

import java.util.Scanner;

/*
Par e Ímpar: Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, quant,par,impar;
        par = 0;
        impar = 0;

        System.out.println("Insira a quantidade de número que deseja inserir: ");
        quant = sc.nextInt();
        System.out.println("Digite "+quant+" números: ");
        for (int i = 0; i < quant; i++) {
            numero = sc.nextInt();
            if (numero%2==0){
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Quantidade de números pares: "+par);
        System.out.println("Quantidade de números ímpares: "+impar);

    }
}
