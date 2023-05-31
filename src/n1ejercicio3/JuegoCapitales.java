package n1ejercicio3;
import java.io.*;
import java.util.*;

public class JuegoCapitales {
    public JuegoCapitales(){}

    public static void main(String[] args) {

        //crear el HashMap y una variable bandera con la ruta del archivo countries
        HashMap<String, String> paisesCapitales = new HashMap<>();
        String archivo = "src/n1ejercicio3/countries.txt";

        //Leer el archivo y guardar los datos en el HashMap
        //crear un objeto BufferedReader que encuentra y lee el documento txt
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;
            while ((linea = br.readLine()) != null) {//acabará cuando ya no hayan lineas que leer
                String[] partes = linea.split(";");//usamos ; como separador pais;capital

                if (partes.length == 2) {//si la cadena está compuesta por dos partes
                    String pais = partes[0];//guarda el pais
                    String capital = partes[1];//guarda la capital
                    paisesCapitales.put(pais, capital);//vamos agregando en Map pais por pais
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");//error que pueda ocurrir en el archivo txt
            e.printStackTrace();//traza de la pila
        }

        // Verificar si hay países disponibles
        if (paisesCapitales.isEmpty()) {
            System.out.println("No se encontraron países y capitales en el archivo.");
        }

        // Pedir el nombre del usuario/a
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        int puntuacion = 0;//bandera que irá sumando los puntos del jugador

        // Juego: Adivinar las capitales de forma aleatoria
        for (int i = 0; i < 10; i++) {
            // Seleccionar un país aleatoriamente Method obtenerPaisAleatorio(HashMap)
            String paisAleatorio = obtenerPaisAleatorio(paisesCapitales);

            // Obtener la capital correspondiente
            String capital = paisesCapitales.get(paisAleatorio);

            // Preguntar al usuario por la capital del país
            System.out.println("¿Cuál es la capital de " + paisAleatorio + "?");
            String respuesta = scanner.nextLine();

            // Verificar si la respuesta es correcta
            if (respuesta.equalsIgnoreCase(capital)) {
                System.out.println("¡Respuesta correcta!");
                puntuacion++;
            } else {
                System.out.println("Respuesta incorrecta. La capital de " + paisAleatorio + " es " + capital);
            }
        }

        // Guardar la puntuación en el archivo "clasificacion.txt"
        String archivoClasificacion = "clasificacion.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoClasificacion, true))) {
            bw.write(nombreUsuario + " - Puntuación: " + puntuacion);
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error al guardar la clasificación.");
            e.printStackTrace();
        }

        System.out.println("Juego finalizado. Puntuación de: " + nombreUsuario + ": " + puntuacion);
    }

    // Método para obtener un país aleatorio del HashMap
    private static String obtenerPaisAleatorio(HashMap <String, String> paisesCapitales) {
        Random random = new Random();//objeto random,para generar numeros aleatorios
        //generamos un numero aleatorio con las dimensiones del mapa empezando del 0 con el metodo nextInt(Clase Random)
        int indice = random.nextInt(paisesCapitales.size());
        int contador = 0;

        for (Map.Entry <String, String> entry : paisesCapitales.entrySet()) {
            if (contador == indice) {
                return entry.getKey();//devolvemos el pais si el contador coincide con el numero que tiene indice
            }
            contador++;//el contador ira incrementando hasta que encuentre el numero de indice
        }
        return null;//si la condicion no se cumple se devuelve un null
    }
}
