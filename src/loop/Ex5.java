package src.loop;

import java.util.Scanner;

/*
Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int multiplicador;

        System.out.println("Deseja ver a tabuada de qual número? ");
        multiplicador = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplicador + " x " + i + " = " + multiplicador*i);
        }
    }
}
