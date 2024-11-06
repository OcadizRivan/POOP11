/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 * La clase {@code Alumno} representa a un estudiante con atributos básicos como nombre, 
 * apellidos, número de cuenta, edad y semestre. 
 * <p>Los autores de esta clase son IvanOS, Maiap, y Nadia.</p>
 * 
 * @author IvanOS
 */
public class Alumno {
    
    /**
     * Nombre del alumno.
     */
    private String nombre;
    
    /**
     * Apellido paterno del alumno.
     */
    private String apPat;
    
    /**
     * Apellido materno del alumno.
     */
    private String apMat;
    
    /**
     * Número de cuenta del alumno.
     */
    private int numCuenta;
    
    /**
     * Edad del alumno en años.
     */
    private int edad;
    
    /**
     * Semestre que cursa actualmente el alumno.
     */
    private int semestre;

    /**
     * Constructor vacio.
     */
    public Alumno() {     
    }

    /**
     * Constructor lleno.
     * 
     * @param nombre El nombre del alumno.
     * @param apPat El apellido paterno del alumno.
     * @param apMat El apellido materno del alumno.
     * @param numCuenta El número de cuenta del alumno.
     * @param edad La edad del alumno en años.
     * @param semestre El semestre que cursa actualmente el alumno.
     */
    public Alumno(String nombre, String apPat, String apMat, int numCuenta, int edad, int semestre) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.semestre = semestre;
    }

    /**
     * Obtiene el nombre del alumno.
     * 
     * @return El nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     * 
     * @param nombre El nuevo nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno del alumno.
     * 
     * @return El apellido paterno del alumno.
     */
    public String getApPat() {
        return apPat;
    }

    /**
     * Establece el apellido paterno del alumno.
     * 
     * @param apPat El nuevo apellido paterno del alumno.
     */
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    /**
     * Obtiene el apellido materno del alumno.
     * 
     * @return El apellido materno del alumno.
     */
    public String getApMat() {
        return apMat;
    }

    /**
     * Establece el apellido materno del alumno.
     * 
     * @param apMat El nuevo apellido materno del alumno.
     */
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    /**
     * Obtiene el número de cuenta del alumno.
     * 
     * @return El número de cuenta del alumno.
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * Establece el número de cuenta del alumno.
     * 
     * @param numCuenta El nuevo número de cuenta del alumno.
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Obtiene la edad del alumno en años.
     * 
     * @return La edad del alumno.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del alumno en años.
     * 
     * @param edad La nueva edad del alumno.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el semestre que cursa actualmente el alumno.
     * 
     * @return El semestre del alumno.
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Establece el semestre que cursa actualmente el alumno.
     * 
     * @param semestre El nuevo semestre del alumno.
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * Metodo sobreescrito que devuelve una representación en cadena de texto de todos los datos del alumno, 
     * con cada atributo separado por una coma.
     * 
     * @return Una cadena de texto que representa al alumno en el formato:
     *         "nombre,apPat,apMat,numCuenta,edad,semestre".
     */
    @Override
    public String toString() {
        return nombre + "," + apPat + "," + apMat + "," + numCuenta + "," + edad + "," + semestre;
    }

}
