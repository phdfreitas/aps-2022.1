package com.aps.consulta.procedimento.communication;

import com.aps.consulta.procedimento.model.ProcedimentoController;
import com.aps.consulta.procedimento.model.ProcedimentoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/procedimento")
@Slf4j
public class ProcedimentoMVCControler {

    @Autowired
    private ProcedimentoController procedimentoController;

    @GetMapping("novoProcedimento")
    public String novoPaciente(){
        return "cadastro";
    }

    @PostMapping("novoProcedimento")
    public String novoPaciente(@ModelAttribute ProcedimentoDTO procedimentoDTO){

        procedimentoController.cadastrar(procedimentoDTO);
        return "redirect:/procedimento/novoProcedimento";
    }

}
