import java.io.IOException;
import java.util.Scanner;

public class TesteCadastro {

	public static void main(String[] args) throws IOException {
		dadosPessoa();
	}

	public static void dadosPessoa() throws IOException {
		System.out.println("Cadastro de pessoas Compasso");
		Scanner sc = new Scanner(System.in);
		
		ControleIO controle = new ControleIO();
		
		Pessoa pessoa;
		
		int opt = 0;
				
		do {
			printaOpcoesMenu();
			opt = sc.nextInt();	
			
			if(opt == 1) {
				pessoa = new Pessoa();
				System.out.print("Digite o código: ");
				pessoa.setCodigo(Integer.parseInt(sc.next()));
				System.out.print("Digite o nome: ");
				pessoa.setNome(sc.next());
				System.out.print("Digite o endereço: ");
				pessoa.setEndereco(sc.next());
				System.out.print("Digite a idade: ");
				pessoa.setIdade(Integer.parseInt(sc.next()));
				
				System.out.println();
				
				controle.gravaDados(pessoa);
			} else if(opt == 2) {
				controle.getDados();
			}
		} while (opt != 3);
		sc.close();
	}

	private static void printaOpcoesMenu() {
		System.out.println();
		System.out.println("## Escolha uma das opções abaixo ##");
		System.out.println("1 - Cadastrar pessoa");
		System.out.println("2 - Imprimir pessoas");
		System.out.println("3 - Sair do programa");
		System.out.print("Digite aqui sua opção: ");
	}
	
	
}
