package com.nicolaskaenan.bookstoreapi.controller;

import com.nicolaskaenan.bookstoreapi.dto.LivroDTO;
import com.nicolaskaenan.bookstoreapi.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicolaskaenan.bookstoreapi.dto.MessageResponseDTO;
import com.nicolaskaenan.bookstoreapi.entity.Livro;
import com.nicolaskaenan.bookstoreapi.repository.LivroRepository;

import lombok.Builder;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroController {
	
	private LivroService livroService;
	
	@Autowired
	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}

	@PostMapping
	public MessageResponseDTO create(@RequestBody @Valid LivroDTO livroDTO) {
		return livroService.create(livroDTO);
	}
}
