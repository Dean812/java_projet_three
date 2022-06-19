package classes;

public class Chercheur {
	
	private String nom;
	private String poste;
	private int id; // #15
	private int numPc;
	private int count;
	private static int nbrChercheur; // #15

	
	
	public Chercheur() {
		super();
		this.id = nbrChercheur++; // #18
	}

	// 13 - 2eme constructeur parametré
	public Chercheur(String nom, int numPc) {
		super();
		this.id = nbrChercheur++; // #15
		this.nom = nom;
		this.poste = poste;
		this.numPc = numPc;
	}

	public Chercheur(String nom, String poste, int numPc) {
		super();
		this.id = nbrChercheur++; // #15 + maj accesseur + toString
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

//  Pas besoin de setter, tout ce fait dans le constructeur et on affiche avec get
//	public static void setNbrChercheur(int nbrChercheur) {  // # 15
//		Chercheur.nbrChercheur = nbrChercheur;
//	}

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

	public boolean comparer(Chercheur x) {   // # 16 
		if(this.count == x.count && this.nom == x.nom && this.poste == x.poste && this.numPc == x.numPc) {
			return true;
		}
		return false;
	}
	
	public void afficher(String nom, String poste, int numPc) {
		this.nom = nom;
		this.poste = poste;
		this.numPc = numPc;
	}
	
}
