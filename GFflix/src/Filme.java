import java.util.Scanner;

public class Filme {
	public static void main(String[] args) {

		String nome;
		String categoria;

		//Inteiros
		byte pgr;
		short duracao;
		int qtdCompartilhamento;
		long qtdVisualizacoes;
		short anoLancamento;

		//Decimais
		double bilheteria;
		float orcamento;
		
		int qtdAtores; 
				
		//Atores
	    String[] atores;

		//Outros
		char seloQualidade;
		boolean disponivel;

		long[] telefones;
		int qtdTelefones;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo! Cadastre o filme que você deseja.");

		System.out.println("Informe o nome do filme: ");
		nome = scanner.next();
		scanner.nextLine();

		System.out.println("Informe a categoria:");
		categoria = scanner.next();
		scanner.nextLine();

		System.out.println("PGR: ");
		pgr = scanner.nextByte();

		System.out.println("Duração: ");
		duracao = scanner.nextShort();

		System.out.println("Quantidade de compartilhamento: ");
		qtdCompartilhamento = scanner.nextInt();

		System.out.println("Quantidade de visualização: ");
		qtdVisualizacoes = scanner.nextLong();

		System.out.println("Ano de lançamento: ");
		anoLancamento = scanner.nextShort();

		System.out.println("Bilheteria: ");
		bilheteria = scanner.nextDouble();

		System.out.println("Orçamento: ");
		orcamento = scanner.nextFloat();

		System.out.println("Quantidade de Atores: ");
		qtdAtores = scanner.nextInt();
		atores = new String[qtdAtores];
		scanner.nextLine();
		
		for(int i = 0; i < qtdAtores; i++) {
			System.out.println("Digite o nome dos Atores " + (i + 1) + ": ");
			atores[i] = scanner.nextLine();
		}

		System.out.println("Quantidade de números de contato: ");
		qtdTelefones = scanner.nextInt();
		telefones = new long[qtdTelefones];
		scanner.nextLine();

		for(int i = 0; i < qtdTelefones; i++) {
			System.out.println("Digite os números de contato: " + (i + 1) + ": ");
			telefones[i] = scanner.nextLong();
		}

		System.out.println("Habilitar visibilidade para usuarios: ");
		disponivel = scanner.nextBoolean();
		scanner.nextLine();

		System.out.println("Qual o selo de qualidade (S, A, B, C, D, E): ");
		seloQualidade = scanner.nextLine().charAt(0);

		scanner.close();

		System.out.println("====================================================================");
		System.out.println("Filme Cadastrado com sucesso!");
		System.out.println("Nome: " + nome);
		System.out.println("Categoria: " + categoria);
		System.out.println("Ano de lançamento: " + anoLancamento);
		System.out.println("PGR: " + pgr);
		System.out.println("Duração: " + duracao);
		System.out.println("Quantidade de compartilhamento: " + qtdCompartilhamento);
		System.out.println("Quantidade de visualizações: " + qtdVisualizacoes);
		System.out.println("Bilheteria: " + bilheteria);
		System.out.println("Orçamento: " + orcamento);
		System.out.println("Nomes dos atores registrados: ");
		for(int i = 0; i < qtdAtores; i++) {
			System.out.println("Ator " + (i + 1) + ": " + atores[i]);
		}
		System.out.println("Números de contato registrados: ");
		for (int i = 0; i < qtdTelefones; i++) {
			System.out.println("Contato " + (i + 1) + ": " + telefones[i]);
		}
		System.out.println("Habilitar visibilidade para usuarios? " + disponivel);
		System.out.println("Selo de qualidade: " + seloQualidade);
		System.out.println("====================================================================");
	}
}
