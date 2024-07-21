import java.util.Scanner;

public class Edad_para_Votar {

	public static void main (String[]args)
  {
	int Edad;

	Scanner T = new Scanner (System.in);

	  System.out.println ("Ingrese edad:");
	  Edad = T.nextInt ();

	if (Edad >= 0 && Edad < 18)
	  {
		System.out.println ("No puedes votar");
	  }
	else
	  {
		System.out.println ("Puedes votar");
	  }
  }
} 