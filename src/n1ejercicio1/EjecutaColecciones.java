package n1ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

public class EjecutaColecciones {

    public static void main(String[] args) {

        List<Mes> meses = new ArrayList<>();

        meses.add(new Mes("Enero"));
        meses.add(new Mes("Febrero"));
        meses.add(new Mes("Marzo"));
        meses.add(new Mes("Abril"));
        meses.add(new Mes("Mayo"));
        meses.add(new Mes("Junio"));
        meses.add(new Mes("Julio"));
        meses.add(new Mes("Septiembre"));
        meses.add(new Mes("Octubre"));
        meses.add(new Mes("Noviembre"));
        meses.add(new Mes("Diciembre"));

        System.out.println("\n--------------------------------\nImprimo en consola sin modificaciones:");

        for (Mes mese : meses) {
            System.out.println(mese);//Array con 11 meses del año
        }

        //anexo el indice donde quiero el nuevo objeto en el array con el metodo add
        meses.add(7, new Mes("Agosto"));

        System.out.println("\n--------------------------------\nImprimo con modificaciones en la lista:");

        for (Mes mes : meses) {
            System.out.println(mes);//Imprimo los datos en consola con el nuevo objeto ingresado uno por uno
        }

        //convertir el array en un HashSet
        //instancio un Objeto HashSet

        //uso un bulcle para agregar los objetos del array al HashSet
        Set<Mes> coleccionMeses = new HashSet<>(meses);

        //agrego todos los elementos de la lista al HashSet
        coleccionMeses.addAll(meses);

        //Agrego un mes repetido para controlar que la coleccion no asepte elementos repetidos
        coleccionMeses.add(new Mes("Enero"));
        coleccionMeses.add(new Mes("Marzo"));
        coleccionMeses.add(new Mes("Septiembre"));
        coleccionMeses.add(new Mes("Mayo"));

        System.out.println("\n--------------------------------\nImprimimos el HashSet:");

        for (Mes coleccionMese : coleccionMeses) {
            //imprimirá la coleccion desordenada, pero sin ningun elemento repetido
            System.out.println(coleccionMese);

        }







     }

    }
