package com.aps.clinica.odonto.negocio;

import com.aps.clinica.odonto.negocio.conta.Conta;
import com.aps.clinica.odonto.negocio.paciente.ControladorRegPaciente;
import com.aps.clinica.odonto.negocio.paciente.Paciente;
import com.aps.clinica.odonto.negocio.recepcionista.ControladorRegRecepcionista;
import com.aps.clinica.odonto.negocio.recepcionista.Recepcionista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

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

    public void criarConta(Recepcionista recepcionista){
        controladorRegRecepcionista.criarConta(recepcionista);
    }

    public void enviarCredenciais(Conta conta) {
        controladorRegRecepcionista.enviarCredenciais(conta);
    }
}
