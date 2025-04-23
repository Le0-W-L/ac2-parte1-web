package com.example.ac2_parte1_web.dtos;

import java.util.List;
import java.util.stream.Collectors;

import com.example.ac2_parte1_web.Models.Funcionario;
import com.example.ac2_parte1_web.Models.Setor;

public class DadosSetorDTO {
    private Integer id;
    private String nome;
    private List<String> funcionarios;

    public DadosSetorDTO(Setor setor) {
        this.id = setor.getId();
        this.nome = setor.getNome();
        this.funcionarios = setor.getFuncionarios().stream()
                .map(Funcionario::getNome)
                .collect(Collectors.toList());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<String> funcionarios) {
        this.funcionarios = funcionarios;
    }    
}   