package com.aps.clinica.odonto.negocio.recepcionista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControladorRegRecepcionista {

    @Autowired
    private CadastroRecepcionista cadastroRecepcionista;

    public void novoRecepcionista(Recepcionista recepcionista){
        cadastroRecepcionista.novoRecepcionista(recepcionista);
    }

}
