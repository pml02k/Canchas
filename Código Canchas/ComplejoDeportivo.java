
/**
 * Autor: Estefanie Rosales
 * Programa: Sistema de reservas
 * Fecha de creación: 21/08/2025
 */

import java.util.ArrayList;
import java.util.List;

public class ComplejoDeportivo {
    private String nombre;
    private List<Cancha> canchas;
    private List<Reserva> reservasConfirmadas;
    private List<Reserva> listaDeEspera;

    // Constructor
    public ComplejoDeportivo(String nombre) {
        this.nombre = nombre;
        this.canchas = new ArrayList<>();
        this.reservasConfirmadas = new ArrayList<>();
        this.listaDeEspera = new ArrayList<>();
    }

    // Agregar una cancha al complejo
    public void agregarCancha(Cancha cancha) {
        canchas.add(cancha);
    }

    // Obtener canchas disponibles
    public List<Cancha> obtenerCanchasDisponibles() {
        List<Cancha> disponibles = new ArrayList<>();
        for (Cancha cancha : canchas) {
            if (cancha.isDisponible()) {
                disponibles.add(cancha);
            }
        }
        return disponibles;
    }

    // Procesar una nueva reserva
    public boolean procesarReserva(Reserva reserva) {
        List<Cancha> disponibles = obtenerCanchasDisponibles();
        if (!disponibles.isEmpty()) {
            Cancha canchaAsignada = disponibles.get(0);
            reserva.setCanchaAsignada(canchaAsignada);
            reserva.confirmarReserva();
            reservasConfirmadas.add(reserva);
            return true; // Reserva confirmada
        } else {
            listaDeEspera.add(reserva);
            return false; // Agregada a lista de espera
        }
    }

    // Obtener reservas confirmadas
    public List<Reserva> getReservasConfirmadas() {
        return reservasConfirmadas;
    }

    // Obtener lista de espera
    public List<Reserva> getListaDeEspera() {
        return listaDeEspera;
    }
}