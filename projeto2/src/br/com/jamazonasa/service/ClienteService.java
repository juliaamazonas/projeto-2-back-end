package br.com.jamazonasa.service;

import br.com.jamazonasa.dao.ClienteDAO;
import br.com.jamazonasa.dao.IClienteDao;
import br.com.jamazonasa.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDAO) {
        this.clienteDao = clienteDAO;
    }

    public ClienteService(){
        clienteDao = new ClienteDAO();
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        clienteDao.salvar(cliente);

        return true;
    }

    @Override
    public Cliente buscarPorCpf(long cpf) {
        return clienteDao.buscarPorCpf(cpf);
    }

    @Override
    public void excluir(long cpf) {

    }
}
