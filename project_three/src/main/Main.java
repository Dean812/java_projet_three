package main;

import classes.Adresse;

public class Main {

	public static void main(String[] args) {
		
//		1- Créer une adresse dans la classe Main en utilisant le constructeur C1 .      
//		2- Affecter des valeurs à l’objet adresse créée.
//		3- Afficher l’objet adresse crée. 
		
		Adresse C1;   // # 1
		C1 = new Adresse ("Jarvis Street"," Toronto",59184); // #2
		System.out.println(C1);

	}

}
