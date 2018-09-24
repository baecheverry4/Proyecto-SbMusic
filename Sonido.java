package sbmusic;

/**
 *
 * @author Hogar
 */
public class Sonido {
    private String longSond;
    private String intensidad;
    private String tono;
    
    public Sonido(String longSond, String intensidad, String tono){
        this.longSond = longSond; 
        this.intensidad = intensidad;
        this.tono = tono;
    }

    /**
     * @return the longSond
     */
    public String getLongSond() {
        return longSond;
    }

    /**
     * @param longSond the longSond to set
     */
    public void setLongSond(String longSond) {
        this.longSond = longSond;
    }

    /**
     * @return the intensidad
     */
    public String getIntensidad() {
        return intensidad;
    }

    /**
     * @param intensidad the intensidad to set
     */
    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    /**
     * @return the tono
     */
    public String getTono() {
        return tono;
    }

    /**
     * @param tono the tono to set
     */
    public void setTono(String tono) {
        this.tono = tono;
    }
    
    @Override
    public String toString(){
        return "Longitud del sonido: "+ longSond+"\n"+
               "Intensidad del sonido: "+ intensidad+"\n"+
               "Tono del sonido: "+ tono;
    }
    
    
}
