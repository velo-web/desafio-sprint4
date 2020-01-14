import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ControleIO {
	
	public void gravaDados(Pessoa pessoa) throws IOException {
		FileWriter fw = new FileWriter("pessoas.txt", true);
		fw.write(pessoa.toSave());
		fw.write(System.lineSeparator());
		fw.close();
	}

	public void getDados() {
		Pessoa pessoa;
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		
		try {
			Scanner scan = new Scanner(new File("pessoas.txt"));
			
			
			while(scan.hasNext()) {
				String linha = scan.nextLine();
				
				Scanner scannerDaLinha = new Scanner(linha);
				scannerDaLinha.useDelimiter(",");

				pessoa = new Pessoa();
				pessoa.setCodigo(scannerDaLinha.nextInt());
				pessoa.setNome(scannerDaLinha.next());
				pessoa.setEndereco(scannerDaLinha.next());
				pessoa.setIdade(scannerDaLinha.nextInt());
				
				lista.add(pessoa);
				
				scannerDaLinha.close();
			}
			
			System.out.println(lista);
			scan.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}
		
		
	}

	
}
