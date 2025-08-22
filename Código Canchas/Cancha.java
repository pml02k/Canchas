/**
 * Autor: Estefanie Rosales
 * Programa: Sistema de reservas
 * Fecha de creación: 21/08/2025
 */

public class Cancha {
    private String nombre;
    private String ubicacion;
    private boolean disponible;

    // Constructor
    public Cancha(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.disponible = true;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método para mostrar información de la cancha
    public void mostrarInfo() {
        System.out.println("Cancha: " + nombre);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    // Método para reservar la cancha
    public boolean reservar() {
        if (disponible) {
            disponible = false;
            return true;
        } else {
            return false;
        }
    }

    // Método para liberar la cancha
    public void liberar() {
        disponible = true;
    }
}