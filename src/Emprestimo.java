
public class Emprestimo {
	private int ID_Emprestimo;
	private String situacao_empestimo;
	private int ID_PESSOA;
	private int Lista_Objeto;
	
	
	
	
	public Emprestimo(int iD_Emprestimo, String situacao_empestimo, int iD_PESSOA, int lista_Objeto) {
		ID_Emprestimo = iD_Emprestimo;
		this.situacao_empestimo = situacao_empestimo;
		ID_PESSOA = iD_PESSOA;
		Lista_Objeto = lista_Objeto;
	}
	public int getID_Emprestimo() {
		return ID_Emprestimo;
	}
	public void setID_Emprestimo(int iD_Emprestimo) {
		ID_Emprestimo = iD_Emprestimo;
	}
	public String getSituacao_empestimo() {
		return situacao_empestimo;
	}
	public void setSituacao_empestimo(String situacao_empestimo) {
		this.situacao_empestimo = situacao_empestimo;
	}
	public int getID_PESSOA() {
		return ID_PESSOA;
	}
	public void setID_PESSOA(int iD_PESSOA) {
		ID_PESSOA = iD_PESSOA;
	}
	public int getLista_Objeto() {
		return Lista_Objeto;
	}
	public void setLista_Objeto(int lista_Objeto) {
		Lista_Objeto = lista_Objeto;
	}
	
	
	
	
}
