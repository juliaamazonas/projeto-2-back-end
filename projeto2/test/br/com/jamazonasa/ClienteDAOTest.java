package br.com.jamazonasa;

import br.com.jamazonasa.dao.ClienteDAO;
import br.com.jamazonasa.dao.ClienteDaoMock;
import br.com.jamazonasa.dao.IClienteDao;
import br.com.jamazonasa.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDao clienteDao;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDao = new ClienteDaoMock();
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
        clienteDao.salvar(cliente);

    }

    @Test
    public void pesquisarCliente() {


        Cliente clienteConsultado = clienteDao.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() {
        Boolean retorno = clienteDao.salvar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());

    }

    @Test
    public void alterarCliente() {
        cliente.setNome("Rodrigo Pires");
        clienteDao.alterar(cliente);
        Assert.assertEquals("Rodrigo Pires", cliente.getNome());
    }

}
