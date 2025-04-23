package com.example.ac2_parte1_web.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2_parte1_web.Models.Funcionario;
import com.example.ac2_parte1_web.Models.Projeto;
import com.example.ac2_parte1_web.Repositories.FuncionarioRepository;
import com.example.ac2_parte1_web.Repositories.ProjetoRepository;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Projeto adicionar(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public Projeto buscarProjetoPorId(Integer id) {
        return projetoRepository.findByIdWithFuncionarios(id);
    }

    public void vincularFuncionario(Integer idProjeto, Integer idFuncionario) {
        Projeto projeto = projetoRepository.findByIdWithFuncionarios(idProjeto);
        Funcionario funcionario = funcionarioRepository.findById(idFuncionario)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));

        projeto.getFuncionarios().add(funcionario);
        projetoRepository.save(projeto);
    }
}