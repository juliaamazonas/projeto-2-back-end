package br.com.jamazonasa.dao;

import br.com.jamazonasa.dao.generics.GenericDAO;
import br.com.jamazonasa.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDao {

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

    @Override
    public Class<Cliente> getTipoClasse() {
        return null;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }


}
