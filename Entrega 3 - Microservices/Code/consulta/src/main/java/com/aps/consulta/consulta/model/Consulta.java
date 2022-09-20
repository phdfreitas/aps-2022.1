package com.aps.consulta.consulta.model;

import com.aps.consulta.procedimento.model.Procedimento;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long paciente;
    private String procedimento;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date horario;
}
