package com.aps.consulta.consulta.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaCollection {

    @Autowired
    private IConsultaRepository consultaRepository;

    public void agendar(Consulta consulta){
        consultaRepository.agendar(consulta);
    }

}
