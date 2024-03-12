package com.ruanmattos.main;

import java.util.Scanner;

/**
 * 1. Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
 *
 * ENTRADA: Número digitado 8
 *
 * SAIDA: Tela do programa 1 3 5 7
 *
 * @author Ruan Pereira Mattos
 */
public class ExercicioForImpares {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }
    }
}
