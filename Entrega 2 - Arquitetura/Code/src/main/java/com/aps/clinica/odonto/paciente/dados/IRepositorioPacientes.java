package com.aps.clinica.odonto.paciente.dados;

import com.aps.clinica.odonto.paciente.negocio.Paciente;

public interface IRepositorioPacientes {

    void novoPaciente(Paciente paciente);

    Paciente existe(Long id);

    void excluirPaciente(Long id);

    Iterable<Paciente> getAll();
}
