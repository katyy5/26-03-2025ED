package clases;

import java.time.LocalDateTime;

/**
 * Representa una reserva en el sistema de reservas deportivas.
 * Contiene información sobre la pista, la fecha y la duración de la reserva.
 * 
 * @author Katherin Cabrera Esquijarosa
 * @version 1.1
 */
public class Reserva {

    private int idPista;
    private LocalDateTime fechaHora;
    private int duracion;

    /**
     * Constructor para crear una nueva reserva.
     * 
     * @param idPista   El identificador de la pista reservada.
     * @param fechaHora La fecha y hora en la que se realiza la reserva.
     * @param duracion  La duración de la reserva en minutos.
     */
    public Reserva(int idPista, LocalDateTime fechaHora, int duracion) {
        this.idPista = idPista;
        this.fechaHora = fechaHora;
        this.duracion = duracion;
    }

    public int getIdPista() {
        return idPista;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public int getDuracion() {
        return duracion;
    }
}
