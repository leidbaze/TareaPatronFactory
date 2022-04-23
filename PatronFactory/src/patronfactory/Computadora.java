
package patronfactory;

public class Computadora implements Dispositivo{
    String procesador;
    String marca;
    boolean nueva;
    boolean laptop;

    public Computadora() {
    }

    public Computadora(String modeloComputadora, String marca, boolean nueva, boolean laptop) {
        this.procesador = modeloComputadora;
        this.marca = marca;
        this.nueva = nueva;
        this.laptop = laptop;
    }

    public String getModeloComputadora() {
        return procesador;
    }

    public void setModeloComputadora(String modeloComputadora) {
        this.procesador = modeloComputadora;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isNueva() {
        return nueva;
    }

    public void setNueva(boolean nueva) {
        this.nueva = nueva;
    }

    public boolean isLaptop() {
        return laptop;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Computadora{" + "modeloComputadora=" + procesador + ", marca=" + marca + ", nueva=" + nueva + ", laptop=" + laptop + '}';
    }
    
    
}
