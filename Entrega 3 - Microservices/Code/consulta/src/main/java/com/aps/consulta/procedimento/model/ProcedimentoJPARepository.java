package com.aps.consulta.procedimento.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcedimentoJPARepository implements IProcedimentoRepository{

    @Autowired
    private ProcedimentoDAO procedimentoDAO;

    @Override
    public void cadastrar(Procedimento procedimento) {
        procedimentoDAO.save(procedimento);
    }
}
