package clases;

	/**
	 * Clase que gestiona la iluminación de las pistas deportivas.
	 * Permite encender y apagar las luces de las pistas.
	 * 
	 * @author Katherin Cabrera Esquijarosa
	 * @version 1.0
	 */
	public class GestorIluminacion {

	    private boolean[] iluminacion;
	    private static final int MAX_PISTAS = 10; // Máximo de 10 pistas

	    /**
	     * Constructor para inicializar el gestor de iluminación.
	     */
	    public GestorIluminacion() {
	        iluminacion = new boolean[MAX_PISTAS];
	    }

	    public boolean encenderLuces(int idPista) {
	        if (idPista < 0 || idPista >= MAX_PISTAS) return false;
	        iluminacion[idPista] = true;
	        return true;
	    }

	    public boolean apagarLuces(int idPista) {
	        if (idPista < 0 || idPista >= MAX_PISTAS) return false;
	        iluminacion[idPista] = false;
	        return true;
	    }

	    public boolean lucesEncendidas(int idPista) {
	        if (idPista < 0 || idPista >= MAX_PISTAS) return false;
	        return iluminacion[idPista];
	    }
	}


