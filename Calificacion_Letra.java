import java.util.Scanner;

public class Calificacion_Letra {
    
    public static void main(String[] args) {
        int parciales, proyecto, examen;
        double calificacion;

        Scanner datos = new Scanner(System.in);

        System.out.println("Dame tu calificación Final del Parcial:"+" ");
        parciales=datos.nextInt();

        System.out.println("Dame tu calificación del examen:"+" ");
        examen=datos.nextInt();

        System.out.println("Dame la calificación del proyecto:"+" ");
        proyecto=datos.nextInt();

        calificacion = (parciales*.40)+(proyecto*.30)+(examen*.30);
        
        if(calificacion>=90 && calificacion<=100) {
            System.out.println("tu calificacion es de rango A");
        } else if(calificacion>=80 && calificacion<=89) {
            System.out.println("tu calificacion es de rango B");
        } else if(calificacion>=70 && calificacion<=79) {
            System.out.println("tu calificacion es de rango C");
        } else if(calificacion>=60 && calificacion<=69) {
            System.out.println("tu calificacion es de rango D");
        } else if(calificacion<=59) {
            System.out.println("tu calificacion es de rango F");
        } else {
            System.out.println("Tu calificacion no existe");
        }
    }
}