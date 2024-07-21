import java.util.Scanner;
public class Estacion_del_Año {
    public static void main(String[] args) {
        int mes;
        Scanner fecha = new Scanner(System.in);
        System.out.println("Dime el numero de mes en el que estamos:"+" ");
        mes=fecha.nextInt();
        switch (mes) {
            case 1:
            System.out.println("El mes es Enero y su estación es el invierno");
                break;
            case 2:
            System.out.println("El mes es Febrero y su estación es el invierno");
                break;
            case 3:
            System.out.println("El mes es Marzo y su estación es la primavera");
                    break;
            case 4:
            System.out.println("El mes es Abril y su estación es la primavera");
                    break;
            case 5:
            System.out.println("El mes es Mayo y su estación es la primavera");
                    break;
            case 6:
            System.out.println("El mes es Junio y su estación es el verano");
                    break;
            case 7:
            System.out.println("El mes es Julio y su estación es es el verano");
                    break;
            case 8:
            System.out.println("El mes es Agosto y su estación es es el verano");
                    break;
            case 9:
            System.out.println("El mes es Septiembre y su estación es el otoño");
                    break;
            case 10:
            System.out.println("El mes es Octubre y su estación es el otoño");
                    break;
            case 11:
            System.out.println("El mes es Noviembre y su estación es el otoño");
                    break;
            case 12:
            System.out.println("El mes es Diciembre y su estación es el invierno");
                    break;
            default:
            System.out.println("El mes no existe");
        }
    }
}
