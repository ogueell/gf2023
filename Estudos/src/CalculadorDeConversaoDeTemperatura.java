import java.util.Scanner;

public class CalculadorDeConversaoDeTemperatura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escolha a operação (C para Celsius para Fahrenheit, F para Fahrenheit para Celsius: ");
		char escolha = scanner.next().charAt(0);
		
		if(escolha == 'C' || escolha == 'c') {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = scanner.nextDouble();
			double fahrenheit = (celsius * 9/5) + 32;
			System.out.println("Resultado da conversão: " + celsius + " graus celsius = " + fahrenheit + " graus fahrenheit.");
		} else if (escolha == 'F' || escolha == 'f') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			double fahrenheit = scanner.nextDouble();
			double celsius = (fahrenheit - 32) * 5/9;
			System.out.println("Resultado da conversão: " + fahrenheit + " graus Fahrenheit = " + celsius + " graus Celsius.");
		} else {
			System.out.println("Escolha inválida. Use C para Celsius para Fahrenheit ou F para Fahrenheit para Celsius.");
		}
		scanner.close();
	}
}
