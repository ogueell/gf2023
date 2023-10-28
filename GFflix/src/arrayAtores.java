import java.util.Scanner;

public class arrayAtores {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite os atores que você deseja informar: ");
		int qtdAtores = scanner.nextInt();
		scanner.nextLine();

		String[] atores = new String[qtdAtores];

		for(int i = 0; i < qtdAtores; i++) {
			System.out.println("Digite o nome dos atores " + (i + 1) + ": ");
			atores[i] = scanner.nextLine();
		}
		System.out.println("Nomes dos atores registrados: ");
		for(int i = 0; i < qtdAtores; i++) {
			System.out.println("Nome " + (i + 1) + ": " + atores[i]);

			scanner.close();
		}
	}
}
