package classes;

public class Chercheur {

	private String nom;
	private String poste;
	private int numPc;

	public Chercheur(String nom, String poste, int numPc) {
		super();
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
		return "Chercheur [nom=" + nom + ", poste=" + poste + ", numPc=" + numPc + "]";
	}

}
