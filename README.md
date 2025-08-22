# Canchas
# Sistema de Reservas de Canchas Deportivas

Este proyecto implementa un sistema básico para gestionar reservas de canchas en un complejo deportivo. Permite registrar eventos, asignar canchas disponibles y manejar una lista de espera cuando no hay disponibilidad.

## Funcionalidades

- Solicitar reserva para un evento deportivo
- Asignación automática de cancha disponible
- Gestión de reservas confirmadas y en espera
- Menú interactivo por consola

## Estructura del proyecto

- `Main.java`: Clase principal. Recoge datos del usuario y muestra resultados.
- `Cancha.java`: Representa una cancha con nombre, ubicación y disponibilidad.
- `Reserva.java`: Contiene los datos de una reserva y su estado.
- `Evento.java`: Define los datos básicos de un evento deportivo.
- `ComplejoDeportivo.java`: Administra canchas, reservas y lista de espera.

## Requisitos

- Java 17 o superior
- Compilación y ejecución desde consola o IDE compatible

## Ejecución

Compila y ejecuta `Main.java`. El programa mostrará un menú interactivo para gestionar reservas.

```bash
javac *.java
java Main
