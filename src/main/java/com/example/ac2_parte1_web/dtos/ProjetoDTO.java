package com.example.ac2_parte1_web.dtos;

import java.time.LocalDate;

import com.example.ac2_parte1_web.Models.Projeto;

public class ProjetoDTO {
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Projeto toEntity() {
        Projeto projeto = new Projeto();
        projeto.setDescricao(this.descricao);
        projeto.setDataInicio(this.dataInicio);
        projeto.setDataFim(this.dataFim);
        return projeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }    
}