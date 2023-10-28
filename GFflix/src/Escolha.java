import java.util.Scanner;

public class Escolha {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		double n1 = scanner.nextDouble();

		System.out.println("Informe o segundo número: ");
		double n2 = scanner.nextDouble();

		System.out.println("Informe a operação (+, -, *, /, ^, R): ");
		char simbolo = scanner.next().charAt(0);

		double resultado = 0;

		scanner.close();

		switch(simbolo) {
		case '+' :
			resultado = n1 + n2;
			break;
		case '-' :
			resultado = n1 - n2;
			break;
		case '*' :
			resultado = n1 * n2;
			break;
		case '/' :
			resultado = n1 / n2;
			break;
		case '^':
			resultado = Math.pow(n1, n2);
			break;
		case 'R':
			resultado = Math.round(Math.pow(n1, 1.0 / n2));
			break;
		default:
			System.err.println("Operação invalida");
		}
		System.out.println("O resultado é " + resultado + ": ");
	}
}
