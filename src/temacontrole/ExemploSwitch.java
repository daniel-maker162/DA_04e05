package temacontrole;

public class ExemploSwitch {
    public static void main(String[] args) {
        int dia = 3;

        switch (dia) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            default: System.out.println("Inválido");
        }
    }
}