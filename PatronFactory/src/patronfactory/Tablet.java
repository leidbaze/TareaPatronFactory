
package patronfactory;

public class Tablet implements Dispositivo{
    String marca;
    String color;
    Float pulgadas;
    boolean nueva;

    public Tablet() {
    }

    public Tablet(String marca, String color, Float pulgadas, boolean nueva) {
        this.marca = marca;
        this.color = color;
        this.pulgadas = pulgadas;
        this.nueva = nueva;
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

    public Float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isNueva() {
        return nueva;
    }

    public void setNueva(boolean nueva) {
        this.nueva = nueva;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca=" + marca + ", color=" + color + ", pulgadas=" + pulgadas + ", nueva=" + nueva + '}';
    }

    

}
