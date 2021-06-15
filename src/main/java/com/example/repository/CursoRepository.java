package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long>{

}
