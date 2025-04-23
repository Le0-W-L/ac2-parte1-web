package com.example.ac2_parte1_web.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac2_parte1_web.Models.Funcionario;
import com.example.ac2_parte1_web.Models.Projeto;
import com.example.ac2_parte1_web.Services.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public void adicionar(@RequestBody Funcionario funcionario) {
        funcionarioService.adicionar(funcionario);
    }

    @GetMapping("/{id}/projetos")
    public List<Projeto> buscarProjetos(@PathVariable Integer id) {
        return funcionarioService.buscarProjetos(id);
    }
}