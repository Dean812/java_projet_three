package classes;

import java.util.List;

public class Laboratoire {

	private String nomLab;
	private String specialite;
	private Adresse adresse;
	private List<Bureau> bureaux;

	public Laboratoire(String nomLab, String specialite, Adresse adresse, List<Bureau> bureaux) {
		super();
		this.nomLab = nomLab;
		this.specialite = specialite;    // # 21
		this.adresse = adresse;
		this.bureaux = bureaux;
	}

	public String getNomLab() {
		return nomLab;
	}

	public void setNomLab(String nomLab) {
		this.nomLab = nomLab;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<Bureau> getBureaux() {
		return bureaux;
	}

	public void setBureaux(List<Bureau> bureaux) {
		this.bureaux = bureaux;
	}

	@Override
	public String toString() {
		return "Laboratoire [nomLab=" + nomLab + ", specialite=" + specialite + ", adresse=" + adresse + ", bureaux="
				+ bureaux + "]";
	}

}
