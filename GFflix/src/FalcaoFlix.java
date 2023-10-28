import java.util.Scanner;

public class FalcaoFlix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Cadastro sobre o filme
		String nomeFilme = "";
		String categoria = "";
		short anoLancamento = 0;
		short duracao = 0;
		byte pgr = 0;
		char seloQualidade = '0';
		boolean disponivel = false;

		// Cadastro de usuário
		String usuarionome = "";
		String usuarioemail = "";
		int usuariotelefone = 0;

		//Cadastro de atores e telefones
		int qtdAtores = 0;
		int qtdTelefones = 0;

		char opcao;
		
		System.out.println("==============================================");

		do {
			System.out.println("Bem vindo ao FalconsFlix!!! ");
			System.out.println("[1] Cadastro de usuario.");
			System.out.println("[2] Cadastro completo do filme. ");
			System.out.println("[3] Cadastro de atores & Cadastro de contatos de telefones dos atores e envolvidos. ");
			System.out.println("[V] Ver as informações de cadastro. ");
			
			System.out.println("==============================================");

			System.out.println("Digite [0] para sair do menu. ");

			opcao = scanner.next().charAt(0);

			switch (opcao) {
			case '1':
				System.out.println("==============================================");
				
				System.out.println("Digite seu nome completo: ");
				usuarionome = scanner.next();
				scanner.nextLine();

				System.out.println("Digite seu email: ");
				usuarioemail = scanner.next();
				scanner.nextLine();

				System.out.println("Digite seu telefone para contato: ");
				usuariotelefone = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("==============================================");

				System.out.println("Clique 'ENTER' novamente para voltar ao menu. ");
				scanner.nextLine();
				break;
			case '2':
				System.out.println("==============================================");
				
				System.out.println("Informe o nome do filme: ");
				nomeFilme = scanner.next();
				scanner.nextLine();

				System.out.println("Informe a categoria: ");
				categoria = scanner.next();
				scanner.nextLine();

				System.out.println("Duração: ");
				duracao = scanner.nextShort();

				System.out.println("Ano de lançamento: ");
				anoLancamento = scanner.nextShort();

				System.out.println("Digite o PGR: ");
				pgr = scanner.nextByte();

				System.out.println("Digite o Selo de Qualidade: ");
				seloQualidade = scanner.next().charAt(0);

				System.out.println("Habilitar visibilidade para usuarios? (true, false) ");
				disponivel = scanner.nextBoolean();
				scanner.nextLine();
				
				System.out.println("==============================================");

				System.out.println("Clique 'ENTER' novamente para voltar ao menu. ");
				scanner.nextLine();
				break;
			case '3':
				System.out.println("==============================================");
				
				System.out.println("Digite a quantidade de atores que deseja cadastrar: ");
				qtdAtores = scanner.nextInt();
				scanner.nextLine();

				String[] atores = new String[qtdAtores];

				for(int i = 0; i < qtdAtores; i++) {
					System.out.println("Digite o nome dos Atores " + (i + 1) + ": ");
					atores[i] = scanner.nextLine();
				}
				System.out.println("Quantidade de números de contato: ");
				qtdTelefones = scanner.nextInt();
				scanner.nextLine();

				long[] telefones = new long[qtdTelefones];

				for(int i = 0; i < qtdTelefones; i++) {
					System.out.println("Digite os números de contato: " + (i + 1) + ": ");
					telefones[i] = scanner.nextLong();
				}
				
				scanner.nextLine();
				
				System.out.println("==============================================");
				
				System.out.println("Clique 'ENTER' novamente para voltar ao menu. ");
				scanner.nextLine();
				break;
			case '0':
				System.err.println("Sair. ");
				break;
			case 'V':
				scanner.nextLine();
				System.out.println("==============================================");
				System.out.println("Informações de usuario: ");
				System.out.println("Nome: " + usuarionome);
				System.out.println("Email: " + usuarioemail);
				System.out.println("Telefone: " + usuariotelefone);
				System.out.println("==============================================");
				System.out.println("Informações do filme: ");
				System.out.println("Filme: " + nomeFilme);
				System.out.println("Categoria: " + categoria);
				System.out.println("Duração: " + duracao);
				System.out.println("Ano de lançamento: " + anoLancamento);
				System.out.println("PGR: " + pgr);
				System.out.println("Selo de Qualidade: " + seloQualidade);
				System.out.println("Habilitar visibilidade para usuarios? " + disponivel);
				System.out.println("==============================================");
				//Não consegui imprimir no console as informações dos atores e envolvidos por conta do array.
				System.out.println("Informações de Atores e envolvidos: ");
				
				System.out.println("Clique 'ENTER' novamente para voltar ao menu. ");
				scanner.nextLine();
				break;
			default:
				System.err.println("Opção indisponivel. ");
				scanner.nextLine();
				System.out.println("==============================================");
				System.out.println("Clique 'ENTER' novamente para voltar ao menu. ");
				scanner.nextLine();
				break;	
			} 
		} while(opcao != '0');
		scanner.close();
	}
}
