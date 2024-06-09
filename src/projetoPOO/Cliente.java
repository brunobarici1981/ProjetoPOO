package projetoPOO;

import javax.swing.JOptionPane;

public class Cliente {
	private String nome, enderecoCliente, enderecoEntrega, cpf;
	private double valorProduto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Cliente(String nome, String enderecoCliente, String enderecoEntrega, String cpf, double valorProduto) {
		super();
		this.nome = nome;
		this.enderecoCliente = enderecoCliente;
		this.enderecoEntrega = enderecoEntrega;
		this.cpf = cpf;
		this.valorProduto = valorProduto;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", enderecoCliente=" + enderecoCliente + ", enderecoEntrega=" + enderecoEntrega
				+ ", cpf=" + cpf + ", valorProduto=" + valorProduto + "]";
	}
	
    public void criarCliente() {
    	setNome(JOptionPane.showInputDialog("Digite seu nome"));
    	setEnderecoCliente(JOptionPane.showInputDialog("Digite seu endereço"));
    	setEnderecoEntrega(JOptionPane.showInputDialog("Digite o endereco da entrega"));
    	setCpf(JOptionPane.showInputDialog("Digite seu cpf"));
    	setValorProduto(Double.parseDouble(JOptionPane.showInputDialog("Digite seu cpf")));
    }
}
