package calculMoyenne;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		int premierNombre;
		
		int secondNombre;

		float moyenne;
		
		Scanner sc;
		
		
		
		sc = new Scanner(System.in);
		
		
		
		System.out.println("Veuillez saisir un premier nombre");
		
		premierNombre = sc.nextInt();
		
		System.out.println("Veuillez saisir un second nombre");
		
		secondNombre = sc.nextInt();
		
		
		moyenne = (premierNombre + secondNombre) / 2F; // F pour préciser que 2 est un float, (alors que c'était un double)
		
		
		System.out.println("La moyenne de " + premierNombre + " et " + secondNombre + " est " + moyenne);
		
		sc.close();

	}

}
