package com.aps.clinica.odonto.email;

import com.aps.clinica.odonto.negocio.conta.Conta;

public interface IEnviarEmail {

    void enviarEmail(Conta conta);

}
