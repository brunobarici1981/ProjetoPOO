package projetoPOO;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Produto {

	private String id, nomeProduto;
	private double valorProduto;
	private List listaDeProdutosDisponiveis = new ArrayList();

	public Produto() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public void cadastrarProdutos() {
		boolean sair = true;
		int cont=0;
		boolean escolhaSair = true;
		while(sair&& escolhaSair) {
			
			String nome = JOptionPane.showInputDialog("Insira o nome do produto");
		    String id = JOptionPane.showInputDialog("Insira o id do produto");
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto"));
			Produto produto = new Produto(nome,id,valor);
			listaDeProdutosDisponiveis.add(produto);
			
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar outro produto ao estoque?");
			
			if(escolha == 0) {
				sair = true;
				cont = cont+1;
			}else {
				sair = false;
			}
		}
		listarProdutos(listaDeProdutosDisponiveis,cont+1);

	}

	public Produto(String id, String nomeProduto, double valorProduto) {
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		
	}

	public void listarProdutos(List produtos, int qtdProdutos) {

		for (int i = 0; i <qtdProdutos; i++) {

			JOptionPane.showMessageDialog(null, produtos.get(i).toString());
		}
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nomeProduto=" + nomeProduto + ", valorProduto=" + valorProduto;
	}

	public void carrinhoDeCompras() {

	}

}
