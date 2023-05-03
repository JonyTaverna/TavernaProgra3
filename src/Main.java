import Clases.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Silla silla1 = new Silla(4, "Modern", 14.2, true);
        Escritorio escritorio1 = new Escritorio(5, "antiguo", 500.2, 14.5, 1.8);
        Impresora impresora1 = new Impresora(1, "Hgama", 122.2, "hp", 40);
        Notebook notebook1 = new Notebook(2, "lv2", 1200.2, "asus", 16);

        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(silla1);
        lista.add(escritorio1);
        lista.add(impresora1);
        lista.add(notebook1);

        ///region TOSTRING--
        System.out.println(silla1.toString());
        System.out.println(escritorio1.toString());
        System.out.println(impresora1.toString());
        System.out.println(notebook1.toString());
        ///endregion

        for (Producto x : lista) {
            if (x instanceof Silla) {
                System.out.println("silla");
            } else if (x instanceof Escritorio) {
                System.out.println("escritorio");
            } else if (x instanceof Impresora) {
                System.out.println("impresora");
            } else {
                System.out.println("notebook");
            }
        }

        System.out.println("la silla1 tiene un precio total de "+ silla1.getPrecio() + " y de "+ silla1.totalDescuento(40)+ "con el 40% de descuento");
        System.out.println("la impresora1 tiene un precio total de "+ impresora1.getPrecio() + " y de "+ impresora1.totalDescuento(20)+ "con el 20% de descuento");

        for (Producto x : lista) {
            if (x instanceof Silla) {
                System.out.println("silla sin aumento .."+ x.getPrecio());
                x.aumento(5);
                System.out.println("silla con aumento .."+ x.getPrecio());
            } else if (x instanceof Escritorio) {
                System.out.println("escritorio sin aumento .."+ x.getPrecio());
                x.aumento(10);
                System.out.println("escritorio con aumento .."+ x.getPrecio());
            } else if (x instanceof Impresora) {
                System.out.println("impresora sin aumento .."+ x.getPrecio());
                x.aumento(15);
                System.out.println("impresora con aumento .."+ x.getPrecio());
            } else {
                System.out.println("notebook sin aumento .."+ x.getPrecio());
                x.aumento(20);
                System.out.println("notebook con aumento .."+ x.getPrecio());
            }
        }
    }
}