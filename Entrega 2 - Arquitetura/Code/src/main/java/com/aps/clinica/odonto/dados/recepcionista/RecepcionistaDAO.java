package com.aps.clinica.odonto.dados.recepcionista;

import com.aps.clinica.odonto.negocio.recepcionista.Recepcionista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecepcionistaDAO extends JpaRepository<Recepcionista, Long> {
}
