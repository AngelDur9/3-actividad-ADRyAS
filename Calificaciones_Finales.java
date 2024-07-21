import java.util.Scanner;

public class Calificaciones_Finales {
    
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
        System.out.println("Tu calificación final es: "+calificacion);
    }
}
