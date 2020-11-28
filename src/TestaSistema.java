import javax.swing.JOptionPane;

public class TestaSistema {
	public static void main(String[] args) {
		SistemaEmprestimo a = new SistemaEmprestimo();
		boolean continuar = true;
		while (continuar) {
			int option = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite uma opção:\n" + "1.Cadastrar Cliente\n" + "2.Consultar Cliente\n" + "0.Sair"));
			switch (option) {
			case 0:
				continuar = false;
				JOptionPane.showMessageDialog(null, "Tenha um ótimo dia!");
				break;
			case 1:
				String nome = JOptionPane.showInputDialog("nome: ");
				String CPF = JOptionPane.showInputDialog("CPF: ");
				String telefone = JOptionPane.showInputDialog("telefone: ");
				String email = JOptionPane.showInputDialog("email: ");
				String rua = JOptionPane.showInputDialog("Rua:");
				String bairro = JOptionPane.showInputDialog("Bairro:");
				int numEndereco = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
				String complemento = JOptionPane.showInputDialog("complemento: ");
				String dataNascimento = JOptionPane.showInputDialog("Data de nascimento: ");
				boolean cadastrou = a.cadastraCliente(nome, CPF, telefone, email, rua, bairro, numEndereco, complemento,
						dataNascimento);

				if (cadastrou) {
					JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
				} else {
					JOptionPane.showMessageDialog(null, "Cliente já existe");
				}
				break;

			case 2:
				String cpf = JOptionPane.showInputDialog("CPF do cliente:");

				for (int i = 0; i < 1; i++) {
					JOptionPane.showMessageDialog(null, a.consultarCliente(cpf).get(i));
				}
				break;
			}
		}
	}
}
