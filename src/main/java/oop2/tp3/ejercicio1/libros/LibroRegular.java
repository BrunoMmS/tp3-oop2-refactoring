package oop2.tp3.ejercicio1.libros;

public class LibroRegular extends Libro{

    public LibroRegular(String nombre, int priceCode) {
        super(nombre, priceCode);
    }

    @Override
    public double calcularPrecio(int diasAlquilados, double monto) {
        monto +=2;
        if (diasAlquilados > 2)
            monto += (diasAlquilados - 2) * 1.5;
        return monto;
    }
    
}
