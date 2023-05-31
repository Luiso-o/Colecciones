package n3ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeeCSV {

    private static final String SEPARADOR = ",";
    private ArrayList<Persona> listaPersonas;

    public LeeCSV() {
        listaPersonas = misPersonas();
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public ArrayList<Persona> misPersonas() {
        ArrayList<Persona> misPersonas = new ArrayList<>();

        BufferedReader bufferLectura = null;
        try {
            bufferLectura = new BufferedReader(new FileReader("src/n3ejercicio1/documento.csv"));

            String linea = bufferLectura.readLine(); // Leer una línea del archivo

            while (linea != null) {
                String[] campos = linea.split(SEPARADOR); // Separar la línea leída con el separador definido

                //Verifico que las lineas contengas al menos tres campos
                if(campos.length >= 3) {
                    String nombre = campos[0];
                    String apellido = campos[1];
                    String dni = campos[2];

                    Persona persona = new Persona(nombre, apellido, dni);
                    misPersonas.add(persona);
                }

                linea = bufferLectura.readLine(); // Leer otra línea del archivo
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return misPersonas;
    }
}
