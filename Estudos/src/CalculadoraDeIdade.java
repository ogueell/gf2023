import java.util.Calendar;
import java.util.Scanner;

public class CalculadoraDeIdade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o ano de nascimento: ");
		int anoNascimento = scanner.nextInt();
		
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		
		int idade = anoAtual - anoNascimento;
		
		System.out.println("Sua idade é: " + idade + " anos");
		
		scanner.close();
	}
}
