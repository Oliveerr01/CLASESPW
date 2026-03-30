import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 2;
        // defino el array segun el numero de elementos
        boolean[] aciertos = new boolean[4];
        // [false,false,false,false]
        String[] palabras = new String[3];
        // [null,null,null]
        Object[] cosas = new Object[5];
        // [null,null,null,null,null]
        int[] numerosConcretos = new int[]{5, 3, 1, 10, 8, 23, 12, 32};
        Integer[] numerosConcretos2 = new Integer[]{1, 3, 4, 5, 6, 7, 8};
        boolean[] aciertosConcretos = new boolean[]{false, true, true};
        String[] palabrasConcretas = new String[]{"hola", "programacion", "array"};
        Object[] cosasConcretas = new Object[]{1, "adios", false, 6, 0.0, "hola", 'a'};

        for (Object item : cosasConcretas) {
            if (item instanceof Integer){
                if ((int) item>0) {
                    System.out.println("El numero es mas grande de 0");
                }
            } else if (item instanceof String) {
                System.out.println("La longitud de la palabra es "+item.toString().length());
            }
        }
        
        /*
        //acciones que puedo realizar
        System.out.println("Cuantos numeros vas a querer guardar");
        int tamanio = scanner.nextInt();
        int[] numeros = new int[tamanio];

        //guardar numeros aleatorios entre el 1 y el 50 en los huecos que haya [ , , , , ,]
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= (int) (Math.random()*50)+1; //1-50
        }

        System.out.println("Que numero quieres buscar?");
        int numeroBuscar = scanner.nextInt(); //23
        int contador =0;
        boolean encontrado = false;
        //pedir al usuario el numero buscado
        //el sistema deberá decirme la posición donde está el primer 23 encontrado. En caso de no tener 23 me avisa
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscar);
            System.out.println("La posición del numero buscado es "+i);
            encontrado=true;
        }
        if (!encontrado){
            System.out.println("El numero no se encuentra en la colección");
        }

        /*
        for (int item : numeros){
            if (item == numeroBuscar);
        }
        System.out.println("El numero de veces que esta el numero buscado es: "+contador);

        /*for (int item : numeros){
            System.out.println(item); //salen los numeros aleatorios que he guardado
        } */

       /* //[0,0,0,0,0,0]
        //  0 1 2 3 4 5  --> posiciones

        //saber la longitud del array --> cuantos elementos hay en el array
        int longi = numeros.length;
        System.out.println("El num de elemenos del array " + longi);

        //acceder a uno de los elemenos
        System.out.println("El elemento de la primera posición es " + numeros[0]);
        System.out.println("El elemento de la posicion central es " + numeros[numeros.length / 2]);
        System.out.println("El elemeno de la última posición es " + numeros[5]);

        //modificar elemenso
        numeros[0] = 19;
        numeros[numeros.length - 1] = 30; //es lo mismo que poner numeros[5] = 30;

        //Utilizado para mostrar todos los elementos del array desde una posición incial hasta una final
        //y para modificar el valor de las posiciones
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("El elemento en posición %d es %d%n", i, numeros[i]);
        }
        //mostrar los elementos impares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.printf("Los impares están en posición %d y es %d%n", i, numeros[i]);
            }
        }

        // [19,0,0,0,0,30]
        // Utilizado para recorrer el valor de las posiciones
        int contador = 0;
        for (int item : numeros) {
            System.out.println("El elemento en iteracion es " + item + " en posicion " + contador);
            contador++;
            } */
    }
}
