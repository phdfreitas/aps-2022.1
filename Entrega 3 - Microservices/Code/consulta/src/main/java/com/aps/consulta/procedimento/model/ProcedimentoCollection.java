package com.aps.consulta.procedimento.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcedimentoCollection {

    @Autowired
    private IProcedimentoRepository procedimentoRepository;

    public void cadastrar(Procedimento procedimento){
        procedimentoRepository.cadastrar(procedimento);
    }

}
