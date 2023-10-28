import java.util.Scanner;

public class CalculadoraMedia {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int n1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int n2 = scanner.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int n3 = scanner.nextInt();
		
		double resultado = (n1 + n2 + n3) / 3;
		
		System.out.println("A média dos números é: " + resultado);
		
		scanner.close();
	}
}
