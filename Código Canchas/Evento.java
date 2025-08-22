
/**
 * Autor: Estefanie Rosales
 * Programa: Sistema de reservas
 * Fecha de creación: 21/08/2025
 */

import java.time.LocalDate;

public class Evento {
    private String nombre;
    private String tipo;
    private LocalDate fecha;
    private String responsable;

    // Constructor
    public Evento(String nombre, String tipo, LocalDate fecha, String responsable) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.responsable = responsable;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}