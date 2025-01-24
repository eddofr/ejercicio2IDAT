package com.example.ejercicio2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigoProyecto;
    private String nombreProyecto;
    private String ubicacion;
    private String municipalidad;
    private LocalDate fechaAprobacion;
    private LocalDate fechaInicio;
    private Double importeInversion;
    private Integer tiempoEstimado;
    private String ingenieroResponsable;
    private String financieraRespaldo;
    private String descripcion;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(String codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMunicipalidad() {
        return municipalidad;
    }

    public void setMunicipalidad(String municipalidad) {
        this.municipalidad = municipalidad;
    }

    public LocalDate getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(LocalDate fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Double getImporteInversion() {
        return importeInversion;
    }

    public void setImporteInversion(Double importeInversion) {
        this.importeInversion = importeInversion;
    }

    public Integer getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(Integer tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getIngenieroResponsable() {
        return ingenieroResponsable;
    }

    public void setIngenieroResponsable(String ingenieroResponsable) {
        this.ingenieroResponsable = ingenieroResponsable;
    }

    public String getFinancieraRespaldo() {
        return financieraRespaldo;
    }

    public void setFinancieraRespaldo(String financieraRespaldo) {
        this.financieraRespaldo = financieraRespaldo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}