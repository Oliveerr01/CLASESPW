import controller.Operaciones;

public class Main {
    /* public static void main(String[] args) {
         //File fichero = new File("src/main/java/resource/analisis-codigo.txt");
         File carpeta = new File("src/main/java/resources/carpeta1");
        /* //logico o fisico
         System.out.println("Información del fichero");
         System.out.println(fichero.exists());
         if(fichero.exists()){
             System.out.println("Ruta absoluta es: "+fichero.getAbsolutePath());
             System.out.println("Puede escribir: "+fichero.canWrite());
             System.out.println("Tamaño: "+fichero.length());
             System.out.println("Es una carpeta "+fichero.isDirectory());
             System.out.println("Es un fichero "+fichero.isFile());
         }else {
             try {   //createNewFile da un IOException por lo que se hace un try y catch
                 fichero.createNewFile();
                 System.out.println("Fichero creado correctamente");
             } catch (IOException e) {
                 System.out.println("Error en la creación del fichero");
                 System.out.println(e.getMessage()); //es porque en la ruta hemos puesto "resource" y esta mal
                 // solucion -> indica otra ruta para crear el fichero
                 // pongase en contacto con el admin
             }
         }
         if (carpeta.isDirectory()){
             /*for (String item  : carpeta.list()) {
                 System.out.println(item);

             for(File item :carpeta.listFiles()){
                 System.out.println(item.getName());
                 System.out.println(item.isDirectory());
                 //scar los ficheros e una subcarpeta
                 if(item.isDirectory()){
                     for (File data: item.listFiles()) {
                         System.out.println("\t"+data.getName());
                         if(data.isDirectory()) {
                             for (File data1 : data.listFiles()) {
                                 System.out.println("\t\t" + data1.getName());
                             }
                         }
                     }
                 }
             }
         }

     }*/
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        //operaciones.leerFichero("src/main/java/resources");
        //operaciones.leerContenidoFichero("src/main/java/resources/analisis.txt");
        //operaciones.leerContenidoFicheroLineas("src/main/java/resources/analisis.txt");
        //operaciones.descifrarContenido("src/main/java/resources/escritura.txt");
        //operaciones.escrituraFichero("src/main/java/resources/escritura.txt");
        //operaciones.escrituraSalto("src/main/java/resources/carpeta1/subcarpeta/ejemplo_salto.txt");
        //operaciones.escribirObjeto("src/main/java/resources/objetos.dat");
        operaciones.lecturaObjeto("src/main/java/resources/objetos.dat");
    }
}
