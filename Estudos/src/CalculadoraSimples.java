import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double numero1, numero2, resultado;
        char operacao;
        
        System.out.print("Digite um número: ");
        numero1 = scanner.nextDouble();
        
        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = scanner.next().charAt(0);
        
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();
        
        scanner.close();
        
        switch (operacao) {
        case '+':
            resultado = numero1 + numero2;
            break;
        case '-':
            resultado = numero1 - numero2;
            break;
        case '*':
            resultado = numero1 * numero2;
            break;
        case '/':
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Erro: Divisão por zero!");
                return;
            }
            break;
        default:
            System.out.println("Operação inválida!");
            return;
    }

    System.out.println("Resultado: " + resultado);
	}
}
