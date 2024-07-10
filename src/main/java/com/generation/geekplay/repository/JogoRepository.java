package com.generation.geekplay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.geekplay.model.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {

	public List<Jogo> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
}
