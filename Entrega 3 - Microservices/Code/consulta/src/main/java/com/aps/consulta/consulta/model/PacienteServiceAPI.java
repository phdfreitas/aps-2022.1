package com.aps.consulta.consulta.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class PacienteServiceAPI implements IPacienteService{

    @Value("${paciente_service_url}")
    private String pacienteServiceUrl;

    private WebClient client(){
        return WebClient.builder().baseUrl(pacienteServiceUrl).build();
    }

    @Override
    public boolean pacienteExiste(Long idPaciente) {
        return (boolean) client().get().uri("/{id}", idPaciente).retrieve().bodyToMono(Boolean.class).block();
    }
}
