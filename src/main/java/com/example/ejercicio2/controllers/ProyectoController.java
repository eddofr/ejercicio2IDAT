package com.example.ejercicio2.controllers;

import com.example.ejercicio2.models.Proyecto;
import com.example.ejercicio2.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController {
    @Autowired
    private ProyectoService proyectoService;

    @GetMapping
    public List<Proyecto> listarTodos() {
        return proyectoService.listarTodos();
    }

    @PostMapping
    public Proyecto guardar(@RequestBody Proyecto proyecto) {
        return proyectoService.guardar(proyecto);
    }

    @GetMapping("/{id}")
    public Proyecto buscarPorId(@PathVariable Long id) {
        return proyectoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        proyectoService.eliminar(id);
    }
}
