package sistemabancario;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTeste {
	@Test
	public void testePesquisaCliente() {
		/*criando clientes para instaciar no caso de Teste*/
		
		Cliente cliente01 = new Cliente(1, "Clayton", 47, "clayton@gmail.com", 1 ,true);
		Cliente cliente02 = new Cliente(2, "Maria", 10, "maria@gmail.com", 1 ,true);
		
		List <Cliente> clientes = new ArrayList();
		clientes.add(cliente01);
		clientes.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientes);
		
		//Fim do cenário
		
		
		//Execução
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		//Análise do resultado esperado
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), is("clayton@gmail.com"));
	}
	
	@Test
	public void testeAdicionaCliente() {
		Cliente cliente03 = new Cliente(3, "João", 20, "joao@gmail.com", 1 ,true);
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente03);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientes);
		
		Cliente cliente = gerClientes.pesquisaCliente(3);
		
		assertThat(cliente.getId(), is(3));
		assertThat(cliente.getEmail(), is("joao@gmail.com"));
	}
	
}
