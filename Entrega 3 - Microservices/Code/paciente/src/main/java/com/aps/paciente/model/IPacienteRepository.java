package com.aps.paciente.model;

public interface IPacienteRepository {

    void cadastrar(Paciente paciente);

    boolean existe(Long id);

}
