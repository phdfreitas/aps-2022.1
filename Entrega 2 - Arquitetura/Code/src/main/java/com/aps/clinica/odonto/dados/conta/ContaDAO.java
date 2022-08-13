package com.aps.clinica.odonto.dados.conta;

import com.aps.clinica.odonto.negocio.conta.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaDAO extends JpaRepository<Conta, Long> {
}
