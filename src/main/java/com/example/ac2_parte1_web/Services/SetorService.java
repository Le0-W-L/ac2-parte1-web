package com.example.ac2_parte1_web.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2_parte1_web.Models.Setor;
import com.example.ac2_parte1_web.Repositories.SetorRepository;

@Service
public class SetorService {

    @Autowired
    private SetorRepository setorRepository;

    public Setor adicionar(Setor setor) {
        return setorRepository.save(setor);
    }

    public Setor buscarSetorPorId(Integer id) {
        return setorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Setor não encontrado"));
    }

    public List<Setor> listarSetoresComFuncionarios() {
        return setorRepository.findAllWithFuncionarios();
    }
}