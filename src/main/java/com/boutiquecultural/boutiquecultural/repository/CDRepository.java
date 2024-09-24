package com.boutiquecultural.boutiquecultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boutiquecultural.boutiquecultural.entity.CD;

@Repository
public interface CDRepository extends JpaRepository<CD, Integer> {
	
}
