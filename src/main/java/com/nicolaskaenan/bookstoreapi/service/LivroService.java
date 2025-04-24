package com.nicolaskaenan.bookstoreapi.service;

import com.nicolaskaenan.bookstoreapi.dto.LivroDTO;
import com.nicolaskaenan.bookstoreapi.dto.MessageResponseDTO;
import com.nicolaskaenan.bookstoreapi.entity.Livro;
import com.nicolaskaenan.bookstoreapi.mapper.LivroMapper;
import com.nicolaskaenan.bookstoreapi.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LivroService {
    private LivroRepository livroRepository;

    private final LivroMapper livroMapper = LivroMapper.instance;

    @Autowired
    public void LivroRepository(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }

    public MessageResponseDTO create(LivroDTO livroDTO) {
        Livro livroSalvo = livroMapper.toModel(livroDTO);
        Livro savedLivro = livroRepository.save(livroSalvo);
        return MessageResponseDTO.builder().message("Livro criado com o ID "+savedLivro.getId()).build();
    }
}
