import model.Alumno;
import model.Persona;
import model.Profesor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Persona juan = new Persona("Juan", "Gomez");
        Alumno alumno1 = new Alumno("Borja","Martin",1234);
        Alumno alumno2 = new Alumno("Celia","Martin",1234);
        Persona alumno3 = new Alumno("Marcos","Lopez",1234);
        Profesor profesor1 = new Profesor("Juan","Gomez",10000);
        Persona profesor2 = new Profesor("Maria","Jimenez",10000,7);
        Profesor profesor3 = new Profesor("Roberto","Gonzales",30000,14);

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);
        listaPersonas.add(alumno3);
        listaPersonas.add(profesor1);
        listaPersonas.add(profesor2);
        listaPersonas.add(profesor3);

        for (Persona persona : listaPersonas){
            persona.saludar();
            persona.mostrarDatos();
            if(persona instanceof Alumno) {         //ponemos un if para que cuando en caso de encontrarse con alumno haga
                ((Alumno) persona).realizarExamen();//realizaExamen y en caso de profesor haga corregirExamen
            } else if (persona instanceof Profesor) {
                ((Profesor) persona).corregirExamen();
            }

        }

        /*profesor2.saludar();
        profesor2.corregirExamen();
        profesor2.mostrarDatos();

        //Persona alumno2 = new Alumno("Maria","Lopez",12345);
        //((Alumno)alumno2).realizarExamen();

        //alumno1.realizarExamen();
        //alumno1.saludar();
        //alumno1.mostrarDatos();*/
    }
}
