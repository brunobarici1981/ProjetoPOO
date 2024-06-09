package projetoPOO;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Produto {
	
private String id,nomeProduto;
private double valorProduto;
private List listaDeProdutosDisponiveis = new ArrayList();


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
	listaDeProdutosDisponiveis.add(1);
	Produto produto = new Produto();
	for (int i=0; i > listaDeProdutosDisponiveis.size(); i++) {
	produto.setNomeProduto(JOptionPane.showInputDialog("Insira o nome do produto"));
	produto.setId(JOptionPane.showInputDialog("Insira o id do produto"));
	produto.setValorProduto(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto")));
	listaDeProdutosDisponiveis.add(produto);
	listaDeProdutosDisponiveis.remove(0);
	int escolha = JOptionPane.showConfirmDialog(null,"Deseja adicionar outro produto ao estoque?");
	JOptionPane.showMessageDialog(null,"Numero id :"+ escolha);
	if(escolha == 0) {
		continue;
	}
    else 
    	break;
	}
	
    
}
public void listarProdutos() {
	
	for(int i=0; i< listaDeProdutosDisponiveis.size(); i++ ) {
		
		JOptionPane.showMessageDialog(null,listaDeProdutosDisponiveis.get(i));
	}
}

@Override
public String toString() {
	return "Produto [id=" + id + ", nomeProduto=" + nomeProduto + ", valorProduto=" + valorProduto ;
}

public void carrinhoDeCompras() {
	
}


}
