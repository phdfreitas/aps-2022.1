package com.aps.clinica.odonto.negocio.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControladorRegPaciente {

    @Autowired
    private CadastroPacientes cadastroPacientes;

    public void novoPaciente(Paciente paciente){
        cadastroPacientes.novoPaciente(paciente);
    }

    public Iterable<Paciente> getAll(){
        return cadastroPacientes.getAll();
    }

}
