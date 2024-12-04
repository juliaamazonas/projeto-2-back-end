package br.com.jamazonasa.dao;

import br.com.jamazonasa.dao.exception.TipoChaveNaoEncontradaException;
import br.com.jamazonasa.domain.Cliente;

import java.util.Collection;
import java.util.List;

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

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return null;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Cliente consultar(Long valor) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return List.of();
    }
}
