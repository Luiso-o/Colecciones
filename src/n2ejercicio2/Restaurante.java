package n2ejercicio2;

public class Restaurante implements Comparable<Restaurante>{
    private final String nombre;
    private final int puntuacion;

    public Restaurante(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "\t" + nombre + ", puntuacion: " + puntuacion;
    }

    @Override
    public int compareTo(Restaurante o) {
        // Compara los restaurantes por puntuación
        if (puntuacion == o.puntuacion) {

            // Si la puntuación es igual, compara por nombre
            return this.nombre.compareTo(o.nombre);

        } else {
            // Ordena por puntuación de mayor a menor
            return Integer.compare(o.puntuacion, this.puntuacion);
        }
    }
}
