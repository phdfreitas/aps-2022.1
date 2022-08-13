package com.aps.clinica.odonto.negocio;

import com.aps.clinica.odonto.negocio.paciente.ControladorRegPaciente;
import com.aps.clinica.odonto.negocio.paciente.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fachada {

    @Autowired
    private ControladorRegPaciente controladorRegPaciente;

    public void novoPaciente(Paciente paciente){
        controladorRegPaciente.novoPaciente(paciente);
    }

    public Paciente existe(Long id){
        return controladorRegPaciente.existe(id);
    }

    public void excluirPaciente(Long id){
        controladorRegPaciente.excluirPaciente(id);
    }

    public Iterable<Paciente> getAllPacientes(){
        return controladorRegPaciente.getAll();
    }

}
