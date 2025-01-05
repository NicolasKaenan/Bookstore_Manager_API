package com.nicolaskaenan.bookstoreapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Autor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome_autor", nullable = false, unique = true)
	private String nome;
	@Column(name = "idade", nullable = false)
	private Integer age;
}
