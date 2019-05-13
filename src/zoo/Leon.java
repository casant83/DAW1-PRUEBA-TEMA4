package zoo;

/**
 * León
 * 
 * @author Carmen Santana Enríquez
 * @version 13.5.2019
 */
public class Leon extends Mamifero {
 
    private String rugido = "GRRRRR";
    
    /**
     * Constructor vacío
     */
    public Leon () {}
    
    /**
     * Constructor
     * 
     * @param habitat
     * @param comida
     * @param longevidad
     * @param periodoLactancia
     */
    public Leon (Habitat habitat, String comida, int longevidad, int periodoLactancia) {
        super(habitat, comida, longevidad, periodoLactancia);
    }
    
    /**
     * Método setter
     * 
     * @param rugido
     */
    public void setRugido (String rugido) { this.rugido = rugido; }
    
    /**
     * Método getter
     * 
     * @return rugido
     */
    public String getRugido () { return rugido; }
    
    /**
     * Método que imprime rugido
     */
    public void rugir () { System.out.println(rugido); }
    
    /**
     * Método que imprime comer
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * Método que imprime desplazar
     */
    public void desplazar () { System.out.println("Estoy en busca de " + comida); }
}
