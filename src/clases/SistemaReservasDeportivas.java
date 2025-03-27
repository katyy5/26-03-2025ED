package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Katherin Cabrera Esquijarosa
 * @version 1.1
 */
public class SistemaReservasDeportivas {

    private List<Reserva> reservas;
    private GestorIluminacion gestorIluminacion;

    /**
     * Constructor que inicializa el sistema de reservas y el gestor de iluminación.
     */
    public SistemaReservasDeportivas() {
        reservas = new ArrayList<>();
        gestorIluminacion = new GestorIluminacion();
    }

    /**
     * Realiza una reserva de pista si la fecha está disponible.
     * 
     * @param reserva La reserva que se desea realizar.
     * @return true si la reserva fue exitosa, false si la fecha no está disponible.
     */
    public boolean reservarPista(Reserva reserva) {
        if (esFechaDisponible(reserva.getIdPista(), reserva.getFechaHora())) {
            reservas.add(reserva);
            return true;
        }
        return false;
    }

    /**
     * Verifica si una pista está disponible en una fecha específica.
     * 
     * @param idPista   El identificador de la pista.
     * @param fechaHora La fecha y hora de la reserva.
     * @return true si la pista está disponible, false si ya está reservada.
     */
    private boolean esFechaDisponible(int idPista, LocalDateTime fechaHora) {
        for (Reserva r : reservas) {
            if (r.getIdPista() == idPista && r.getFechaHora().equals(fechaHora)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Enciende las luces de una pista deportiva.
     * 
     * @param idPista El identificador de la pista.
     * @return true si la iluminación se activó correctamente, false en caso contrario.
     */
    public boolean encenderLuces(int idPista) {
        return gestorIluminacion.encenderLuces(idPista);
    }

    /**
     * Apaga las luces de una pista deportiva.
     * 
     * @param idPista El identificador de la pista.
     * @return true si la iluminación se apagó correctamente, false en caso contrario.
     */
    public boolean apagarLuces(int idPista) {
        return gestorIluminacion.apagarLuces(idPista);
    }

    /**
     * Verifica si las luces de una pista están encendidas.
     * 
     * @param idPista El identificador de la pista.
     * @return true si las luces están encendidas, false en caso contrario.
     */
    public boolean lucesEncendidas(int idPista) {
        return gestorIluminacion.lucesEncendidas(idPista);
    }
}
