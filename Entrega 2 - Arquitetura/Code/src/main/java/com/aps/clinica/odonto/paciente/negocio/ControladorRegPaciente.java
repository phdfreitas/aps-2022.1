package com.aps.clinica.odonto.paciente.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControladorRegPaciente {

    @Autowired
    private CadastroPacientes cadastroPacientes;

    public void novoPaciente(Paciente paciente){
        cadastroPacientes.novoPaciente(paciente);
    }

    public Paciente existe(Long id){
        return cadastroPacientes.existe(id);
    }

    public void excluirPaciente(Long id){
        cadastroPacientes.excluirPaciente(id);
    }

    public Iterable<Paciente> getAll(){
        return cadastroPacientes.getAll();
    }
}
