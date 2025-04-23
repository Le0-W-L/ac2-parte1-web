package com.example.ac2_parte1_web.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ac2_parte1_web.Models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    @Query("SELECT f FROM Funcionario f LEFT JOIN FETCH f.projetos WHERE f.id = :id")
    Funcionario findByIdWithProjetos(@Param("id") Integer id);
}