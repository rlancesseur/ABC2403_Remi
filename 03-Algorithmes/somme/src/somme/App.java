package somme;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombreUtilisateur;
		int i = 1;
		int somme = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nombreUtilisateur = sc.nextInt();
		
		while (i <= nombreUtilisateur)
		{
			somme += i;
			i++;
		}
		
		System.out.println("La somme des nombres jusqu'à " + nombreUtilisateur + " est : " + somme);
		
		sc.close();
		
	}

}
