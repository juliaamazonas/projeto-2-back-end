package br.com.jamazonasa.dao;

import br.com.jamazonasa.domain.Cliente;

public class ClienteDAO implements IClienteDao {

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
        return null;
    }

    @Override
    public void excluir(long cpf) {

    }


}
