package n1ejercicio2;

import java.util.*;

public class Listas {
    public static void main(String[] args) {

        ArrayList<Integer> pares = new ArrayList<>();
        pares.add(2);
        pares.add(4);
        pares.add(6);
        pares.add(8);
        pares.add(10);

        ArrayList<Integer> impares = new ArrayList<>();
        impares.add(1);
        impares.add(3);
        impares.add(5);
        impares.add(7);
        impares.add(9);

        System.out.println("Lista numeros pares");

        //recorremos la lista numeros Pares
        for (Integer numerosPares: pares) System.out.print(numerosPares);

        System.out.println("\nLista numeros impares");

        //recorremos la lista numeros Impares
        for (Integer numerosImpares: impares) System.out.print(numerosImpares);

        //creo ListIteradores
        ListIterator <Integer> itPares = pares.listIterator();
        ListIterator <Integer> itImpares = impares.listIterator();

        //junto a las dos listas
        while(itPares.hasNext()){//el bucle parará cuando la lista pares no tenga mas indice que recorrer
            //si la lista impares aún tiene elementos
            if(itImpares.hasNext()){
                itImpares.next();

            }
            //agrega en listaImpares el primer elemento de la listaPares y el bucle continuara con la sigiente posicion.
            itImpares.add(itPares.next());

        }
        System.out.println("\nLista numeros combinados");
        System.out.println(impares);//saldrá la lista de numeros en orden ascendente


    }

}
