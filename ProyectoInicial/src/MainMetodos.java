public class MainMetodos {
    
    public static void main(String[] args) {
        System.out.println("Main para probar metodo y variables");
        saludar("Borja");
        saludar("Laura");
        despedir();
    }

    public static void saludar (String data){
        System.out.println("Enhorabuena "+data+" has llamado tu primer metodo");
    }

    public static void despedir(){
        System.out.println("Hasta luego, hemos terminado");
    }
}
