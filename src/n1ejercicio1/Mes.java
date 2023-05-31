package n1ejercicio1;

import java.util.*;

public class Mes {

    private final String nombre;

    public Mes(String nombre) {
        this.nombre = nombre;
    }

    //metodos autogenerados para evitar que no haya objetos repetidos en las colecciones, a
    //partir de una o mas referencias, en esta caso la variable nombre
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mes mes)) return false;
        return nombre.equals(mes.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Mes: " + nombre;
    }

}
