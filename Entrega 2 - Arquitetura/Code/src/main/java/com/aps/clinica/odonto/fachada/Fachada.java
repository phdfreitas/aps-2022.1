package com.aps.clinica.odonto.fachada;

import com.aps.clinica.odonto.paciente.negocio.ControladorRegPaciente;
import com.aps.clinica.odonto.paciente.negocio.Paciente;
import com.aps.clinica.odonto.recepcionista.negocio.ControladorRegRecepcionista;
import com.aps.clinica.odonto.recepcionista.negocio.Recepcionista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fachada {

    @Autowired
    private ControladorRegPaciente controladorRegPaciente;

    @Autowired
    private ControladorRegRecepcionista controladorRegRecepcionista;

    // =-=-= PACIENTE =-=-=
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

    // =-=-= RECEPCIONISTA =-=-=
    public void novoRecepcionista(Recepcionista recepcionista){
        controladorRegRecepcionista.novoRecepcionista(recepcionista);
    }
}
