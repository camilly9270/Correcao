package com.example.CorrecaoProva.repository;

import com.example.CorrecaoProva.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
