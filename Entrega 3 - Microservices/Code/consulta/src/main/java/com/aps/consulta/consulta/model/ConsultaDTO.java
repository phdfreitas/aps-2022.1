package com.aps.consulta.consulta.model;

import com.aps.consulta.procedimento.model.Procedimento;
import lombok.Value;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Value
public class ConsultaDTO {

    private Long paciente;
    private Procedimento procedimento;
    private String horario;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Consulta toEntity() throws ParseException {
        return Consulta.builder()
                .paciente(paciente)
                .procedimento(procedimento.getNome())
                .horario(sdf.parse(horario))
                .build();
    }

}
