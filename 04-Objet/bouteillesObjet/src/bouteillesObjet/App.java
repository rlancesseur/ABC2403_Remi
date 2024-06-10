package bouteillesObjet;

public class App {

	public static void main(String[] args) {
		
		Bouteille bouteille1 = new Bouteille();
		
		Bouteille bouteille2 = new Bouteille(1.2f, 0.8f, false, "h2O");
		
		Bouteille bouteille3 = new Bouteille(bouteille2);
		
		float contenanceEnCLDeBouteille2 = bouteille2.donneContenanceEnCl();

		float contenuEnCLDeBouteille2 = bouteille2.donneContenueEnCL();
		
		boolean ouvrirBouteille = bouteille2.ouvrir();
		
		boolean fermerBouteille = bouteille2.fermer();
		
		boolean bouteilleRempli = bouteille2.laRemplir(0.3f);
		
		boolean viderBouteille = bouteille2.laVider(0.8f);

	}

}
