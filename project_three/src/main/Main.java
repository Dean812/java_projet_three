package main;

import java.util.ArrayList;
import java.util.List;

import classes.Adresse;
import classes.Bureau;
import classes.Chercheur;
import classes.Laboratoire;

public class Main {

	public static void main(String[] args) {

//		1- Créer une adresse dans la classe Main en utilisant le constructeur C1 .      
//		2- Affecter des valeurs à l’objet adresse créée.
//		3- Afficher l’objet adresse crée. 
		Adresse C1; // # 1
		C1 = new Adresse("Jarvis Street", " Toronto", 59000); // #2
		System.out.println(C1); // # 3

//		4- Modifier le code postal de cette adresse.
//		5- Afficher l’objet adresse modifié.
		C1.setCodePostal(59160);
		System.out.println(C1);

//		6- Créer une adresse dans la classe Main en utilisant le constructeur C2
//		7- Modifier la ville de cette adresse.
//		8- Afficher l’objet adresse modifié.
		Adresse C2 = new Adresse("Rue Général leclercq", "Sainghin", 59184);
		C2.setVille("Christchurch");
		System.out.println(C2);

//		9-10- Créer un Chercheur dans la classe Main en utilisant le même type de constructeur dans la classe Adresse C1.
//		11- Affecter des valeurs à ce chercheur.
//		12- Afficher toutes les informations relatives à ce chercheur.
		Chercheur researcher = new Chercheur("David", "Biologiste", 22); // # 10-11
		System.out.println(researcher);// # 12

//		13- voir class Chercheur
//		14 - afficher le nouveau constructeur 
		Chercheur researcher2 = new Chercheur("Vincent", 34);

//		15- Afficher le nombre de chercheurs créés.
		System.out.println(researcher2.getNbrChercheur());

//		16- Ajouter dans la classe Chercheur la méthode comparer()
		boolean result = researcher.comparer(researcher2);
		if (result == true) {
			System.out.println("Les 2 sont chercheurs identiques");
		} else {
			System.out.println("Les 2 sont chercheurs ne sont pas identiques");
		}

//		17- Modifier le numéro de l’ordinateur de l’objet chercheur1
		researcher.setNumPc(77);
		System.out.println(researcher);

//		18- Créer un objet chercheur3 sans paramètres
		Chercheur researcher3 = new Chercheur();

//		19- Ajouter un nom, un poste et un numéro de l’ordinateur à l’objet chercheur3
//		researcher3 = new Chercheur("Jordan","Laborantin", 36); << pas cette version
		researcher3.afficher("Jordan", "Laborantin", 36);
		System.out.println(researcher3.getNbrChercheur());
		System.out.println(researcher3);System.out.println();

//		20- Créer deux Bureaux bureau1 et bureau2,     #20.1
//		chaque bureau contient une collection de 3 chercheurs  #20.2
		
		List<Chercheur> listeChercheur = new ArrayList();  // 20.2
		listeChercheur.add(researcher);
		listeChercheur.add(researcher2);
		listeChercheur.add(researcher3);
		
//		for (Chercheur dl : listeChercheur) {
//			System.out.println(dl);
//		}      -- test boucle pour lire l'array
		
		List<Chercheur> listeChercheur2 = new ArrayList();  // meme chercheur différent ordre
		listeChercheur2.add(researcher2);
		listeChercheur2.add(researcher3);
		listeChercheur2.add(researcher);
		
		Bureau bureau1 = new Bureau(123, "LabDesk",listeChercheur); // #20.1
		Bureau bureau2 = new Bureau(857, "starkDesk",listeChercheur2); 
		System.out.println("Affichage de bureau 1 : " + bureau1); // test > ok 
		System.out.println();
		
//		21- Créer un Laboratoire laboratoire1 qui contient une collection de deux bureaux.
		
		List<Bureau> listBureau = new ArrayList(); // collection de 2 bureau
		listBureau.add(bureau1);
		listBureau.add(bureau2);
		
		Laboratoire laboratoire1 = new Laboratoire("StarLab", "Nanotech", C2, listBureau);
		
//		22- Afficher les caractéristiques de l’objet laboratoire1.
		System.out.println("Affichage de laboratoire 1 : " + laboratoire1);
		
	}

}
