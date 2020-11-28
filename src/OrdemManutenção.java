
public class OrdemManutenção {
	private int ID_Manutencao;
	private String dataInicio;
	private String dataFim;
	private int IDtipoServico;
	private int ID_Objeto;
	
	
	
	public OrdemManutenção(int iD_Manutencao, String dataInicio, String dataFim, int IDtipoServico,
			int iD_Objeto) {
		ID_Manutencao = iD_Manutencao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.IDtipoServico = IDtipoServico;
		ID_Objeto = iD_Objeto;
	}
	
	public int getID_Manutencao() {
		return ID_Manutencao;
	}

	public void setID_Manutencao(int iD_Manutencao) {
		ID_Manutencao = iD_Manutencao;
	}

	public String getData() {
		return dataInicio;
	}
	public void setData(String data) {
		this.dataInicio = data;
	}
	
	
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	
	public int getIDtipoServico() {
		return IDtipoServico;
	}

	public void setIDtipoServico(int iDtipoServico) {
		IDtipoServico = iDtipoServico;
	}

	public int getID_Objeto() {
		return ID_Objeto;
	}

	public void setID_Objeto(int iD_Objeto) {
		ID_Objeto = iD_Objeto;
	}

	

}
