package Clases;

import Interfaces.Descuentos;

public abstract class Producto {
    private Integer stock;
    private String name;
    private double precio;

    public Producto() {
    }

    public Producto(Integer stock, String name, double precio) {
        this.stock = stock;
        this.name = name;
        this.precio = precio;
    }
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "stock=" + stock +
                ", name='" + name + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void aumento(int porcentaje){
        double precio = this.getPrecio();
        double aumento = (precio/100)*porcentaje;
        this.setPrecio(precio+aumento);
        }
    }
