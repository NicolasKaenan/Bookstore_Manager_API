package com.nicolaskaenan.bookstoreapi.mapper;

import com.nicolaskaenan.bookstoreapi.dto.LivroDTO;
import com.nicolaskaenan.bookstoreapi.entity.Livro;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LivroMapper {

    LivroMapper instance = Mappers.getMapper(LivroMapper.class);

    Livro toModel(LivroDTO livroDTO);

    LivroDTO toDTO(Livro livro);
}
