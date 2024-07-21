import java.util.Scanner;

public class Grados_Celcius {
    public static void main(String[] args) {
        
        Scanner T = new Scanner(System.in);
         
        double celsius;

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        celsius = T.nextDouble();
        
        System.out.println("Selecciona una opción para convertir la temperatura:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        
        int opcion = T.nextInt();
        
        switch (opcion) {
            case 1:
                double fahrenheit = (celsius * 9/5) + 32;;
                System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
                break;
            case 2:
                double kelvin = celsius + 273.15;;
                System.out.println("La temperatura en Kelvin es: " + kelvin);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        
    }
}
