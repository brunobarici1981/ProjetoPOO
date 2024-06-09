package projetoPOO;

import javax.swing.JOptionPane;

public class TesteVendaProduto {

	public static void main(String[] args) {
		//Cliente cliente = new Cliente();
		//cliente.criarCliente();
		Produto produto = new Produto();
		produto.cadastrarProdutos();
		produto.listarProdutos();
	}

}
