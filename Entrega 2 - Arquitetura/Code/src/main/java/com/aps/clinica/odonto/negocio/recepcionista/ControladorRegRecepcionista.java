package com.aps.clinica.odonto.negocio.recepcionista;

import com.aps.clinica.odonto.email.EnviarCredenciaisRecepcionista;
import com.aps.clinica.odonto.email.IEnviarEmail;
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

    @Autowired
    private EnviarCredenciaisRecepcionista enviarCredenciaisRecepcionista;

    public void novoRecepcionista(Recepcionista recepcionista){
        cadastroRecepcionista.novoRecepcionista(recepcionista);
        criarConta(recepcionista);
        enviarCredenciais(recepcionista.getConta());
    }

    public void criarConta(Recepcionista recepcionista){
        gerarCredenciais(recepcionista);
    }

    public void enviarCredenciais(Conta conta) {
        enviarCredenciaisRecepcionista.enviarEmail(conta);
    }

    private void gerarCredenciais(Recepcionista recepcionista){
        Conta conta = new Conta(null, recepcionista, "abcdE123");
        recepcionista.setConta(conta); // Associa uma conta ao recepcionista
        cadastroConta.novaConta(conta); // Cadastra a conta do recepcionista no sistema
    }
}
