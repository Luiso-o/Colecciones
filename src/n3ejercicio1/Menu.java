package n3ejercicio1;

import javax.swing.*;
import java.util.*;

public class Menu{

    public static int opcionesMenu(){

       String elige = JOptionPane.showInputDialog("Elige una opcion\n\n" +
                "\t1-Introducir Persona\n" +
                "\t2-Mostrar las personas ordenadas por nombre (Z-A)\n" +
                "\t3-Mostrar las personas ordenadas por nombre (Z-A)\n" +
                "\t4-Mostrar las personas ordenadas por apellido (A-Z)\n" +
                "\t5-Mostrar las personas ordenadas por apellido (Z-A)\n" +
                "\t6-Mostrar las personas ordenadas por DNI (1-9)\n" +
                "\t7-Mostrar las personas ordenadas por DNI (9-1)\n" +
                "\t0-Salir");

        return Integer.parseInt(elige);
    }

    public static void eligeOpcionMenu(ArrayList<Persona> listaPersonas){

        int opcion;

        do {
            opcion = opcionesMenu();

            switch (opcion) {
                case 0 -> JOptionPane.showMessageDialog(null, "Hasta Luego ;)");
                case 1 -> agregarPersona(listaPersonas);
                case 2 -> nombresAscendente(listaPersonas);
                case 3 -> nombresDescendente(listaPersonas);
                case 4 -> apellidoAscendente(listaPersonas);
                case 5 -> apellidoDescendente(listaPersonas);
                case 6 -> dniAscendente(listaPersonas);
                case 7 -> dniDescendente(listaPersonas);
                default -> JOptionPane.showMessageDialog(null, "Opcion no encontrada");
            }

        } while (opcion != 0);

    }

    public static void agregarPersona(ArrayList<Persona> listaPersonas){

      String nombre = JOptionPane.showInputDialog("Introduce el nombre");
      String apellido = JOptionPane.showInputDialog("Introduce el apellido");
      String dni = JOptionPane.showInputDialog("Introduce el DNI");

      listaPersonas.add(new Persona(nombre,apellido,dni));
      JOptionPane.showMessageDialog(null, "Persona agregada correctamente :)");

    }

    public static void nombresAscendente(ArrayList<Persona> listaPersonas){

        //instancia de treeset implementado el Comparador personalizado para que aparezca en orden
        TreeSet<Persona> TreePersonasAs = new TreeSet<>(new Comparator<>() {

            @Override
            public int compare(Persona o1, Persona o2) {

                if (o1.getNombre().compareTo(o2.getNombre()) == 0) {
                    return o1.getDni().compareTo(o2.getDni());
                }
                    return o1.getNombre().compareTo(o2.getNombre());
                }
        });

        TreePersonasAs.addAll(listaPersonas);
        System.out.println("\n" + "Nombre--Apellido--DNI (Lista en orden Nombres (A-Z)");

        for (Persona treePer: TreePersonasAs) {
            System.out.println(treePer.getNombre() +"--"+ treePer.getApellido()+"--"+treePer.getDni());
        }

    }

    public static void nombresDescendente(ArrayList<Persona> listaPersonas){

        TreeSet<Persona> treePersonasDescendente = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Persona o1, Persona o2) {

                if (o2.getNombre().compareTo(o1.getNombre()) == 0) {
                    return o2.getDni().compareTo(o1.getDni());

                }
                return o2.getNombre().compareTo(o1.getNombre());
            }
        });

        treePersonasDescendente.addAll(listaPersonas);

        System.out.println("\nNombre--Apellido--DNI (Lista en orden Nombre (Z-A)");

        for (Persona persona : treePersonasDescendente) {
            System.out.println(persona.getNombre() + "--" + persona.getApellido() + "--" + persona.getDni());
        }

    }

    public static void apellidoAscendente(ArrayList<Persona> listaPersonas){

        //instancia de treeset implementado el Comparador personalizado para que aparezca en orden
        TreeSet<Persona> TreePersonasAs = new TreeSet<>(new Comparator<>() {

            @Override
            public int compare(Persona o1, Persona o2) {
               if(o1.getApellido().compareTo(o2.getApellido()) == 0){
                   return o1.getDni().compareTo(o2.getDni());

               }
                return o1.getApellido().compareTo(o2.getApellido());
            }
        });

        TreePersonasAs.addAll(listaPersonas);
        System.out.println("\n" + "Nombre--Apellido--DNI (Lista en orden Apellido (A-Z)");

       for (Persona treePer: TreePersonasAs) {
            System.out.println(treePer.getNombre() +"--"+ treePer.getApellido()+"--"+treePer.getDni());
        }


    }

    public static void apellidoDescendente(ArrayList<Persona> listaPersonas){

        TreeSet<Persona> treePersonasDescendente = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Persona o1, Persona o2) {

                if (o2.getApellido().compareTo(o1.getApellido()) == 0) {
                    return o2.getDni().compareTo(o1.getDni());

                }
                return o2.getApellido().compareTo(o1.getApellido());
            }
        });

        treePersonasDescendente.addAll(listaPersonas);

        System.out.println("\nNombre--Apellido--DNI (Lista en orden Apellido (Z-A)");

        for (Persona persona : treePersonasDescendente) {
            System.out.println(persona.getNombre() + "--" + persona.getApellido() + "--" + persona.getDni());
        }


    }

    public static void dniAscendente(ArrayList<Persona> listaPersonas){

        TreeSet<Persona> TreePersonasAs = new TreeSet<>(new Comparator<>() {

            @Override
            public int compare(Persona o1, Persona o2) {
               return o1.getDni().compareTo(o2.getDni());
            }
        });

        TreePersonasAs.addAll(listaPersonas);
        System.out.println("\n" + "Nombre--Apellido--DNI (Lista en orden Dni (A-Z)");

        for (Persona treePer: TreePersonasAs) {
            System.out.println(treePer.getNombre() +"--"+ treePer.getApellido()+"--"+treePer.getDni());
        }


    }

    public static void dniDescendente(ArrayList<Persona> listaPersonas){

        TreeSet<Persona> TreePersonasAs = new TreeSet<>(new Comparator<>() {

            @Override
            public int compare(Persona o1, Persona o2) {
                return o2.getDni().compareTo(o1.getDni());
            }
        });

        TreePersonasAs.addAll(listaPersonas);
        System.out.println("\n" + "Nombre--Apellido--DNI (Lista en orden Dni (Z-A)");

        for (Persona treePer: TreePersonasAs) {
            System.out.println(treePer.getNombre() +"--"+ treePer.getApellido()+"--"+treePer.getDni());
        }
    }
}
