package com.aps.clinica.odonto.recepcionista.dados;

import com.aps.clinica.odonto.recepcionista.negocio.Recepcionista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositorioRecepcionista implements IRepositorioRecepcionista{

    @Autowired
    private RecepcionistaDAO recepcionistaDAO;

    @Override
    public void novoRecepcionista(Recepcionista recepcionista) {
        recepcionistaDAO.save(recepcionista);
    }
}
