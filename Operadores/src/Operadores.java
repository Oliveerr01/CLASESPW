import java.util.Scanner;

public class Operadores {
    public void operadoresAritmeticos() {
        System.out.println("Explicacion de los operadores aritméticos");
        //unarios solo necesito un operando
        int operandoUno = 5;
        operandoUno++; //operandoUno = operandoUno+1
        operandoUno++;
        operandoUno++;
        operandoUno++;
        System.out.println("Después de incrementar:"+operandoUno);
        operandoUno--; //operandoUno = operandoUno-1
        operandoUno--;
        operandoUno--;
        System.out.println("Después de decrementar:"+operandoUno);

        //binarios
        int operandoDos = 5;
        int suma = operandoUno+operandoDos;
        System.out.println("El resultado de la suma es:" + suma);
        int resta = operandoUno - operandoDos;
        System.out.println("El resultado de la resta es:" + resta);
        int multiplicacion = operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicación es:" + multiplicacion);
        double division = (double) operandoUno / operandoDos; //el double es para cambiar el operandoUno a double para que de decimal el rs
        System.out.println("El resultado de la divisón es:" + division);
        System.out.printf("El resultado de la división es %4f", division);
        int modulo = operandoUno % operandoDos; //el resto de al división
        System.out.println(modulo);
    }

    public void operadoresAsignacion() {
        int operandoUno = 6;
        operandoUno += 6; //operandoUno = operandoUno + 6; // el resultado de ambas da 12
        operandoUno -= 3; // 9
        operandoUno *= 2; //18
        operandoUno /= 2; // 9
        operandoUno %= 3; // 0
    }

    public void operadoresComparacion() {
        int numeroUno = 1;
        int numeroDos = 4;

        boolean resultado = numeroUno > numeroDos; //false
        System.out.println("elresultado de > es:" + resultado);
        resultado = numeroUno < numeroDos; // true
        System.out.println("elresultado de < es:" + resultado);
        resultado = numeroUno == numeroDos; //false
        System.out.println("elresultado de == es:" + resultado);
        resultado = numeroUno != numeroDos; // true
        System.out.println("elresultado de != es:" + resultado);

    }

    public void operadoresLogicos() {
        int numeroUno = 4;
        int numeroDos = 10;
        int numeroTres = 17;

        boolean resultadoLogicoAND = numeroUno > 1 && numeroDos < 11 && numeroDos != numeroTres && numeroTres % 2 != 0;
//   true        &&     true     &&        true           &&         True  --> true
        System.out.println("El resultado logico del AND es " + resultadoLogicoAND);

        boolean resultadoLogicoOR = numeroUno != 10 || numeroDos > 10 || numeroTres < numeroDos || numeroDos % 2 != 0;
//     true  ||      false   ||        false         ||         false   --> true
        System.out.println("El resultado logico de OR es: " + resultadoLogicoOR);

        boolean resultadoCon = numeroUno < 10 || numeroTres > 0 || numeroDos != 9 & numeroUno > 0;
// true     ||    true      ||    true      &    true --> true
        System.out.println("El resultado logico de OR y AND es: " + resultadoCon);
    }

    public void evaluarCandidato() {
        Scanner lectorTeclado = new Scanner (System.in); //la variable scanner es para que podamos escribir
        System.out.println("Dime tu nombre y apellidos");
        String nombreApellido = lectorTeclado.nextLine(); //nextLine es para escribir strings con espacios
        System.out.println("Dime tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Dime tu salario");
        double salario= lectorTeclado.nextDouble();
        System.out.println("Tienes experiencia");
        boolean experiencia = lectorTeclado.nextBoolean();

        //Edad inferior a 40 y sueldo < 40000 y experiencia
        boolean resultadoEvaluacion = edad<40 && salario < 40000 && experiencia;
        System.out.println("El resultado de la evaluación es:"+resultadoEvaluacion);

        lectorTeclado.close();  //es para cerrar el proceso, es buena practica
    }

    public void cambioTipo() {
        //int letraASCII = 115;
        //char letra = 'a'
        //String palabra = "hola";

        //System.out.println ((char)letrAScii);
        //System.out.println ((int)letra);
        //System.out.println (Integer.parseInt(palabra));

        //String palabra = "si";
        //System.out.println (Boolean.parseBoolean(palabra));

        //int numero =123;
        //System.out.println(String.valueOf(123)+1); //--> en consola da 1231

        boolean cierto = true;
        System.out.println(String.valueOf(cierto)+"asd"); //--> trueasd

    }
}
