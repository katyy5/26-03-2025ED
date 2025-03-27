package clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona el sistema de reservas deportivas.
 * Permite a los usuarios reservar, cancelar reservas, activar o desactivar la iluminación de las pistas,
 * y verificar la disponibilidad de las mismas.
 * 
 * @author Katherin Cabrera Esquijarosa
 * @version 1.0
 */
public class SistemaReservasDeportivas {

    private List<Reserva> reservas;
    private boolean[] iluminacion;
    private static final int MAX_PISTAS = 10; // Asumimos un máximo de 10 pistas

    /**
     * Constructor para inicializar el sistema de reservas deportivas.
     * Inicializa la lista de reservas y el estado de la iluminación de las pistas.
     */
    public SistemaReservasDeportivas() {
        reservas = new ArrayList<>();
        iluminacion = new boolean[MAX_PISTAS];
    }

    /**
     * Realiza una reserva para una pista en una fecha y duración determinadas.
     *
     * @param idPista El identificador de la pista que se quiere reservar.
     * @param fecha La fecha en la que se desea realizar la reserva.
     * @param duracion La duración de la reserva en minutos.
     * @return true si la reserva se realizó con éxito, false si la pista ya está reservada o el idPista es inválido.
     */
    public boolean reservarPista(int idPista, String fecha, int duracion) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == idPista && r.getFecha().equals(fecha)) {
                return false; // La pista ya está reservada en esa fecha
            }
        }
        reservas.add(new Reserva(idPista, fecha, duracion));
        return true;
    }

    /**
     * Cancela una reserva existente en el sistema.
     *
     * @param idReserva El identificador de la reserva a cancelar.
     * @return true si la reserva fue cancelada con éxito, false si no se encontró la reserva con ese id.
     */
    public boolean cancelarReserva(int idReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getIdPista() == idReserva) {
                reservas.remove(i);
                return true;
            }
        }
        return false; // No se encontró la reserva
    }

    /**
     * Activa la iluminación de una pista específica.
     *
     * @param idPista El identificador de la pista cuya iluminación se activará.
     * @return true si la iluminación se activó correctamente, false si el idPista es inválido.
     */
    public boolean activarIluminacion(int idPista) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        iluminacion[idPista] = true;
        return true;
    }

    /**
     * Desactiva la iluminación de una pista específica.
     *
     * @param idPista El identificador de la pista cuya iluminación se desactivará.
     * @return true si la iluminación se desactivó correctamente, false si el idPista es inválido.
     */
    public boolean desactivarIluminacion(int idPista) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        iluminacion[idPista] = false;
        return true;
    }

    /**
     * Verifica la disponibilidad de una pista en una fecha y hora determinadas.
     *
     * @param idPista El identificador de la pista a verificar.
     * @param fecha La fecha en la que se desea verificar la disponibilidad de la pista.
     * @param hora La hora en la que se desea verificar la disponibilidad de la pista.
     * @return true si la pista está disponible, false si ya está reservada en esa fecha.
     */
    public boolean verificarDisponibilidad(int idPista, String fecha, String hora) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == idPista && r.getFecha().equals(fecha)) {
                return false; // La pista no está disponible en esa fecha
            }
        }
        return true; // La pista está disponible
    }
}
