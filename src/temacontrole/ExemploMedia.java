package temacontrole;

import java.util.Scanner;

public class ExemploMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Nota " + i + ": ");
            soma += scanner.nextDouble();
        }

        double media = soma / 3;
        System.out.println("Média: " + media);

        scanner.close();
    }
}