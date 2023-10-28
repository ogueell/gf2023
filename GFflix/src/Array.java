import java.util.Scanner;

public class Array {
	public static void main(String[] args) {

		//descobrir a diferença de colocar a "arrey" depois do tipo da variavel e depois do nome da variavel.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos telefones você vai gravar?");
		int quantidadedeTelefones = scanner.nextInt();
		scanner.close();
		
		long numerosTelefones[] = new long[10];
		numerosTelefones[0] = 1213123123123123l;
		numerosTelefones[1] = 1231243123123123l;

		String nomePessoas[] = new String[10];
		nomePessoas[0] = "miguel";

		System.out.println(numerosTelefones[0]);
		System.out.println(nomePessoas[0]);
	}
}
