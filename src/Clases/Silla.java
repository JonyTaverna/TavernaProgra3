package Clases;

import Interfaces.Descuentos;

public class Silla extends Mueble implements Descuentos {
    private boolean ruedas;

    public Silla() {
    }

    public Silla(Integer stock, String name, double precio, boolean ruedas) {
        super(stock, name, precio);
        this.ruedas = ruedas;
    }

    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "ruedas=" + ruedas +
                "} " + super.toString();
    }
    @Override
    public double totalDescuento (int porcentaje){
        return getPrecio() - ((getPrecio()/100)*porcentaje);
    }
}

