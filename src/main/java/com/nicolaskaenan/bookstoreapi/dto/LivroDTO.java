package com.nicolaskaenan.bookstoreapi.dto;

import com.nicolaskaenan.bookstoreapi.entity.Autor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LivroDTO {
    private Long id;

    @NotBlank
    @Size(max = 200)
    private String name;
    @NotNull
    private Integer pages;
    @NotNull
    private Integer chapters;
    @NotBlank
    @Size(max = 100)
    private String isbn;
    @NotBlank
    @Size(max = 200)
    private String publisherName;

    @Valid
    @NotNull
    private Autor autor;
}

