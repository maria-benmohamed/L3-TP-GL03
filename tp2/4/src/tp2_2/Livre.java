package tp2_2;

public class Livre {
	private String titre , auteur;
	private int nbPages;
	private double prix;
	
	public Livre ( String titre, String auteur, int nbPages, double prix) { 
		this.titre = titre;
		this.auteur = auteur;
		this.nbPages = nbPages; 
		this.prix = prix;
	}
}
