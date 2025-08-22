
/**
 * Autor: Estefanie Rosales
 * Programa: Sistema de reservas
 * Fecha de creación: 21/08/2025
 */

import java.time.LocalDate;

public class Reserva {
    private String responsable;
    private String nombreEvento;
    private String tipoEvento;
    private LocalDate fecha;
    private Cancha canchaAsignada;
    private boolean confirmada;

    // Constructor
    public Reserva(String responsable, String nombreEvento, String tipoEvento, LocalDate fecha) {
        this.responsable = responsable;
        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.fecha = fecha;
        this.confirmada = false;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Cancha getCanchaAsignada() {
        return canchaAsignada;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setCanchaAsignada(Cancha cancha) {
        this.canchaAsignada = cancha;
    }

    public void confirmarReserva() {
        this.confirmada = true;
        if (canchaAsignada != null) {
            canchaAsignada.setDisponible(false);
        }
    }

    // Mostrar información de la reserva
    public void mostrarInfo() {
        System.out.println("Responsable: " + responsable);
        System.out.println("Evento: " + nombreEvento);
        System.out.println("Tipo: " + tipoEvento);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cancha asignada: " + (canchaAsignada != null ? canchaAsignada.getNombre() : "Pendiente"));
        System.out.println("Estado: " + (confirmada ? "Confirmada" : "En espera"));
    }
}