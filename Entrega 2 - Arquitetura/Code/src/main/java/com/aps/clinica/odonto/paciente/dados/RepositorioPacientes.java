package com.aps.clinica.odonto.paciente.dados;

import com.aps.clinica.odonto.paciente.negocio.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositorioPacientes implements IRepositorioPacientes {

    @Autowired
    private PacienteDAO pacienteDAO;

    @Override
    public void novoPaciente(Paciente paciente) {
        pacienteDAO.save(paciente);
    }

    @Override
    public Paciente existe(Long id) {
        return pacienteDAO.getReferenceById(id);
    }

    @Override
    public void excluirPaciente(Long id) {
        pacienteDAO.deleteById(id);
    }

    @Override
    public Iterable<Paciente> getAll(){
        return pacienteDAO.findAll();
    }

}
