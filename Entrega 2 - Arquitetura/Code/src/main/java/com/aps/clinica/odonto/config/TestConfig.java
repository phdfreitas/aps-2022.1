package com.aps.clinica.odonto.config;

import com.aps.clinica.odonto.negocio.Fachada;
import com.aps.clinica.odonto.negocio.paciente.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private Fachada fachada;

    @Override
    public void run(String... args) throws Exception {
        Paciente paciente1 = new Paciente(null, "111.111.111-11", "João", "40028922");
        Paciente paciente2 = new Paciente(null, "111.111.111-22", "Maria", "40028921");
        Paciente paciente3 = new Paciente(null, "111.111.111-33", "José", "40028923");
        Paciente paciente4 = new Paciente(null, "111.111.111-44", "John", "40028920");
        Paciente paciente5 = new Paciente(null, "111.111.111-55", "Marie", "40028924");

        fachada.novoPaciente(paciente1);
        fachada.novoPaciente(paciente2);
        fachada.novoPaciente(paciente3);
        fachada.novoPaciente(paciente4);
        fachada.novoPaciente(paciente5);

    }
}
