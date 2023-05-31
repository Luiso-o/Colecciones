package n3ejercicio1;

import java.util.ArrayList;

public class RunMain {
    public static void main(String[] args) {

        LeeCSV miCSV = new LeeCSV();
        ArrayList<Persona> listaPersonas = miCSV.getListaPersonas();

        Menu.eligeOpcionMenu(listaPersonas);

        System.out.println("Fin de la ejecución");
    }
}
