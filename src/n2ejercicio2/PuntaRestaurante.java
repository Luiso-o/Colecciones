package n2ejercicio2;

import java.util.TreeSet;

public class PuntaRestaurante{
    public static void main(String[] args) {

        Restaurante rest1 = new Restaurante("restaurante1",8);
        Restaurante rest2 = new Restaurante("restaurante2",9);
        Restaurante rest3 = new Restaurante("restaurante3",7);
        Restaurante rest4 = new Restaurante("restaurante4",6);
        Restaurante rest5 = new Restaurante("restaurante4",6);//mismos elementos de rest4 (no lo leerá)
        Restaurante rest6 = new Restaurante("restaurante2",10);//mismo nombre, pero diferente puntuacion(lo leerá)
        Restaurante rest7 = new Restaurante("restaurante5",10);//mismo puntaje, pero diferente nombre(lo leerá)

        //instanciar un TreeSet con la interface CompareTo(clase Restaurante)
        TreeSet<Restaurante> ordenNotas = new TreeSet<>();

        ordenNotas.add(rest1);
        ordenNotas.add(rest2);
        ordenNotas.add(rest3);
        ordenNotas.add(rest4);
        ordenNotas.add(rest5);
        ordenNotas.add(rest6);
        ordenNotas.add(rest7);

        for (Restaurante miTreeset : ordenNotas) {
            System.out.println(miTreeset.toString());
        }

    }

}
