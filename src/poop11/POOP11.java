package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * <p>Los autores de esta clase son IvanOS, Maiap, y Nadia.</p>
 * 
 * @author IvanOS
 */
public class POOP11 {

    public static void main(String[] args) {
        
        File archivo = new File("archivo.txt");
        System.out.println(archivo.exists());
        try {
            boolean seCreo = archivo.createNewFile();
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("······FileWriter········");
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe texto para el archivo: ");
            String texto = br.readLine();
            System.out.println(texto);
            
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(texto);
            salida.println("Esta es la segunda linea");
            
            for (int i = 0; i < 10; i++) {
                salida.println("Linea " + i);
            }
            for (int i = 0; i < 10; i++) {
                salida.println("Cargando archivo: " + i * 10 + "%");
            }
            
            salida.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("########FileReader########");
        try {
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("####");
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            fr.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("######## String Tokenizer ########");
        String alumnoParseado = "Erick Fernando,Soto,Bolaños,321184593,18,3";
        System.out.println(alumnoParseado);
        StringTokenizer tokenizador = new StringTokenizer(alumnoParseado, ",");
        while (tokenizador.hasMoreTokens()) {
            System.out.println(tokenizador.nextToken());
        }
        
        System.out.println("#################");
        System.out.println("");
        
        Alumno alumno1 = new Alumno("Ricardo Ivan", "Ocadiz", "Salazar", 321205476, 19, 3);
        Alumno alumno2 = new Alumno("Maia Sofia", "Hernandez", "Mejia", 321206745, 20, 3);
        Alumno alumno3 = new Alumno("Spidey", "Parker", "Elhombrequearaña", 345605476, 17, 0);
        Alumno alumno4 = new Alumno("Luis", "Perita", "UwU", 378195476, 19, 1);
        Alumno alumno5 = new Alumno("Sofia", "Camacho", "Falcon", 456705476, 19, 3);
        
        System.out.println("##############");
        
        ArrayList<Alumno> lista = new ArrayList<>();
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        lista.add(alumno4);
        lista.add(alumno5);
        
        for (Alumno alumno : lista) {
            System.out.println(alumno.getNombre());
        }
        
        System.out.println("Escribiendo archivo");
        try {
            FileWriter fw = new FileWriter("alumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            
            for (Alumno alumno : lista) {
                salida.println(alumno);
            }
            salida.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Leyendo archivo y creando nuevos objetos Alumno");

        ArrayList<Alumno> nuevaLista = new ArrayList<>(); // Nueva lista para almacenar los objetos Alumno

        try {
            FileReader fr = new FileReader("alumnos.csv");
            BufferedReader br = new BufferedReader(fr);

            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null && contador < 10) { // Leer 10 líneas máximo
                StringTokenizer tokenizador2 = new StringTokenizer(linea, ",");

                // Tokenizar cada elemento de la línea
                String nombre = tokenizador2.nextToken();
                String apPat = tokenizador2.nextToken();
                String apMat = tokenizador2.nextToken();
                int numCuenta = Integer.parseInt(tokenizador2.nextToken());
                int edad = Integer.parseInt(tokenizador2.nextToken());
                int semestre = Integer.parseInt(tokenizador2.nextToken());

                // Crear el objeto Alumno con los datos tokenizados
                Alumno nuevoAlumno = new Alumno(nombre, apPat, apMat, numCuenta, edad, semestre);

                // Agregar el objeto Alumno a la nueva lista
                nuevaLista.add(nuevoAlumno);
                contador++;
            }

            br.close(); // Cerrar el archivo una vez que se ha terminado de leer

        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }

        // Imprimir los objetos Alumno creados a partir del archivo
        System.out.println("Alumnos creados desde el archivo:");
        for (Alumno alumno : nuevaLista) {
            System.out.println(alumno);
        }        
        
    }
    
}