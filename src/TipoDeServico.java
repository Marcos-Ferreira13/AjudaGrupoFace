
public class TipoDeServico {
	private int ID_tipo_Servico;
	private String descricao;
	private String servico_realizado;
	private int orcamento;
	
	
	
	public TipoDeServico(int iD_tipo_Servico, String descricao, String servico_realizado, int orcamento) {
		
		ID_tipo_Servico = iD_tipo_Servico;
		this.descricao = descricao;
		this.servico_realizado = servico_realizado;
		this.orcamento = orcamento;
	}
	public int getID_tipo_Servico() {
		return ID_tipo_Servico;
	}
	public void setID_tipo_Servico(int iD_tipo_Servico) {
		ID_tipo_Servico = iD_tipo_Servico;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getServico_realizado() {
		return servico_realizado;
	}
	public void setServico_realizado(String servico_realizado) {
		this.servico_realizado = servico_realizado;
	}
	public int getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(int orcamento) {
		this.orcamento = orcamento;
	}
	

}
