package com.example.ejercicio2.repositories;

import com.example.ejercicio2.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
}
