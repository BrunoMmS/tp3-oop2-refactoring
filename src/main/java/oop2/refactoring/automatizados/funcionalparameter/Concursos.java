package oop2.refactoring.automatizados.funcionalparameter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concursos {

    private List<Concurso> concursos;

    public Concursos(Concurso... c) {
        this.concursos = List.of(c);
    }

    //"Introduce Funcional Parameter" en concursosInicianEn
    //Rename method para generalizarlo
    //remuevo concursoConNombre
    //cambio el Main para usar el método genérico
    public List<Concurso> concursosInicianEn(LocalDate fechaInicio) {
        List<Concurso> resultado = new ArrayList<>();
        for (Concurso concurso : this.concursos) {
            if (concurso.empiezaEn(fechaInicio)) {
                resultado.add(concurso);
            }
        }
        return resultado;
    }

    public List<Concurso> concursoConNombre(String parteNombre) {
        List<Concurso> resultado = new ArrayList<>();
        for (Concurso concurso : this.concursos) {
            if (concurso.nombreContiene(parteNombre)) {
                resultado.add(concurso);
            }
        }
        return resultado;
    }
}
