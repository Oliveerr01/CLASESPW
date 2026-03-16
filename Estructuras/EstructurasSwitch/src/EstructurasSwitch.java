import java.util.Scanner;

public class EstructurasSwitch {
    public void estructuraTradicional() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducemen la nota");
        int nota = scanner.nextInt();
//si la nota es >5 // sino si la nota es <7
        switch (nota) {
            case 1:
                System.out.println("La nota vale 1, has suspendido");
                break;
            case 5:
                System.out.println("Has aprobado raspado");
                break;
            case 8:
                System.out.println("Has aprobado de forma correcta");
                break;
            case 10:
                System.out.println("Lo has cuadrado! Perfecto");
                break;
            default:
                System.out.println("Esta nota no es analizable");
        }
        System.out.println("Terminando de analizar notas");
    }
        public void estructuraLambda () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Indicame tu nombre");
            String nombre = scanner.next();
            String apellido = "";
            switch (nombre) {
                case "Borka" -> {
                    System.out.println("Nombre introducido Borja");
                    apellido = "asd";
                }
                case "Maria" -> {
                    System.out.println("Nombre introducido Maria");
                    apellido = "asd";
                }
                case "Juan" -> {
                    System.out.println("Nombre introducido Juan");
                    apellido = "asd";
                }
                case "Marcos" -> {
                    System.out.println("Nombre introducido Marcos");
                    apellido = "asd";
                }
                default ->{
                System.out.println("Nombre introducido no contemplado");
                apellido = "asd";
                }
            }
        }

        public void estructuraChat () {
        // es vocal o consonante
            char letra = 'a';
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Es vocal");
                    break;
                default:
                    System.out.println("Consonante");
            }
        }

        public void menuOpciones () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor selecciona la opcion a realizar");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Modulo");
            System.out.println("6 - Salir");
            System.out.println("Que quieres hacer");
            int opcion = scanner.nextInt();
            int operando1 = 0, operando2 = 0;
            if (opcion >= 1 && opcion < 6) {
                System.out.println("Introduce operando 1");
                operando1 = scanner.nextInt();
                System.out.println("Introduce operando 2");
                operando2 = scanner.nextInt();
            }
            double resultado = 0;
            switch (opcion) {
                case 1 -> {
                    System.out.println("Vas a sumar");
                    resultado = operando1 + operando2;
                }
                case 2 -> {
                    System.out.println("Vas a restar");
                    resultado = operando1 - operando2;

                }
                case 3 -> {
                    System.out.println("Vas a multiplicar");
                    resultado = operando1 * operando2;

                }
                case 4 -> {
                    System.out.println("Vas a dividir");
                    if (operando2 != 0) {
                        resultado = (double) operando1 / operando2;
                    }

                }
                case 5 -> {
                    System.out.println("Vas a modular");
                    resultado = operando1 % operando2;
                    // switch

                }
                case 6 -> {
                    System.out.println("Saliendo");
                }
                default -> {
                    System.out.println("Opcion no contemplada");
                }
            }
            System.out.println("El resultado obtenido es " + resultado);
        }
    }

