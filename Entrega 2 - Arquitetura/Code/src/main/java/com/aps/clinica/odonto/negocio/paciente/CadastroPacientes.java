package com.aps.clinica.odonto.negocio.paciente;

import com.aps.clinica.odonto.dados.paciente.IRepositorioPacientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastroPacientes {

    @Autowired
    private IRepositorioPacientes repositorioPacientes;

    public void novoPaciente(Paciente paciente){
        repositorioPacientes.novoPaciente(paciente);
    }

    public Iterable<Paciente> getAll(){
        return repositorioPacientes.getAll();
    }
}
