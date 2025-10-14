package gestionAlumnos;

public class alumnos {
    private String nombre;
    private double legajo;

    public alumnos(String nombre, double legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "alumnos{" + "nombre=" + nombre + ", legajo=" + legajo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public double getLegajo() {
        return legajo;
    }
    
}
