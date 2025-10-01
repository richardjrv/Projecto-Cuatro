
package com.mycompany.proyectocuatro;


public class ProyectoCuatro {

    public static void main(String[] args) {
        System.out.println("Hola este es mi programa");        
        //crear 
        Estudiantes estudianteUno = new Estudiantes();
        estudianteUno.nombre ="Richad";
        estudianteUno.id = 225009182;
        estudianteUno.calificacionPromedio= 10;
        //mostrar
        System.out.println("nombre "+estudianteUno.nombre);   
        System.out.println("id "+estudianteUno.id);
        System.out.println("calificacion "+estudianteUno.calificacionPromedio);
        
        //crear 
        Estudiantes estudianteDos = new Estudiantes();
        estudianteDos.nombre ="Josue";
        estudianteDos.id = 219824743;
        estudianteDos.calificacionPromedio= 4;
        //mostrar
        System.out.println("nombre "+estudianteDos.nombre);   
        System.out.println("id "+estudianteDos.id);
        System.out.println("calificacion "+estudianteDos.calificacionPromedio);
    }
}
