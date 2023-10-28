import java.util.Scanner;

public class ChatGpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        int contadorPalavras = contarPalavras(frase);
        
        System.out.println(contadorPalavras);
        
        scanner.close();
    }
    
    public static int contarPalavras(String frase) {
        String[] palavras = frase.split(" "); // Divide a frase em palavras usando espaço como separador
        return palavras.length;
    }
}
