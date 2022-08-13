package com.aps.clinica.odonto.negocio.recepcionista;

import com.aps.clinica.odonto.dados.recepcionista.IRepositorioRecepcionista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastroRecepcionista {

    @Autowired
    private IRepositorioRecepcionista repositorioRecepcionista;

    public void novoRecepcionista(Recepcionista recepcionista){
        repositorioRecepcionista.novoRecepcionista(recepcionista);
    }

}
