package com.example.ac2_parte1_web.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2_parte1_web.Models.Funcionario;
import com.example.ac2_parte1_web.Models.Projeto;
import com.example.ac2_parte1_web.Repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario adicionar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Projeto> buscarProjetos(Integer idFuncionario) {
        Funcionario funcionario = funcionarioRepository.findByIdWithProjetos(idFuncionario);
        return funcionario.getProjetos();
    }
}