package com.aps.clinica.odonto.negocio.conta;

import com.aps.clinica.odonto.negocio.recepcionista.Recepcionista;

import javax.persistence.*;

@Entity
@Table(name = "tb_contas")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String senha;

    @OneToOne
    @MapsId
    private Recepcionista recepcionista; // Mapeamento 1:1, vai criar a chave estrangeira

    public Conta(){}

    public Conta(Long id, Recepcionista recepcionista, String senha) {
        this.id = id;
        this.senha = senha;
        this.recepcionista = recepcionista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }
}
