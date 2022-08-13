package com.aps.clinica.odonto.dados.paciente;

import com.aps.clinica.odonto.negocio.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteDAO extends JpaRepository<Paciente, Long> {
}
