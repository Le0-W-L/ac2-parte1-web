package com.example.ac2_parte1_web.dtos;

import com.example.ac2_parte1_web.Models.Funcionario;

public class FuncionarioDTO {
    private String nome;

    public Funcionario toEntity() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(this.nome);
        return funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}