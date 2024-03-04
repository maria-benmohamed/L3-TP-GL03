package mesClasses;

public class Fiche{
	private String nom;
	private String adresse;
	private int numero;
	public Fiche(int id, String name, String adr){
		this.numero=id;
		this.nom=name;
		this.adresse=adr;
	}
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNom() {
        return nom;
    }
    public String getAdresse() {
        return adresse;
    }

    public int getNumero() {
        return numero;
    }
    public String toString(){
    	return "Fiche No: "+ this.numero + " Nom " + this.nom + " Adresse " +this.adresse;
    }
}
