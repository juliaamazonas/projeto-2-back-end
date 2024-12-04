package br.com.jamazonasa.service;

import br.com.jamazonasa.domain.Cliente;

public interface IClienteService {

    Boolean salvar(Cliente cliente);

    Cliente buscarPorCpf(long cpf);

    void excluir(long cpf);
}
