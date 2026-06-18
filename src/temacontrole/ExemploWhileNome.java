package temacontrole;

import java.util.Scanner;

public class ExemploWhileNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Digite nomes (digite 'sair' para parar):");

        while (true) {
            System.out.print("Nome: ");
            nome = scanner.nextLine();

            if (nome.equals("sair")) {
                break;
            }

            System.out.println("Olá, " + nome + "!");
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}