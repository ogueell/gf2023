import java.util.Scanner;

public class arrayTelefones {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a quantidade de números de telefone que você irá registrar: ");
		int qtdTelefones = scanner.nextInt();

		long[] telefones = new long[qtdTelefones];

		for (int i = 0; i < qtdTelefones; i++) {
			System.out.println("Digite o telefone " + (i + 1) + ": ");
			telefones[i] = scanner.nextLong();
		}

		System.out.println("Números de telefone registrados: ");
		for (int i = 0; i < qtdTelefones; i++) {
			System.out.println("Telefone " + (i + 1) + ": " + telefones[i]);

			scanner.close();
		}
	}
}