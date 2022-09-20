package com.aps.consulta.consulta.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;

@Component
public class ConsultaController {

    @Autowired
    private ConsultaCollection consultaCollection;

    @Autowired
    private IPacienteService pacienteService;

    @Transactional
    public void agendar(ConsultaDTO consultaDTO) throws ParseException {
        Consulta consulta = consultaDTO.toEntity();
        boolean pacienteExiste = pacienteService.pacienteExiste(consulta.getPaciente());

        if (pacienteExiste) consultaCollection.agendar(consulta);
    }

}
