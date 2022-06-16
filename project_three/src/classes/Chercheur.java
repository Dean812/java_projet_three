package classes;

public class Chercheur {

	private int id;   //#15
	private String nom;
	private String poste;
	private int numPc;
	private static int nbrChercheur; //#15

	// 13 - 2eme constructeur parametré 
	public Chercheur(String nom, int numPc) {
		super();
		this.id = nbrChercheur++; //#15
		this.nom = nom;
		this.poste = poste;
		this.numPc = numPc;
	}

	public Chercheur(String nom, String poste, int numPc) {
		super();
		this.id = nbrChercheur++; //#15 + maj accesseur + toString
		this.nom = nom;
		this.poste = poste;
		this.numPc = numPc;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getNbrChercheur() {
		return nbrChercheur;
	}

	public static void setNbrChercheur(int nbrChercheur) {
		Chercheur.nbrChercheur = nbrChercheur;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public int getNumPc() {
		return numPc;
	}

	public void setNumPc(int numPc) {
		this.numPc = numPc;

	}

	@Override
	public String toString() {
		return "Chercheur [id=" + id + ", nom=" + nom + ", poste=" + poste + ", numPc=" + numPc + "]";
	}

}
