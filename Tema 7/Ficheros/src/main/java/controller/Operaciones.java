package controller;

import model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operaciones {

    public void leerFichero(String path) {
        File file = new File(path);
        System.out.println(file.getName());
        if (file.isDirectory()) {
            for (File item : file.listFiles()) {
                leerFichero(item.getAbsolutePath());
            }
        }

    }

    public void leerContenidoFichero(String path){
        //convertir el ficher en lectura -> File en FileReader
        File file = new File(path);  //se crea un objeto File/ el fichero y con la ruta del archivo (path)
        FileReader fileReader = null; //se inicializa el lector a null

        try {
            fileReader = new FileReader(file);  //el fichero creado lo pasamos a lectura
            int codigo;  //se crea variable int porque lo que da el FileReader.read() es un numero ASCII o -1 si termina
            while ((codigo = fileReader.read()) != -1) { //mientras haya caracteres por leer (read() !=1
                System.out.print(codigo);                // imprime el numero
                System.out.print(" - ");
                System.out.println((char) codigo);       //se convierte en letra
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero que intentas leer no existe");
        } catch (IOException e) {
            System.out.println("No cuentas con los permisos suficentes");
            System.out.println("Ponte en contacto con tu adminsitrador");
        } finally {
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

    public void leerContenidoFicheroLineas (String path){
        //File --> FileReader --> BufferedReader
        File file = new File(path); //se crea el fichero con la ruta/path que le damos
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file); //se pone el fichero/file en modo lectura
            bufferedReader = new BufferedReader(fileReader); //se pone el fichero en modo lectura recurrente
            String linea;
            while ((linea= bufferedReader.readLine()) !=null){ //lee la 1a linea y la guarda en la variable linea
                System.out.println(linea);                     // mientras que no sea null sigue mostrando las linea
            }
        } catch (FileNotFoundException e) {
            System.out.println("La ruta es incorrecta");
        } catch (IOException e) {
            System.out.println("No cuentras con los permisos suficientes");
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }
    }

    public void descifrarContenido(String path) {
        File file = new File(path);
        BufferedReader reader = null;
        Scanner scanner = new Scanner(System.in);
        try {
            reader = new BufferedReader(new FileReader(file));
            System.out.println("Dime cual es la clave de cifrado");
            int clave = scanner.nextInt();
            String linea = reader.readLine();
            String[] numeros = linea.split(" ");
            for (String item : numeros) {
                int codigo = Integer.parseInt(item);
                System.out.print((char) (codigo / clave));
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no es valido");
        } catch (IOException e) {
            System.out.println("Error en la lectura del fichero, sin permisos");
        } finally {
            try {
                reader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }


    public void escrituraFichero(String path) {
        File file = new File(path);
        FileWriter fileWriter = null;
        Scanner scanner = new Scanner(System.in);
        try {
            fileWriter = new FileWriter(file, true);
            System.out.println("Dime como quieres cifrar el mensaje");
            int clave = scanner.nextInt();
            scanner = new Scanner(System.in);
            System.out.println("Dime que quieres guardar en el fichero");
            String mensaje = scanner.nextLine();

            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                int codigo = (int) letra;
                fileWriter.write(String.valueOf(codigo * clave));
                fileWriter.write(" ");
            }

        } catch (IOException e) {
            System.out.println("error en la escritura del fichero");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void escrituraSalto(String path) {
        File file = new File(path);
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        // BufferedWriter bufferedWriter;
        try {
            printWriter = new PrintWriter(new FileWriter(file));
            printWriter.println("1Me imprime la linea dentro del fichero y luego salto de linea");
            printWriter.println("2Me imprime la linea dentro del fichero y luego salto de linea");
            printWriter.println("3Me imprime la linea dentro del fichero y luego salto de linea");
            printWriter.println("4Me imprime la linea dentro del fichero y luego salto de linea");
        } catch (IOException e) {
            System.out.println("Fallo en el proceso de escritura");
        } finally {
            try {
                printWriter.close();
            } catch (Exception e) {
                System.out.printf("Fallo en el proceso de cerrado con error %s", e.getMessage());
            }
        }
    }

    public void exportarUsuario(Usuario usuario) {
        // me das un usuario y lo escribo en la ruta de exportacion
        File file = new File("src/main/java/resources/usuarios.csv");
        PrintWriter printWriter = null;
        // el fichero no esta
        // lo creas y escribes una linea

        // el fichero si esta
        // escribe el usuario
        try {
            if (!file.exists()) {
                file.createNewFile();
                printWriter = new PrintWriter(new FileWriter(file, true));
                printWriter.println("nombre,apellido,dni");
                // escribe el usuario //TODO el primero si no existe????
                exportarUsuario(usuario);
            } else {
                printWriter = new PrintWriter(new FileWriter(file, true));
                printWriter.println(usuario);
            }
        } catch (IOException e) {
            System.out.println("Error en la creacion del fichero");
        } finally {
            try {
                printWriter.close();
            } catch (Exception e) {
                System.out.println("Fallo en el cerrado");
                System.out.println(e.getMessage());
            }

        }


    }

    public List<Usuario> importarUsuarios() {
        File file = new File("src/main/java/resources/usuarios.csv");
        BufferedReader reader = null;
        List<Usuario> lista = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(file));
            String linea = reader.readLine();
            while ((linea = reader.readLine()) != null) {
                String[] items = linea.split(","); // quiero pasarla a -> split -> usuario
                Usuario usuario = new Usuario(items[0], items[1], items[2]);
                lista.add(usuario);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ruta incorrecta");
            // dime otra ruta importarUsuarios(string)
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        }

        return lista;
    }

    public void escribirObjeto(String path) {
        File file = new File(path);
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            // objectOutputStream.write(76);
            ArrayList<Usuario> lista = new ArrayList<>();
            lista.add(new Usuario("Usuario1", "Apellido1", "123A"));
            lista.add(new Usuario("Usuario2", "Apellido2", "223A"));
            lista.add(new Usuario("Usuario3", "Apellido3", "323A"));
            lista.add(new Usuario("Usuario4", "Apellido4", "423A"));
            lista.add(new Usuario("Usuario5", "Apellido5", "523A"));
            objectOutputStream.writeObject(lista);


        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero");
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void lecturaObjeto(String path) {
        File file = new File(path);
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            List<Usuario> lista = (List<Usuario>) objectInputStream.readObject();
            lista.forEach(Usuario::mostrarDatos);
        } catch (IOException e) {
            System.out.println("Fichero no encontrado");
            // nueva ruta lecturaObjeto(path)
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada para la traduccion");
        } catch (ClassCastException e){
            System.out.println("Tipos incompatibles");
        }
    }
} 
