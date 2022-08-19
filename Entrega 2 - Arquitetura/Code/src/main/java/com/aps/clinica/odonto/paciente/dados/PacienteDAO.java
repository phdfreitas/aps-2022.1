package com.aps.clinica.odonto.paciente.dados;

import com.aps.clinica.odonto.paciente.negocio.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteDAO extends JpaRepository<Paciente, Long> {
}
