
/**
 * Una clase que modela una carta de la baraja española (48 cartas).
 * 
 * @author sercadel 
 * @version 0.1.0
 */

public class CartaBaraja
{
    // Constantes palos
    static final int OROS = 1;
    static final int COPAS = 2;
    static final int ESPADAS = 3;
    static final int BASTOS = 4;
    
    private int palo;
    private int valor;

    /**
     * Constructor de objetos de la clase CartaBaraja
     * @param  quePalo     numero del palo (1-4)
     * @param  queValor    numero del valor (1-12)
     */
    public CartaBaraja(int quePalo, int queValor)
    {
        // inicializa las variables
        palo = quePalo;
        valor = queValor;
    }
    
    /**
     * metodo que devuelve una cadena que corresponde al nombre del palo
     * 
     * @return          Devuelve una cadena con el nombre del palo 
     */
    public String getPalo()
    {
        // Obtiene el palo de la carta
        String paloString = "";
        
        switch (palo) {
            case OROS:
                paloString = "OROS";
                break;
            case COPAS:
                paloString = "COPAS";
                break;
            case ESPADAS:
                paloString = "ESPADAS";
                break;
            case BASTOS:
                paloString = "BASTOS";
                break;
            default:
                paloString = "PALO DESCONOCIDO";
                break;
        }
        
        // Devuelve el nombre del palo que corresponde al número introducido
        return paloString;
    }
    
    /**
     * metodo que devuelve una cadena que corresponde al nombre del valor
     * 
     * @return          Devuelve una cadena con el nombre del valor 
     */
    public String getValor()
    {
        // Inicializa valorString que contendrá el nombre del valor obtenido
        String valorString = "";
        
        // Obtiene el nombre del valor de la carta
        if (valor == 1) {
            valorString = "AS";
        
        } else if (valor == 2) {
            valorString = "DOS";
        
        } else if (valor == 3) {
            valorString = "TRES";
        
        } else if (valor == 4) {
            valorString = "CUATRO";
        
        } else if (valor == 5) {
            valorString = "CINCO";
        
        } else if (valor == 6) {
            valorString = "SEIS";
        
        } else if (valor == 7) {
            valorString = "SIETE";
        
        } else if (valor == 8) {
            valorString = "OCHO";
        
        } else if (valor == 9) {
            valorString = "NUEVE";
            
        } else if (valor == 10) {
            valorString = "SOTA";

        } else if (valor == 11) {
            valorString = "CABALLO";

        } else if (valor == 12) {
            valorString = "REY";

        } else {
            valorString = "VALOR DESCONOCIDO";
        }
        
        // Devuelve el nombre del valor que corresponde al número introducido
        return valorString;
    }
    
    /**
     * Devuelve una cadena conteniendo una representación del objeto
     * 
     * @return          cadena formada con el valor y el palo 
     */
    public String toString()
    {
        // Llama a la función para obtener el palo
        String paloString = getPalo();
        
        // Llama a la función para obtener el valor
        String valorString = getValor();
        
        // Devuelve una cadena que indica el palo y valor de la carta
        return
            valorString.substring(0,1)// Muestra la primera letra
            + valorString.substring(1).toLowerCase()// Muestra desde la segunda letra de la cadena y lo convierte a minusculas
            + " de "
            + paloString.toLowerCase();//Convierte a minisculas la cadena
    }
}
