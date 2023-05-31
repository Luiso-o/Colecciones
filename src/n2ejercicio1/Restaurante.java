package n2ejercicio1;

import java.util.Objects;

public class Restaurante {
    private final String nombre;
    private final int puntuacion;

    public Restaurante(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Restaurante that)) return false;
        return puntuacion == that.puntuacion && nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, puntuacion);
    }

    @Override
    public String toString() {
        return "\t" + nombre + ", puntuacion: " + puntuacion;
    }
}
