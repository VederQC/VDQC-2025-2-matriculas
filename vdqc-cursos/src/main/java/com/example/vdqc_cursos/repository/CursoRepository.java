package com.example.vdqc_cursos.repository;

import com.example.vdqc_cursos.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
