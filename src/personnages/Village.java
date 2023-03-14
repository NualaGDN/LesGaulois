package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Villageois[] Villageois;
	private int nbVillageois = 0;
	
	
	public Village(String nom) {
		this.nom = nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}

}
