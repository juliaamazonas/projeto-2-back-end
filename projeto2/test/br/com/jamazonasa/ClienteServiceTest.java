package br.com.jamazonasa;

import br.com.jamazonasa.dao.ClienteDaoMock;
import br.com.jamazonasa.dao.IClienteDao;
import br.com.jamazonasa.domain.Cliente;
import br.com.jamazonasa.service.ClienteService;
import br.com.jamazonasa.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDao dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);

    }

    @Before
    public void init() {

        cliente = new Cliente();
        cliente.setCpf(14728963225L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(11955555555L);


    }

    @Test
    public void pesquisarCliente() {


        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() {
        Boolean retorno = clienteService.salvar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());

    }

    @Test
    public void alterarCliente() {
        cliente.setNome("Rodrigo Pires");
        clienteService.alterar(cliente);

        Assert.assertEquals("Rodrigo Pires", cliente.getNome());


    }
}
