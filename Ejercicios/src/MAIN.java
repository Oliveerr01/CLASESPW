import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos estudiantes hay?");
        int numestudiantes = scanner.nextInt();
        int estudiante=1;
        int nota;
        while (estudiante<=numestudiantes){
            System.out.println("Introduce nota estudiante "+estudiante+" (0-10)");
            nota = scanner.nextInt();
            estudiante++;
        }
        System.out.println("---REPORTE CALIFICACIONES---");
        for (int i = 1; i <=numestudiantes; i++) {
            System.out.println("Estudiante "+i+nota+" puntos");
            
        }
    }
}