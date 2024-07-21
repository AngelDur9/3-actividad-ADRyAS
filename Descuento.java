import java.util.Scanner;

public class Descuento{
    public static void main(String[] args) {
        Scanner T = new Scanner (System.in);
        double PrecioFinal, Descuento, PrecioOriginal;
        System.out.println("Ingresa el precio original");
        PrecioOriginal=T.nextDouble();

        if(PrecioOriginal<=100){
            Descuento=0;
            System.out.println("El descuento es de "+Descuento);
        }else if (PrecioOriginal>100 && PrecioOriginal<=200) {
            Descuento=(PrecioOriginal*0.10);
            System.out.println("El decuento es de "+Descuento);
        }else if(PrecioOriginal>200 && PrecioOriginal<=500){
            Descuento=(PrecioOriginal*0.20);
            System.out.println("El decuento es de "+Descuento); 
        }else if(PrecioOriginal>500){
            Descuento=(PrecioOriginal*0.25);
            System.out.println("El decuento es de "+Descuento);
        }
    }
}