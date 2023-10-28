import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n1 = scanner.nextInt();

		if(n1 % 2 == 0) {
			System.out.println("O número " + n1 + " é par.");
		} else {
			System.out.println("O número " + n1 + " é ímpar.");
			
		scanner.close();
		}
	}
}
