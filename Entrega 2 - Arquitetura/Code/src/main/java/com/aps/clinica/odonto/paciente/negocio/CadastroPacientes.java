package com.aps.clinica.odonto.paciente.negocio;

import com.aps.clinica.odonto.paciente.dados.IRepositorioPacientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastroPacientes {

    @Autowired
    private IRepositorioPacientes repositorioPacientes;

    public void novoPaciente(Paciente paciente){
        repositorioPacientes.novoPaciente(paciente);
    }

    public Paciente existe(Long id){
        return repositorioPacientes.existe(id);
    }

    public void excluirPaciente(Long id){
        repositorioPacientes.excluirPaciente(id);
    }

    public Iterable<Paciente> getAll(){
        return repositorioPacientes.getAll();
    }
}
