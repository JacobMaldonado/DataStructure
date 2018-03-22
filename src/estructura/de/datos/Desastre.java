package estructura.de.datos;
import java.util.Date;

public class Desastre {
    private Date fecha;
    private Date ultimoDesastre;
    private int victimas;

    public Desastre (Date fecha, int victimas){
        this.fecha = fecha;
        this.victimas = victimas;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getUltimoDesastre() {
        return ultimoDesastre;
    }

    public void setUltimoDesastre(Date ultimoDesastre) {
        this.ultimoDesastre = ultimoDesastre;
    }

    public int getVictimas() {
        return victimas;
    }

    public void setVictimas(int victimas) {
        this.victimas = victimas;
    }
    
    
}
