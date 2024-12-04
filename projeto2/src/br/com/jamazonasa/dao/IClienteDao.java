package br.com.jamazonasa.dao;

import br.com.jamazonasa.domain.Cliente;

public interface IClienteDao {


    Boolean salvar(Cliente cliente);


    Boolean salvar();

    Cliente buscarPorCpf(long cpf);

    void excluir(long cpf);
}
