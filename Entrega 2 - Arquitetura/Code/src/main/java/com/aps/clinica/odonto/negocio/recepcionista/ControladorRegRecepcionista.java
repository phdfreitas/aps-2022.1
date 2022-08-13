package com.aps.clinica.odonto.negocio.recepcionista;

import com.aps.clinica.odonto.negocio.conta.CadastroConta;
import com.aps.clinica.odonto.negocio.conta.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControladorRegRecepcionista {

    @Autowired
    private CadastroRecepcionista cadastroRecepcionista;

    @Autowired
    private CadastroConta cadastroConta;

    public void novoRecepcionista(Recepcionista recepcionista){
        cadastroRecepcionista.novoRecepcionista(recepcionista);
    }

    public void criarConta(Recepcionista recepcionista){
        gerarCcredenciais(recepcionista);
    }

    private void gerarCcredenciais(Recepcionista recepcionista){
        Conta conta = new Conta(null, recepcionista.getEmail(), "123456");
        cadastroConta.novaConta(conta);
    }
}
