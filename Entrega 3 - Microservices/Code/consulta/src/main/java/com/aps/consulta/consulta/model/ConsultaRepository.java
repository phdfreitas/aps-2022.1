package com.aps.consulta.consulta.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaRepository implements IConsultaRepository{

    @Autowired
    private ConsultaDAO consultaDAO;

    public void agendar(Consulta consulta){
        consultaDAO.save(consulta);
    }

}
