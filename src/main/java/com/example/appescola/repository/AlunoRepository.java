package com.example.appescola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appescola.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
