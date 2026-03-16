import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("----EJERCICIOS----");
        System.out.println( "1. Flexiones");
        System.out.println("2. Abdominales");
        System.out.println("3. Sentadillas");

        System.out.println("Elige un ejercicio (1-3): ");
        int ejercicio = lectorTeclado.nextInt();
        System.out.println("Cuantas repeticiones?");
        int repes = lectorTeclado.nextInt();

        String nejercicio = "";
        switch (ejercicio){
            case 1:
                nejercicio="Flexiones";
                break;
            case 2:
                nejercicio="Abdominales";
                break;
            case 3:
                nejercicio="Sentadillas";
                break;
            default:
                System.out.println("Elige un ejercicio válido");
        }
        System.out.println("Has elegido "+nejercicio);
        for (int i=1; i<=repes; i++){
            System.out.println("Repetición "+i+" completada");
        }
        System.out.println("Ejercicio completado. Has hecho "+repes+" "+nejercicio);
        lectorTeclado.close();
    }


}