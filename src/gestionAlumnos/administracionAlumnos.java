package gestionAlumnos;

import java.util.Iterator;
import java.util.List;

public class administracionAlumnos {
    private List<alumnos> listaAlumnos;
    private int siguienteLegajo = 1001;
     
    public administracionAlumnos(List<alumnos> lista) {
        this.listaAlumnos = lista;
    }
    
    public void agregarAlumnoLista(String nombre){
        alumnos nuevoAlumno = new alumnos(nombre, siguienteLegajo ++);
        listaAlumnos.add(nuevoAlumno);
    }
    
    public boolean eliminarAlumnoPorLegajo(int legajo) { 
        Iterator<alumnos> it = listaAlumnos.iterator();
        while (it.hasNext()) {
            alumnos a = it.next();
            if (a.getLegajo() == legajo) { 
                it.remove();
                return true;
            }
        }
        return false; 
    }
    
    public void mostrarListaAlmunos(){
        if (listaAlumnos == null){
            System.out.println("No hay alumnos registrados");
            return;
        }
        System.out.println("\n --- Lista alumnos ( cantidad: " + listaAlumnos.size() + ") ---");
        for (alumnos alumno : listaAlumnos){
            System.out.println(alumno);
        }
    }
}
