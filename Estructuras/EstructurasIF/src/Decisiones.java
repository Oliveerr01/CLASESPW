public class Decisiones {
    public void estructurasIF (int nota){
        System.out.println("Vamos a realizar la estructura IF");
        if (nota >=5){
            System.out.println("El examen está aprobado");
        } else {
            System.out.println("El examen está suspenso");
        }
        System.out.println("Terminando evaluación");
    }

    public void estructurasElseif (double nota){
        //0 -> desasotroso
        //1-3.99 -> mal
        //4-4.99 -> raspado
        //5-7.99 -> bien
        //8-8.99 -> notable
        //9-9.99 -> sobresaliente
        //10 -> matricula
        System.out.println("Iniciando la evaluación del examen");
        if (nota>=0 && nota<=10){
            if(nota<1){
                System.out.println("Desasotroso");
            } else if (nota<4) {
                System.out.println("Mal");
            } else if (nota<5) {
                System.out.println("Raspado");
            } else if (nota<8) {
                System.out.println("Bien");
            } else if (nota<9) {
                System.out.println("Notable");
            } else if (nota<10) {
                System.out.println("Sobresaliente");
            } else{
                System.out.println("De Matrícula");
            }
            System.out.println("Finalizando la evaluación");
        } else {
            System.out.println("Rango incorrecto");
        }

    }
}
