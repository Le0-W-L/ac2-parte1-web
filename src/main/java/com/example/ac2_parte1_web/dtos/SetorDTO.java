package com.example.ac2_parte1_web.dtos;

import com.example.ac2_parte1_web.Models.Setor;

public class SetorDTO {
    private String nome;

    public Setor toEntity() {
        Setor setor = new Setor();
        setor.setNome(this.nome);
        return setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
