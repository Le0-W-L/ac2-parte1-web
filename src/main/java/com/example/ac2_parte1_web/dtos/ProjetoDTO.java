package com.example.ac2_parte1_web.dtos;

import java.time.LocalDate;

import com.example.ac2_parte1_web.Models.Projeto;

public class ProjetoDTO {
    private Integer id;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public ProjetoDTO(Integer id, String descricao, LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Projeto toEntity() {
        Projeto projeto = new Projeto();
        projeto.setId(this.id);
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }    
}