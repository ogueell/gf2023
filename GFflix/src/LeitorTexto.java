import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LeitorTexto {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("C:/listachamada.txt"));
		
		System.out.println("================================================================================================");
		System.out.println("Lendo...");
		
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		
		System.out.println("Lido com sucesso!");
		System.out.println("================================================================================================");
		
		scanner.close();
	}
}
