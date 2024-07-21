import java.util.Scanner;
	public class Info_artistas {
    	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu preferencia (artista, película, serie, etc.):");
        System.out.println("1. Elon Musk");
        System.out.println("2. Inception");
        System.out.println("3. Friends");
        System.out.println("4. Ed Sheeran");
        System.out.println("5. Interstellar");

        String preferencia = scanner.nextLine();

        switch (preferencia.toLowerCase()) {
            case "elon musk":
                System.out.println("Elon Musk es un empresario y magnate de los negocios conocido por ser el CEO de SpaceX y Tesla, Inc.");
                break;
            case "inception":
                System.out.println("Inception es una película de ciencia ficción de 2010 dirigida por Christopher Nolan que trata sobre la extracción de información de los 		sueños.");
                break;
            case "friends":
                System.out.println("Friends es una serie de televisión estadounidense creada por David Crane y Marta Kauffman que sigue la vida de seis amigos en Nueva 		York.");
                break;
            case "ed sheeran":
                System.out.println("Ed Sheeran es un cantante y compositor británico conocido por éxitos como 'Shape of You' y 'Perfect'.");
                break;
            case "interstellar":
                System.out.println("Interstellar es una película de ciencia ficción de 2014 dirigida por Christopher Nolan que explora viajes espaciales a través de agujeros 		de gusano.");
                break;
            default:
                System.out.println("No tengo información sobre esa preferencia. Por favor, elige una de las opciones proporcionadas.");
                break;
        }
        scanner.close();
    }
}
