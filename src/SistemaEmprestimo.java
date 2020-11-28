import java.util.ArrayList;
import java.util.List;

public class SistemaEmprestimo {
	
	private List <Pessoa> clientes;
	private List <Emprestimo> emprestimo;
	private List <TipoObjeto> tipoObjeto;
	private List <OrdemManutenção> manutencao;
	private List <TipoDeServico> tipoServico;
	
	public SistemaEmprestimo() {
		this.clientes = new ArrayList<>();
		this.emprestimo = new ArrayList<>();
		this.tipoObjeto = new ArrayList<>();
		this.manutencao = new ArrayList<>();
		this.tipoServico = new ArrayList<>();
		
	}
	
	public boolean consultarSeClienteExiste(String CPF) {
		for(Pessoa c : clientes) {
			if(c.getCPF().equals(CPF)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean cadastraCliente(String nome, String CPF, String telefone, String email, String rua, String bairro,int numEndereco,
			String complemento,String dataNascimento) {
			Pessoa cliente = new Pessoa(nome,CPF,telefone,email,rua,bairro,numEndereco,complemento,dataNascimento);
		if(!consultarSeClienteExiste(CPF)) {
			this.clientes.add(cliente);
			return true;
		}
		return false;
	}
	
	
	public void cadastraTipoObjeto(int idObjeto,String descricao) {
		TipoObjeto tipo = new TipoObjeto(idObjeto,descricao);
		this.tipoObjeto.add(tipo);
	}
	
	public void cadastraEmprestimo(int idEmprestimo,String situacao,int idPessoa, int idLista) {
		Emprestimo emprestimo = new Emprestimo(idEmprestimo,situacao,idPessoa,idLista);
		this.emprestimo.add(emprestimo);
		
	}
	
	public void cadastraManutencao(int idManutencao,String dataAbertura,String dataFim,int idTipoServico,int idObjeto) {
		OrdemManutenção novaOrdem = new OrdemManutenção(idManutencao,dataAbertura,dataFim,idTipoServico,idObjeto);
		this.manutencao.add(novaOrdem);
	}
	
	public void cadastraTipoServico(int idServico,String descricao,String servico,int orcamento) {
		TipoDeServico tipoServico = new TipoDeServico(idServico,descricao,servico,orcamento);
		this.tipoServico.add(tipoServico);
		
	}
	
	public List <Pessoa>consultarCliente(String CPF) {
		List <Pessoa> cliente = new ArrayList<>();
		for(Pessoa c : clientes) {
			if(c.getCPF().equals(CPF)) {
				cliente.add(c);
				
			}
		}
		return cliente;
	}
	
	


}


