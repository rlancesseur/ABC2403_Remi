package nombreSuivant;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int nombreUtilisateur;
		int nombreUtilisateurPlus10;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisir un nombre : ");
		nombreUtilisateur = sc.nextInt();
		
		nombreUtilisateurPlus10 = nombreUtilisateur + 10;
		
		System.out.print("Les 10 nombres après " + nombreUtilisateur + " sont : ");
		
		while (nombreUtilisateur <= nombreUtilisateurPlus10){
			System.out.print(nombreUtilisateur + " ");
			nombreUtilisateur++;
		}
		
		sc.close();
		
	}

}
