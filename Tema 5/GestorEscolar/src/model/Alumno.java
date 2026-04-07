package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor  //es lo mismo que crear un constructor vacio
@Setter
@Getter
public class Alumno {

    private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3){
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno(int id1, int id2, int id3){
        this.asignatura1 = new Asignatura(id1);
        this.asignatura2 = new Asignatura(id2);
        this.asignatura3 = new Asignatura(id3);
    }
    public void mostrarDatos(){
        System.out.println("Imprimiendo datos del alumno");
        asignatura1.mostrarDatos();
        asignatura2.mostrarDatos();
        asignatura3.mostrarDatos();
    }

}
