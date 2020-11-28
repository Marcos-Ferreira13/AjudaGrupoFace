
public class Lista_objeto_emprestado {
	private int Lista_obj_emprestimo;
	private int ID_objeto;
	private String nome_objeto;
	private String situacao_objeto;
	public int getLista_obj_emprestimo() {
		return Lista_obj_emprestimo;
	}
	public void setLista_obj_emprestimo(int lista_obj_emprestimo) {
		Lista_obj_emprestimo = lista_obj_emprestimo;
	}
	public int getID_objeto() {
		return ID_objeto;
	}
	public void setID_objeto(int iD_objeto) {
		ID_objeto = iD_objeto;
	}
	public String getNome_objeto() {
		return nome_objeto;
	}
	public void setNome_objeto(String nome_objeto) {
		this.nome_objeto = nome_objeto;
	}
	public String getSituacao_objeto() {
		return situacao_objeto;
	}
	public void setSituacao_objeto(String situacao_objeto) {
		this.situacao_objeto = situacao_objeto;
	}

}
