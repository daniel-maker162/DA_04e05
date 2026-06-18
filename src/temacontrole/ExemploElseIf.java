package temacontrole;

public class ExemploElseIf {
    public static void main(String[] args) {
        int nota = 85;

        if (nota >= 70) {
            System.out.println("Aprovado");
        } else if (nota >= 50) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}