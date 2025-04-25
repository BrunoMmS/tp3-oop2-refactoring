package oop2.tp3.ejercicio1.libros;

public class LibroInfantil extends Libro {

    public LibroInfantil(String nombre, int priceCode) {
        super(nombre, priceCode);
    }

    @Override
    public double calcularPrecio(int diasAlquilados, double monto) {
        monto += 1.5;
        if (diasAlquilados > 3)
            monto += (diasAlquilados - 3) * 1.5;
        return monto;
    }
        
}
