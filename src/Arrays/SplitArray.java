package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import projetoPOO.Cliente;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Bruno , java , 10 , 9 , 8 , 10";

		String[] arraySplit = text.split(",");
		for (int i = 0; i < arraySplit.length; i++) {
			// System.out.println(arraySplit[i]);

		}
		List<String> convertArrayTolist = Arrays.asList(arraySplit);

		for (String array : convertArrayTolist) {
			System.out.println(array);
		}
		boolean sair=true;

		while (sair) {
			List<Cliente> clientes = new ArrayList();
			Cliente cliente = new Cliente();
			cliente.criarCliente();
			clientes.add(cliente);
			System.out.println(clientes);
			int decisao = JOptionPane.showConfirmDialog(null, "Deseja sair do cadastro?");
			if (decisao == 0)
				sair = false;
			else
				sair = true;
		}

	}

}
