package oop2.tp3.ejercicio1.libros;

public abstract class Libro {
    public static final int INFANTILES = 2;
    public static final int REGULARES = 0;
    public static final int NUEVO_LANZAMIENTO = 1;
    
    private String nombre;
    private int codigoPrecio;

    public Libro(String nombre, int priceCode) {
        this.nombre = nombre;
        this.codigoPrecio = priceCode;
    }

    public int codigoPrecio() {
        return codigoPrecio;
    }

    public String nombre() {
        return nombre;
    }

    public abstract double calcularPrecio(int diasAlquilados, double monto);
    
    public boolean esFrecuente(int diasAlquilados) {
        return false;
    }
    public int calcularPuntosFrecuente(int diasAlquilados) {
        return 0;
    }
}