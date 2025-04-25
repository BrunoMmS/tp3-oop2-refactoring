package oop2.tp3.ejercicio1.libros;

public class LibroNuevoLanzamiento extends Libro {

    public LibroNuevoLanzamiento(String nombre, int priceCode) {
        super(nombre, priceCode);
    }

    @Override
    public double calcularPrecio(int diasAlquilados, double monto) {
        return monto + diasAlquilados * 3;
    }
    @Override
    public int calcularPuntosFrecuente(int diasAlquilados) {
        if (diasAlquilados > 1) {
            return 1;
        }
        return 0;
    }
}
