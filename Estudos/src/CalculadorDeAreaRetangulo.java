import java.util.Scanner;

public class CalculadorDeAreaRetangulo {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a largura do retângulo: ");
		int largura = scanner.nextInt();
		
		System.out.print("Digite a altura do retângulo: ");
		int altura = scanner.nextInt();
		
		double area = largura * altura;
		double perimetro = 2 * (largura + altura);
		
		System.out.println("Área do retângulo :" + area);
		System.out.println("Perímetro do retângulo: " + perimetro);
		
		scanner.close();
	}
}
