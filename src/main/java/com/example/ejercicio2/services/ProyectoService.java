package com.example.ejercicio2.services;

import com.example.ejercicio2.models.Proyecto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProyectoService {
    private final List<Proyecto> proyectos = new ArrayList<>();
    private Long currentId = 1L;

    public List<Proyecto> listarTodos() {
        return proyectos;
    }

    public Proyecto guardar(Proyecto proyecto) {
        if (proyecto.getId() == null) {
            proyecto.setId(currentId++);
        }
        proyectos.add(proyecto);
        return proyecto;
    }

    public Proyecto buscarPorId(Long id) {
        return proyectos.stream()
                .filter(proyecto -> proyecto.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public boolean eliminar(Long id) {
        return proyectos.removeIf(proyecto -> proyecto.getId().equals(id));
    }
}
