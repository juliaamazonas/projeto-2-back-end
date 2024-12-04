package br.com.jamazonasa.dao;

import br.com.jamazonasa.domain.Cliente;

public class ClienteDaoMock implements IClienteDao {

    @Override
    public Boolean salvar(Cliente cliente) {

        return true;
    }

    @Override
    public Boolean salvar() {

        return true;
    }

    @Override
    public Cliente buscarPorCpf(long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluir(long cpf) {

    }
}
