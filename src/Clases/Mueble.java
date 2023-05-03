package Clases;

public abstract class Mueble extends Producto{
    public Mueble() {
    }

    public Mueble(Integer stock, String name, double precio) {
        super(stock, name, precio);
    }

    @Override
    public String toString() {
        return "Mueble{} " + super.toString();
    }
}
