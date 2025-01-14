package com.nicolaskaenan.bookstoreapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nicolaskaenan.bookstoreapi.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
