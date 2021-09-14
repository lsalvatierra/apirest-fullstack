package com.qbo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qbo.repository.CursoRepository;
import com.qbo.model.Curso;


@Service
public class CursoService {
	@Autowired
	private CursoRepository cursoRepository;
	
	public List<Curso> findAll(){
		return cursoRepository.findAll();
	}
	public Curso findById(Integer id){
		return cursoRepository.findById(id).get();
	}
	
	public Curso save(Curso curso) {
		return cursoRepository.save(curso);
	}

}
