package com.example.CorrecaoProva.entity;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String rua;
    private Long id;
    private String cep;
    private  String numero;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Long getId() {
        return id;
    }

    public Endereco(String rua, String cep, String numero) {
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
