package main;

import classes.Adresse;
import classes.Chercheur;

public class Main {

	public static void main(String[] args) {
		
//		1- Créer une adresse dans la classe Main en utilisant le constructeur C1 .      
//		2- Affecter des valeurs à l’objet adresse créée.
//		3- Afficher l’objet adresse crée. 
		Adresse C1;   // # 1
		C1 = new Adresse ("Jarvis Street"," Toronto",59000); // #2
		System.out.println(C1); //# 3

//		4- Modifier le code postal de cette adresse.
//		5- Afficher l’objet adresse modifié.
		C1.setCodePostal(59160);
		System.out.println(C1);
		
//		6- Créer une adresse dans la classe Main en utilisant le constructeur C2
//		7- Modifier la ville de cette adresse.
//		8- Afficher l’objet adresse modifié.
		Adresse C2 = new Adresse ("Rue Général leclercq", "Sainghin", 59184);
		C2.setVille("Christchurch");
		System.out.println(C2);
		
//		9-10- Créer un Chercheur dans la classe Main en utilisant le même type de constructeur dans la classe Adresse C1.
//		11- Affecter des valeurs à ce chercheur.
//		12- Afficher toutes les informations relatives à ce chercheur.
		Chercheur researcher = new Chercheur("David","Biologiste",22); // # 10-11
		System.out.println(researcher);// # 12
		
//		13- voir class Chercheur
//		14 - afficher le nouveau constructeur 
		Chercheur researcher2 = new Chercheur("Vincent",34);
		
//		15- Afficher le nombre de chercheurs créés.
		System.out.println(researcher2.getNbrChercheur());
		
//		16- Ajouter dans la classe Chercheur la méthode comparer()
		boolean result = researcher.comparer( researcher2);
		if(result == true) {
			System.out.println("Les 2 sont chercheurs identiques");
		}else {
			System.out.println("Les 2 sont chercheurs ne sont pas identiques");
		}
		
//		17- Modifier le numéro de l’ordinateur de l’objet chercheur1
		researcher.setNumPc(77);
		System.out.println(researcher);
		
//		18- Créer un objet chercheur3 sans paramètres
		Chercheur researcher3;
		
//		19- Ajouter un nom, un poste et un numéro de l’ordinateur à l’objet chercheur3
		researcher3 = new Chercheur("Jordan","Laborantin", 36);
		System.out.println(researcher3.getNbrChercheur());
		System.out.println(researcher3);
		

	}

}
