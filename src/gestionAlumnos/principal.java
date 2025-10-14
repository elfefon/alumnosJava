package gestionAlumnos;

import gestionAlumnos.alumnos;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class principal {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        administracionAlumnos admin;
        List<alumnos> listaElegida = null;
    
        System.out.println(" --- Configuracion de Menu ---"
                     + "\n 1. ArrayList."
                    + "\n 2. LinkedList."
                    + "\n 3. Salir"
                    + "\n Elige un metodo de busqueda.");

        int opcionConfig = sc.nextInt();
        sc.nextLine();

        if (opcionConfig == 1) {
            listaElegida = new ArrayList<>();
        } else if (opcionConfig == 2) {
            listaElegida = new LinkedList<>();
        } else if (opcionConfig == 3) {
            System.out.println("Saliendo del programa.");
            return;
        } else{
            System.out.println("Opción no válida. Debe ser 1 o 2.");
        }
        
        admin = new administracionAlumnos(listaElegida);
        int opcion;
        
        do {
            System.out.println(" --- Menu Principal --- "
                + "\n1. Agregar Alumno"
                + "\n2. Eliminar Alumno"
                + "\n3. Mostrar lista"
                + "\n4. Salir");        
        
            opcion = sc.nextInt();
            sc.nextLine();
            
            String nombreAlumno;
            int legajoIngresado;
            
            switch (opcion){
                case 1 -> {
                    System.out.println("Nombre del alumno que desea agregar: ");
                    nombreAlumno = sc.nextLine();
                    admin.agregarAlumnoLista(nombreAlumno);
                    break;
                }
                case 2 -> {
                    System.out.println("Ingrese legajo del alumno que desea eliminar:  ");
                    legajoIngresado = Integer.parseInt(sc.nextLine());
                    admin.eliminarAlumnoPorLegajo(legajoIngresado);
                    break;
                }
                case 3 -> {
                    admin.mostrarListaAlmunos();
                    break;
                }
                case 4 ->{
                    break;
                }
                default ->{
                    System.out.println("Opcion incorrecta");
                }
            }
        } while (opcion != 4);  
    }
}

