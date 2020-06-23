package br.com.conecta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.conecta.model.Anuncios;

public interface AnuncioRepository extends JpaRepository<Anuncios, Long> {

}
