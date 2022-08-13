package com.aps.clinica.odonto.dados.paciente;

import com.aps.clinica.odonto.negocio.paciente.Paciente;

public interface IRepositorioPacientes {

    void novoPaciente(Paciente paciente);

    Paciente existe(Long id);

    void excluirPaciente(Long id);

    Iterable<Paciente> getAll();
}
