import java.util.Scanner;

public class ContadorDePalavras {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite uma frase: ");
		String frase = scanner.nextLine();
		scanner.close();

		int qtdEspacos  = 0;
		int tamanhoFrase = frase.length();

		for(int i = 0; i < tamanhoFrase; i++) {
			char letra = frase.charAt(i);
			if(letra == ' ') {
				qtdEspacos++;
			}
		}
		System.out.println(qtdEspacos + 1);



	}
}

