package sommeValeursTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		float sommeValeurs = 0;
		Scanner sc = new Scanner(System.in);
		
		float tableau[] = new float[10]; 
		
		System.out.println("Saisissez 10 nombres réels : ");
		for (int i = 0; i < 10; i++)
		{
			tableau[i] = sc.nextFloat();
		}
		
		sommeValeurs = App.somme(sommeValeurs, tableau);
		
		System.out.print("La somme des valeurs du tableau est de " + sommeValeurs);
		
		sc.close();

	}

	public static float somme(float sommeValeurs, float tableau[]) {
		
		for (int i = 0; i < 10; i++)
		{
			sommeValeurs += tableau[i];
		}
		
		return sommeValeurs;
	}
	
}
