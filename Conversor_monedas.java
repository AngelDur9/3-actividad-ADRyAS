import java.util.Scanner;

public class Conversor_monedas {

    public static void main(String[] args) {
        
        int dinero;
        String tipo;
        double convercion;

        Scanner cambio = new Scanner(System.in);
        Scanner otro = new Scanner(System.in);

        System.out.println("Dame la cantidad de pesos a convertir: ");
        dinero=cambio.nextInt();

        System.out.println("A que moneda lo vas a cambiar: ");
        tipo=otro.nextLine();
        
        switch (tipo) {
            case "USD":
            convercion=dinero/18.06;
            System.out.println("Los "+dinero+" pesos son "+convercion+" Dolares");
                break;
            case "EUR":
            convercion=dinero/19.68;
            System.out.println("Los "+dinero+" pesos son "+convercion+" Euros");
                break;
            case "THB":
            convercion=dinero/0.5;
            System.out.println("Los "+dinero+" pesos son "+convercion+" Baht tailandés");
                    break;
            case "JPY":
            convercion=dinero/0.11;
            System.out.println("Los "+dinero+" pesos son "+convercion+" Yen");
                    break;
            case "KRW":
            convercion=dinero/0.013;
            System.out.println("Los "+dinero+" pesos son "+convercion+" Won");
                    break;
            case "AUD":
            convercion=dinero/12.08;
            System.out.println("Los "+dinero+" pesos son "+convercion+" Dolar Australeano");
                    break;
            case "PEN":
            convercion=dinero/4.83;
            System.out.println("Los "+dinero+" pesos son "+convercion+" Sol");
                    break;
            case "CAD":
            convercion=dinero/13.12;
            System.out.println("Los "+dinero+" pesos son "+convercion+" Dolar Canadiense");
                    break;
            case "VES":
            convercion=dinero/0.49;
            System.out.println("Los "+dinero+" pesos son "+convercion+" Bolívar");
                    break;
            case "ARS":
            convercion=dinero/0.020;
            System.out.println("Los "+dinero+" pesos son "+convercion+" Peso Argentino");
                    break;
            default:
            System.out.println("La moneda no existe");
        }
        
    }
}
