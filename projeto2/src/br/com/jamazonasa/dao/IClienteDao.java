package br.com.jamazonasa.dao;

import br.com.jamazonasa.dao.generics.IGenericDAO;
import br.com.jamazonasa.domain.Cliente;

public interface IClienteDao extends IGenericDAO<Cliente> {


    Boolean salvar(Cliente cliente);


    Boolean salvar();

    Cliente buscarPorCpf(long cpf);

    void excluir(long cpf);

    void alterar(Cliente cliente);
}
