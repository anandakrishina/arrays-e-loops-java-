package src.loop;

/*
Nota: Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.
*/


import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.println("Insira uma nota entre 0 e 10: ");
        nota = sc.nextDouble();

        while (nota > 10 || nota < 0){
            System.out.println("NÚMERO INVÁLIDO: Informe um valor entre 0 e 10 ");
            nota = sc.nextDouble();
        }
    }
}
