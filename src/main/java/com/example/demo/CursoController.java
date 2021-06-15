package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Curso;
import com.example.repository.CursoRepository;



@RestController
public class CursoController {
	
	@Autowired
	CursoRepository cursoRepository;
	
	@PostMapping("/curso/cadastro")
	public Object cadastrarCurso (@RequestBody CursoDTO cursoDTO) {
		try {
			Curso curso = new Curso();
			curso.setNome(cursoDTO.getNome());
			curso.setDescricao(cursoDTO.getDescricao());
			curso.setEmenta(cursoDTO.getEmenta());
			curso.setDataCadastro(cursoDTO.getDataCadastro());
			curso.setDataInicio(cursoDTO.getDataInicio());
			curso.setValor(cursoDTO.getValor());
			
			cursoRepository.save(curso);
			
			return cursoDTO;
		} catch (Exception e) {
			return false;
		}
	}
	
	@GetMapping("/curso/lista")
	public ResponseEntity <List<Curso>> lista() {
		try {
			List<Curso> cursos = (List<Curso>) cursoRepository.findAll();
			return ResponseEntity.ok(cursos);
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok(null);
		}
	}
}
