package com.qbo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qbo.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
