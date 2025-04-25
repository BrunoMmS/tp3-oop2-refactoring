package oop2.tp3.ejercicio1;

import oop2.tp3.ejercicio1.libros.Libro;

public class CopiaLibro {
    private Libro libro;

    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }

    public Libro libro() {
        return libro;
    }
    
    public double calcularPrecio(int diasAlquilados, double monto){
        return libro.calcularPrecio(diasAlquilados, monto);
    }
}