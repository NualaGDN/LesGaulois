package histoire;

public class Scenario {

	public static void main(String[] args) {
		personnages.Gaulois asterix = new personnages.Gaulois("Ast�rix", 8);
		personnages.Romain minus = new personnages.Romain("Minus", 6);
		personnages.Gaulois obelix = new personnages.Gaulois("Ob�lix", 10);
		personnages.Druide panoramix = new personnages.Druide("Panoramix", 5, 10);
		
		panoramix.parler("Je vais aller pr�parer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("Un GAU... UN GAUGAU...");
		asterix.frapper(minus);



	}

}
