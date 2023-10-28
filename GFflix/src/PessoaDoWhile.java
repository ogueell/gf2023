
public class PessoaDoWhile {
	public static void main(String[] args) {
		 
		int qtdRepeticoes = 2;
		int contador = 0;
		
		System.out.println("inicio");
		do {
			System.out.println("Batendo na mesa");
			System.out.println("Subir na parede");
			System.out.println("Dançar");
			contador++;
		} while (contador < qtdRepeticoes);
		
		System.out.println("Fim");
	}
}
