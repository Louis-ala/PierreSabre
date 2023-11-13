package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("(" + this.nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson);
	}
	
	public void boire() {
		parler(
				"Mmm, un bon verre de " + this.boisson + "! GLOUPS!");
	}
	
	public void acheter(String bien, int prix) {
		if( this.argent >= prix) {
			parler("J'ai " + this.argent + " sous en poche! " + " . Je vais pouvoir m'offrir un(e) " + bien + " � " + prix + " sous. ");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux meme pas m'offrir un(e) " + bien + " � " + prix + " sous. ");
		}
	}
	
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	public void perdreArgent(int gain) {
		this.argent -= gain;
	}
}