package clases;

/**
 * Representa una reserva en el sistema de reservas deportivas.
 * Contiene información sobre la pista, la fecha y la duración de la reserva.
 * 
 * @author Katherin Cabrera Esquijarosa
 * @version 1.0
 */
public class Reserva {

    private int idPista;
    private String fecha;
    private int duracion;

    /**
     * Constructor para crear una nueva reserva.
     * 
     * @param idPista El identificador de la pista reservada.
     * @param fecha La fecha en la que se realiza la reserva.
     * @param duracion La duración de la reserva en minutos.
     */
    public Reserva(int idPista, String fecha, int duracion) {
        this.idPista = idPista;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    /**
     * Obtiene el identificador de la pista reservada.
     * 
     * @return El id de la pista.
     */
    public int getIdPista() {
        return idPista;
    }

    /**
     * Obtiene la fecha de la reserva.
     * 
     * @return La fecha de la reserva.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Obtiene la duración de la reserva en minutos.
     * 
     * @return La duración de la reserva.
     */
    public int getDuracion() {
        return duracion;
    }
}
