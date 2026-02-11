public class Main {

    //esto es un comentario
    /*
    este comentario se puede dividir
    en varias
    lineas de código
     */

    //TODO me falta esto

    int edadGlobal = 12;

    public static void main(String[] args){
        System.out.println("Este es mi primer programa en Java");

        String miNombre = "Oliver"; //null

        Character letracompleja = 'A';
        char letraDni = 'G';          //char, int, double, float boolean son variable sprimitivas
        Integer edadCompleja = 25;    //Character, Integer, Double... son variables complejas
        int edad = 23;

        final String DNI = "48165063G";
        Double alturaCompleja = 1.54;
        double altura = 1.69;
        Float pesoComplejo = 79.3f;
        float peso = 74.4f;
        Boolean experienciaCompleja = false;
        boolean experiencia = true;

        letraDni = 'g';
        miNombre="Oliver Gonzales";
        altura = 1.71;
        peso = 69.6f;
        experiencia = false;

        System.out.println("Mi nombre es:"+miNombre);
        System.out.println("La letra de mi DNI es:"+letraDni);
        System.out.println("Mi edad es:"+edad+"años");
        System.out.println("Mi altura es:"+altura);
        System.out.println("Mi peso es:"+peso);
        System.out.println("Mi experiencia es:"+experiencia);
        System.out.println("Mi DNI es:"+DNI);
        System.out.println("El valor numero PI es"+Math.PI);
        System.out.println("El valor numero PI es"+Math.E);
        System.out.println("El valor maximo de un int es:"+Integer.MAX_VALUE);
        System.out.println("El valor minimo de un int es:"+Integer.MIN_VALUE);


    }
    public void nombreMeotodo (){
        int edadMetodo = 123;
        System.out.println(edadMetodo);
        System.out.println(edadGlobal);

    }
}
