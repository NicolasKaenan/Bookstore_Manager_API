package com.nicolaskaenan.bookstoreapi.service;

import com.nicolaskaenan.bookstoreapi.dto.MessageResponseDTO;
import com.nicolaskaenan.bookstoreapi.entity.Livro;
import com.nicolaskaenan.bookstoreapi.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LivroService {
    private LivroRepository livroRepository;

    @Autowired
    public void LivroRepository(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }

    public MessageResponseDTO create(Livro livro) {
        Livro savedLivro = livroRepository.save(livro);
        return MessageResponseDTO.builder().message("Livro criado com o ID "+savedLivro.getId()).build();
    }
}
