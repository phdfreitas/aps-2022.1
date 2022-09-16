package com.aps.consulta.procedimento.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcedimentoController {

    @Autowired
    private ProcedimentoCollection procedimentoCollection;

    public void cadastrar(ProcedimentoDTO procedimentoDTO){
        procedimentoCollection.cadastrar(procedimentoDTO.toEntity());
    }

}
