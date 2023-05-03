package Clases;

public class Informatica extends Producto {
    private String fabricante;

    public Informatica() {
    }

    public Informatica(Integer stock, String name, double precio, String fabricante) {
        super(stock, name, precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Informatica{" +
                "fabricante='" + fabricante + '\'' +
                "} " + super.toString();
    }
}
