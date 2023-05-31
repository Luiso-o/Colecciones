package n2ejercicio1;

import java.util.*;

public class PuntaRestaurante {
    public static void main(String[] args) {

        Restaurante rest1 = new Restaurante("restaurante1",8);
        Restaurante rest2 = new Restaurante("restaurante2",9);
        Restaurante rest3 = new Restaurante("restaurante3",7);
        Restaurante rest4 = new Restaurante("restaurante4",6);
        Restaurante rest5 = new Restaurante("restaurante4",6);//mismos elementos de rest4 (no lo leerá)
        Restaurante rest6 = new Restaurante("restaurante2",10);//mismo nombre, pero diferente puntuacion(lo leerá)
        Restaurante rest7 = new Restaurante("restaurante5",10);//mismo puntaje, pero diferente nombre(lo leerá)

        //imprimirá por orden en que fueron agregados
        Set<Restaurante> restaurantes = new LinkedHashSet<>();

        restaurantes.add(rest1);
        restaurantes.add(rest2);
        restaurantes.add(rest3);
        restaurantes.add(rest4);
        restaurantes.add(rest5);
        restaurantes.add(rest6);
        restaurantes.add(rest7);

        for (Restaurante misRestaurantes : restaurantes) {
            System.out.println(misRestaurantes);
        }
    }
}
