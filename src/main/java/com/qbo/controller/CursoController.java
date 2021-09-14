package com.qbo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qbo.model.Curso;
import com.qbo.service.CursoService;

@RestController
@RequestMapping("api/v1/curso")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("")
	public ResponseEntity<List<Curso>>  getAll(){
		List<Curso> entities = new ArrayList<Curso>();
		cursoService.findAll().forEach(entities::add);
		if(entities.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(entities, HttpStatus.OK);
		}
	}
	
	@PostMapping("")
	public ResponseEntity<Curso> create(@RequestBody Curso curso){
		return new ResponseEntity<>(cursoService.save(curso), 
				HttpStatus.CREATED);
	}
	


}
