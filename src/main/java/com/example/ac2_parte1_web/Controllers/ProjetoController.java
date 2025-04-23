package com.example.ac2_parte1_web.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac2_parte1_web.Models.Projeto;
import com.example.ac2_parte1_web.Services.ProjetoService;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public void adicionar(@RequestBody Projeto projeto) {
        projetoService.adicionar(projeto);
    }

    @GetMapping("/{id}")
    public Projeto buscarProjetoPorId(@PathVariable Integer id) {
        return projetoService.buscarProjetoPorId(id);
    }

    @PutMapping("/{idProjeto}/funcionarios/{idFuncionario}")
    public void vincularFuncionario(@PathVariable Integer idProjeto, @PathVariable Integer idFuncionario) {
        projetoService.vincularFuncionario(idProjeto, idFuncionario);
    }
}