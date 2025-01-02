package br.com.armazem.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.armazem.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
