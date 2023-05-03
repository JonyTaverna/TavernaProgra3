package Clases;

import Interfaces.Descuentos;

public class Impresora extends Informatica implements Descuentos {
    private Integer impXmin;

    public Impresora() {
    }

    public Impresora(Integer stock, String name, double precio, String fabricante, Integer impXmin) {
        super(stock, name, precio, fabricante);
        this.impXmin = impXmin;
    }

    public Integer getImpXmin() {
        return impXmin;
    }

    public void setImpXmin(Integer impXmin) {
        this.impXmin = impXmin;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "impXmin=" + impXmin +
                "} " + super.toString();
    }
    @Override
    public double totalDescuento (int porcentaje){
        return getPrecio() - ((getPrecio()/100)*porcentaje);
    }
}
