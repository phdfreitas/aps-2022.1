package com.aps.consulta.consulta.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class PacienteServiceAPI implements IPacienteService{

    @Autowired
    WebClient.Builder nBuilder;

    private WebClient client(){
        return nBuilder.baseUrl("lb://paciente").build();
    }

    @Override
    public boolean pacienteExiste(Long idPaciente) {
        return (boolean) client().get().uri("paciente/{id}", idPaciente).retrieve().bodyToMono(Boolean.class).block();
    }
}
