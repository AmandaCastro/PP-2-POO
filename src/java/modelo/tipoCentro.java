
package modelo;

/**
 *
 * @author Amanda Castro, Miranda Venegas 
 */
public class tipoCentro {
    
    public String IDcentro;
    public String nombre;

    public String getIDcentro() {
        return IDcentro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIDcentro(String IDcentro) {
        this.IDcentro = IDcentro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tipoCentro(String IDcentro, String nombre) {
        this.IDcentro = IDcentro;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "tipoCentro{" + "IDcentro=" + IDcentro + ", nombre=" + nombre + '}';
    }
   
    
}
