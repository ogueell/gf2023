import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha o melhor time para você entre: Santos, Palmeiras ou Flamengo? ");
        String escolha = scanner.next();

        if (escolha.equalsIgnoreCase("Santos")) {
            System.out.println("Cê é brabo meu fi oloco meo haha.");
        } else if(escolha.equalsIgnoreCase("Palmeiras")) {
            System.out.println("Cê não sabe de nada, apaga tudo.");
        } else if (escolha.equalsIgnoreCase("Flamengo")) {
            System.out.println("Bora bill kkkk cala boca.");
        } else {
        	System.out.println("Escreve alguma coisa aí meu fi.");
        	scanner.close();
        }
    }
}