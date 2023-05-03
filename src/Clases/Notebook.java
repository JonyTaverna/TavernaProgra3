package Clases;

public class Notebook extends Informatica {
    private Integer memoria;

    public Notebook() {
    }

    public Notebook(Integer stock, String name, double precio, String fabricante, Integer memoria) {
        super(stock, name, precio, fabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memoria=" + memoria +
                "} " + super.toString();
    }
}
