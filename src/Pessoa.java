
public class Pessoa {

	private int codigo;
	private int idade;
	private String nome;
	private String endereco;
	
	@Override
	public String toString() {
		return "\nCódigo: "+codigo+", Nome: "+nome+", Endereco: "+endereco+", Idade: "+idade;
	}
	
	public String toSave() {
		return codigo +","+nome+","+endereco+","+idade;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
