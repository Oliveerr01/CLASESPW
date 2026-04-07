package model;

import lombok.*;

@Getter
@Setter

public class Asignatura{
    private int id;
    private double calificacion;

    //ya está el constructor por defecto que está vacio y creamos otro

    public Asignatura(int id){  //al crear este nuevo constructor el que viene por defecto ya no existe
        this.id = id;
    }

    public Asignatura(){}  //creamos un constructor vacio por si queremos dejar una asigntura vacia


    public void mostrarDatos(){
        System.out.println("Mostrando los datos de la asigntura requerida");
        System.out.println("id = " + id);
        System.out.println("calificacion = " + calificacion);
    }
}
