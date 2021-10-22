package com.marcio.cobranca.repository;

import com.marcio.cobranca.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Titulos extends JpaRepository <Titulo, Long> {
}
