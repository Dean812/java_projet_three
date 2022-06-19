package classes;

import java.util.List;

public class Bureau {

	private int code;
	private String DeskName;
	private List<Chercheur> chercheur;

	public Bureau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bureau(int code, String deskName, List<Chercheur> chercheur) {
		super();
		this.code = code;
		DeskName = deskName;
		this.chercheur = chercheur;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDeskName() {
		return DeskName;
	}

	public void setDeskName(String deskName) {
		DeskName = deskName;
	}

	public List<Chercheur> getChercheur() {
		return chercheur;
	}

	public void setChercheur(List<Chercheur> chercheur) {
		this.chercheur = chercheur;
	}

	@Override
	public String toString() {
		return "Bureau [code=" + code + ", DeskName=" + DeskName + ", chercheur=" + chercheur + "]";
	}

}
