package com.example.ac2_parte1_web.dtos;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.example.ac2_parte1_web.Models.Funcionario;
import com.example.ac2_parte1_web.Models.Projeto;

public class DadosProjetoDTO {
    private Integer id;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<String> funcionarios;

    public DadosProjetoDTO(Projeto projeto) {
        this.id = projeto.getId();
        this.descricao = projeto.getDescricao();
        this.dataInicio = projeto.getDataInicio();
        this.dataFim = projeto.getDataFim();
        this.funcionarios = projeto.getFuncionarios().stream()
                .map(Funcionario::getNome)
                .collect(Collectors.toList());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<String> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<String> funcionarios) {
        this.funcionarios = funcionarios;
    }
}