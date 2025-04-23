package com.example.ac2_parte1_web.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ac2_parte1_web.Models.Setor;

public interface SetorRepository extends JpaRepository<Setor, Integer> {

    @Query("SELECT s FROM Setor s LEFT JOIN FETCH s.funcionarios")
    List<Setor> findAllWithFuncionarios();
}