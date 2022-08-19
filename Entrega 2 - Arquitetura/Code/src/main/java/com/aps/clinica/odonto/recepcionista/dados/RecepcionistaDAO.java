package com.aps.clinica.odonto.recepcionista.dados;

import com.aps.clinica.odonto.recepcionista.negocio.Recepcionista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecepcionistaDAO extends JpaRepository<Recepcionista, Long> {
}
