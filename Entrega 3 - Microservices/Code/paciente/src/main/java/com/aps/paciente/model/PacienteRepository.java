package com.aps.paciente.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PacienteRepository implements IPacienteRepository{

    @Autowired private PacienteDAO pacienteDAO;

    @Override
    public void cadastrar(Paciente paciente) {
        pacienteDAO.save(paciente);
    }

    @Override
    public boolean existe(Long id) {
        return pacienteDAO.existsById(id);
    }
}
