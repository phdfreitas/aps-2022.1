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
