package cofrinhoDeMoedas;

import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {
	// cria a array list de lista de meodas
	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	// metodo de adicionar moedas
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}

	// metodo de remover moedas da lista
	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}

	// metodo da listagem de moedas
	public void listagemMoedas() {
		for (Moeda moeda : listaMoedas) {
			moeda.Info();
		}
	}

	// metodo de conversao do valor total das moedas para reais
	public void totalConvertido() {
		double total = 0;
		for (Moeda moeda : listaMoedas) {
			total = total + moeda.Converter();
		}
		System.out.println("Total convertido para reais: R$" + total);
	}

	public static void main(String[] args) {
		// cria um novo cofrinho e scanner do teclado
		Cofrinho cofrinho = new Cofrinho();
		Scanner teclado = new Scanner(System.in);

		// o trecho de código abaixo vai ser executado até usuário informe que quer sair
		// do sistema
		while (true) {
			// imprime o menu no console
			System.out.println("Menu");
			System.out.println("1-Adicionar moeda");
			System.out.println("2-Remover moeda");
			System.out.println("3-Listar moedas");
			System.out.println("4-Total de moedas convertido em reais");
			System.out.println("0-Sair do programa");

			// variavel para pegar qual a opção escolhida pelo usuário
			int opcaoEscolhida = teclado.nextInt();

			// switch case das opções
			switch (opcaoEscolhida) {
			// case de adicionar moeda
			case 1:
				// imprime o menu das moedas
				System.out.println("Qual tipo de moeda deseja adicionar:");
				System.out.println("Real,");
				System.out.println("Dolar,");
				System.out.println("Euro,");
				System.out.println("Iene,");
				System.out.println("ou Libra?");

				// variavel para pegar qual o tipo de moeda que o usuário deseja adicionar no
				// cofrinho
				String tipoMoeda = teclado.next();

				System.out.println("Qual o valor?"); // imprime uma mensagem perguntando o valor

				// variavel para pegar qual o valor de moeda que o usuário quer adicionar
				double valor = teclado.nextDouble();

				Moeda moeda = null; // como padrão o tipo inicial da moeda é null

				// switch case para os tipos de moeda.
				// transforma em letra minuscula o texto informado pelo usuário na pergunta
				// sobre qual moeda ele quer adicionar
				switch (tipoMoeda.toLowerCase()) {

				// se o tipo da moeda corresponder aos tipos aceito pelo programa, é criada uma
				// nova moeda daquele tipo.
				case "dolar":
					moeda = new Dolar(valor);
					break;
				case "euro":
					moeda = new Euro(valor);
					break;
				case "iene":
					moeda = new Iene(valor);
					break;
				case "libra":
					moeda = new LibraEsterlina(valor);
					break;
				case "real":
					moeda = new Real(valor);
					break;

				// se o tipo informado for inválido uma mensagem é exibida e o usuário volta pro
				// menu.
				default:
					System.out.println("Moeda invalida.");
					continue;
				}
				// agora a moeda é adicionada ao cofrinho
				cofrinho.adicionar(moeda);
				break;

			// case de remover meodas
			case 2:
				cofrinho.listagemMoedas(); // imprime a lista de meodas para o usuário saber quais moedas ele pode
											// remover
				System.out.println("Informe o indice da moeda que você deseja remover do cofrinho.");
				System.out.println("lembre-se que o inidice começa em 0");

				// variavel que pega o ínidice da moeda informada.
				int indiceMoeda = teclado.nextInt();

				// se o indice da moeda for válido ela é removida do cofrinho
				if (indiceMoeda >= 0 && indiceMoeda < cofrinho.listaMoedas.size()) {
					Moeda moedaEscolhida = cofrinho.listaMoedas.get(indiceMoeda);
					cofrinho.remover(moedaEscolhida);
					cofrinho.listagemMoedas();
					System.out.println("Moeda removida com sucesso!");
				}
				// se não uma mensagem de erro é exibida
				else {
					System.out.println("Indice invalido. Lembre-se que o indice começa em 0(zero).");
					continue;
				}
				break;

			// case para a listagem de moedas.
			case 3:
				// exibe a lista de moedas no console.
				cofrinho.listagemMoedas();
				break;

			// case para o total de moedas convertido em reais
			case 4:
				// exibe no console o total de moedas convertido em reais.
				cofrinho.totalConvertido();
				break;

			// case para terminar o programa
			case 0:
				System.out.println("Saindo do programa...");
				teclado.close();
				System.exit(0);

				// caso a opção informada seja inválida
			default:
				System.out.println("Opcao invalida");
				continue;
			}
		}

	}

}
