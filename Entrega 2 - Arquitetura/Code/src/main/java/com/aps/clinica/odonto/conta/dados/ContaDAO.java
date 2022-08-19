package com.aps.clinica.odonto.conta.dados;

import com.aps.clinica.odonto.conta.negocio.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaDAO extends JpaRepository<Conta, Long> {
}
