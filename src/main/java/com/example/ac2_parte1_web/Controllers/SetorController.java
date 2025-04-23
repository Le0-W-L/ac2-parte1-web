package com.example.ac2_parte1_web.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac2_parte1_web.Models.Setor;
import com.example.ac2_parte1_web.Services.SetorService;

@RestController
@RequestMapping("/setores")
public class SetorController {

    @Autowired
    private SetorService setorService;

    @PostMapping
    public void adicionar(@RequestBody Setor setor) {
        setorService.adicionar(setor);
    }

    @GetMapping("/{id}")
    public Setor buscarSetorPorId(@PathVariable Integer id) {
        return setorService.buscarSetorPorId(id);
    }

    @GetMapping
    public List<Setor> listarComFuncionarios() {
        return setorService.listarSetoresComFuncionarios();
    }
}