import java.util.Scanner;

public class CalculadoraDeIMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso (kg): ");
		double peso = scanner.nextDouble();
		
		System.out.print("Digite a altura (metros): ");
		double altura = scanner.nextDouble();
		
		double IMC = peso / (altura * altura);
		
		System.out.println("IMC: " + IMC);
		
		  if (IMC < 19) {
	            System.out.println("Categoria de peso: Abaixo do peso.");
	        } else if (IMC >= 19 && IMC < 24) {
	            System.out.println("Categoria de peso: Peso normal.");
	        } else if (IMC >= 24 && IMC < 29.9) {
	            System.out.println("Categoria de peso: Sobrepeso.");
	        } else {
	            System.out.println("Categoria de peso: Obeso.");
	        }
		  
		scanner.close();
	}
}
