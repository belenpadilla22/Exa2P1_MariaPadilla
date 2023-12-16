
package ex2p1_mariapadilla;


public class Items {
    String nombre;
    int HPpoints,MPpoints;

    public Items() {
    }

    public Items(String nombre, int HPpoints, int MPpoints) {
        this.nombre = nombre;
        this.HPpoints = HPpoints;
        this.MPpoints = MPpoints;
    }

    @Override
    public String toString() {
        return "Items{" + "nombre=" + nombre + ", HPpoints=" + HPpoints + ", MPpoints=" + MPpoints + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHPpoints() {
        return HPpoints;
    }

    public void setHPpoints(int HPpoints) {
        this.HPpoints = HPpoints;
    }

    public int getMPpoints() {
        return MPpoints;
    }

    public void setMPpoints(int MPpoints) {
        this.MPpoints = MPpoints;
    }
    
        
}
