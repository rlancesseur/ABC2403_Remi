package exoFonctions2;

public class App {

	/**
	 * Programme principal. 
	 * *** NE PAS MODIFIER LE CODE DE LA METHODE main() ***
	 * *** NE PAS MODIFIER LE CODE DE LA METHODE main() ***
	 * *** NE PAS MODIFIER LE CODE DE LA METHODE main() ***
	 * *** NE PAS MODIFIER LE CODE DE LA METHODE main() ***
	 * *** NE PAS MODIFIER LE CODE DE LA METHODE main() ***
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		// Ecrire une FONCTION "getMC2" qui RETOURNE le nom de l'inventeur de la formule "E = MC²"
		
		String mc2;
		
		mc2 = App.getMC2();
		
		System.out.println(mc2); // Affiche "Einstein"
		
		
		
		// Ecrire une fonction "getFullName" qui accepte 2 arguments (prénom et nom) de type String.
		// Cette fonction RETOURNE la concaténation des 2 valeurs séparées par un espace
		// Le nom doit apparaitre en Majuscule.
		
		String fullName;
		
		fullName = App.getFullName("Mickaël", "Devoldère");
		
		System.out.println(fullName); // Affiche "Mickaël DEVOLDÈRE"
				
		
		
		/*
		 * Créer une fonction « askUser() » acceptant deux arguments (nom et prénom) de type string.  
		 * Cette fonction doit retourner une chaîne de caractères sous la forme : 
		 * 		« Bonjour prénom NOM. Connaissez-vous Einstein ? » 
		 * Cette fonction doit OBLIGATOIREMENT réutiliser les fonctions :
		 * 		« getFullName() » pour obtenir la concaténation des deux valeurs. 
		 * 		« getMC2() » pour obtenir le nom de l'inventeur de la formule E = MC². 
		*/
		
		String sentence = App.askUser("Devoldère", "Mickaël");
		
		System.out.println(sentence); // Affiche "Bonjour Mickaël DEVOLDÈRE, connaissez-vous Einstein ?"
		
		
		
		// Une fois toutes les fonctions implémentées, le programme doit afficher dans cet ordre :
		// Einstein
		// Mickaël DEVOLDÈRE
		// Bonjour Mickaël DEVOLDÈRE, connaissez-vous Einstein ? 

	}

	/**
	 * Fonction qui retourne "Einstein"
	 * @return
	 */
	
	public static String getMC2() {
		return "Einstein";
		
	}
	
	/**
	 * Fonction qui retourne la phrase "prenom + " " + nom.toUpperCase()
	 * @param prenom Contient le prénom
	 * @param nom Contient le nom
	 * @return
	 */
	public static String getFullName(String prenom, String nom) {
		
		return prenom + " " + nom.toUpperCase();
		
	}
	
	/**
	 * Foction qui retourne la phrase "Bonjour " + fullName + ". Connaissez-vous " + genie
	 * @param prenom Contient le prénom
	 * @param nom Contient le nom
	 * @return
	 */
	public static String askUser(String nom, String prenom) {
		
		String genius = App.getMC2();
		
		String fullName = App.getFullName(nom, prenom);
		
		return "Bonjour " + fullName + ". Connaissez-vous " + genius + " ?";
		
	}
	
	
}
