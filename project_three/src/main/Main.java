package main;

import classes.Adresse;

public class Main {

	public static void main(String[] args) {
		
//		1- Cr�er une adresse dans la classe Main en utilisant le constructeur C1 .      
//		2- Affecter des valeurs � l�objet adresse cr��e.
//		3- Afficher l�objet adresse cr�e. 
		Adresse C1;   // # 1
		C1 = new Adresse ("Jarvis Street"," Toronto",59000); // #2
		System.out.println(C1);

//		4- Modifier le code postal de cette adresse.
//		5- Afficher l�objet adresse modifi�.
		C1.setCodePostal(59160);
		System.out.println(C1);
		
//		6- Cr�er une adresse dans la classe Main en utilisant le constructeur C2
//		7- Modifier la ville de cette adresse.
//		8- Afficher l�objet adresse modifi�.
		Adresse C2 = new Adresse ("Rue G�n�ral leclercq", "Sainghin", 59184);
		C2.setVille("Christchurch");
		System.out.println(C2);
		
	}

}
