package com.boutiquecultural.boutiquecultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boutiquecultural.boutiquecultural.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
