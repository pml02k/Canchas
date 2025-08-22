
/**
 * Autor: Estefanie Rosales
 * Programa: Sistema de reservas
 * Fecha de creación: 21/08/2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComplejoDeportivo complejo = new ComplejoDeportivo("Complejo UVG");

        // Canchas disponibles
        complejo.agregarCancha(new Cancha("Cancha A", "Zona Norte"));
        complejo.agregarCancha(new Cancha("Cancha B", "Zona Sur"));

        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Solicitar reserva");
            System.out.println("2. Mostrar reservas confirmadas");
            System.out.println("3. Mostrar lista de espera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Responsable del evento: ");
                    String responsable = scanner.nextLine();

                    System.out.print("Nombre del evento: ");
                    String nombreEvento = scanner.nextLine();

                    System.out.print("Tipo de evento (entrenamiento, campeonato, etc.): ");
                    String tipoEvento = scanner.nextLine();

                    System.out.print("Fecha del evento (YYYY-MM-DD): ");
                    String fechaTexto = scanner.nextLine();

                    try {
                        LocalDate fecha = LocalDate.parse(fechaTexto);
                        Reserva reserva = new Reserva(responsable, nombreEvento, tipoEvento, fecha);
                        boolean confirmada = complejo.procesarReserva(reserva);

                        if (confirmada) {
                            System.out.println("Reserva confirmada.");
                        } else {
                            System.out.println("No hay canchas disponibles. Reserva agregada a lista de espera.");
                        }
                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de fecha inválido. Use YYYY-MM-DD.");
                    }
                    break;

                case "2":
                    List<Reserva> confirmadas = complejo.getReservasConfirmadas();
                    System.out.println("\nReservas confirmadas:");
                    if (confirmadas.isEmpty()) {
                        System.out.println("No hay reservas confirmadas.");
                    } else {
                        for (Reserva r : confirmadas) {
                            r.mostrarInfo();
                            System.out.println("-----");
                        }
                    }
                    break;

                case "3":
                    List<Reserva> espera = complejo.getListaDeEspera();
                    System.out.println("\nLista de espera:");
                    if (espera.isEmpty()) {
                        System.out.println("No hay reservas en espera.");
                    } else {
                        for (Reserva r : espera) {
                            r.mostrarInfo();
                            System.out.println("-----");
                        }
                    }
                    break;

                case "4":
                    salir = true;
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}