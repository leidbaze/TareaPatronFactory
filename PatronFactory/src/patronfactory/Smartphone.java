
package patronfactory;

public class Smartphone implements Dispositivo{

    String marca;
    String color;
    boolean nuevo;
    boolean cincoG;

    public Smartphone() {
    }

    public Smartphone(String marca, String color, boolean nuevo, boolean cincoG) {
        this.marca = marca;
        this.color = color;
        this.nuevo = nuevo;
        this.cincoG = cincoG;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public boolean isCincoG() {
        return cincoG;
    }

    public void setCincoG(boolean cincoG) {
        this.cincoG = cincoG;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", color=" + color + ", nuevo=" + nuevo + ", cincoG=" + cincoG + '}';
    }
    
    
}
