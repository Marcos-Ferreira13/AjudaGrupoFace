
public class Pessoa {
	private int ID_pessoa;
	private String nome;
	private String CPF;
	private String telefone;
	private String email;
	private String rua;
	private String bairro;
	private int numEndereco;
	private String complemento;
	private String dataNascimento;
	
	
	
	
	public Pessoa(String nome, String cPF, String telefone, String email, String rua, String bairro, int numEndereco,
			String complemento, String dataNascimento) {
	
		this.nome = nome;
		CPF = cPF;
		this.telefone = telefone;
		this.email = email;
		this.rua = rua;
		this.bairro = bairro;
		this.numEndereco = numEndereco;
		this.complemento = complemento;
		this.dataNascimento = dataNascimento;
	}
	public int getID_pessoa() {
		return ID_pessoa;
	}
	public void setID_pessoa(int iD_pessoa) {
		ID_pessoa = iD_pessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public int getNumEndereco() {
		return numEndereco;
	}
	public void setNumEndereco(int numEndereco) {
		this.numEndereco = numEndereco;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	public String toString() {
		return "Nome:"+this.nome+"\nTelefone: "+this.telefone+"\nEmail: "+this.email+"\nRua:"+this.rua+"\nBairro: "+this.bairro+"Complemento: "+this.complemento;
	}
	
}
