/*
Modela asignaturas de un alumno y un profesor que pone notas y calcula la media.

- Asignatura: identificador, calificación; constructor con id; getters y setter de calificación.
- Alumno: tres Asignatura; constructores con 3 Asignatura o con 3 ids.
- Profesor: ponerNotas(Alumno) asigna aleatorias; calcularMedia(Alumno) devuelve double.
- Entrada: crear 3 Asignaturas, 1 Alumno, 1 Profesor; poner notas y mostrar media y notas.
 */

import model.Alumno;
import model.Asignatura;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        //id= 1    calificación= 0.0
        Asignatura sistemas = new Asignatura(2);
        //id= 2    calificación= 0.0
        Asignatura entornos = new Asignatura(3);
        //id= 3    calificación= 0.0
        Asignatura baseDatos = new Asignatura();
        //id= 0    calificaicón= 0.0
        Asignatura fundamentos = new Asignatura();

        //con el constructor de asignaturas
        Alumno borja = new Alumno(programacion,sistemas,entornos);
        //asi1 = programacion(id 1, calificacion 0,0 ), asi2 = sistemas(2,0.0), asi3 = entornos(2,0.0)
        Alumno maria = new Alumno(programacion,sistemas,entornos);
        Alumno marcos = new Alumno(programacion,sistemas,entornos);

        //con el constructor de id
        Alumno celia = new Alumno(4,5,6);
        //asignatura1 = Asignatura (4 id, nota 0.0), asignatura2 = Asignatura (5, 0.0) ,asignatura3 = Asignatura (6,0.0)
        celia.mostrarDatos();
    }

}
