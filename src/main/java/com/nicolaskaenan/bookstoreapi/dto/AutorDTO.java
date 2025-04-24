package com.nicolaskaenan.bookstoreapi.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AutorDTO {
    private Long id;

    @NotBlank
    @Size(max = 200)
    private String nome;

    @NotNull
    @Size(max = 100)
    private Integer age;
}
