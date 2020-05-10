package MonPackage;

public class Distances_Interville 
{

	public static void main(String[] args) 
	{
		// Saisie des distances des villes dans une matrice.
		
		int Mat[][] = {{0,996,723,890,1286,305,564,245,1026,884}, 
					  {996,0,750,104,286,711,576,747,505,543},
				      {723,750,0,668,979,593,224,515,524,905},
				      {890,104,668,0,316,607,472,645,434,467},
			          {1286,286,979,316,0,890,769,938,750,400},
				      {305,711,597,607,890,0,386,106,832,559},
				      {564,576,224,472,769,386,0,348,447,681},
				      {245,747,515,645,938,106,348,0,447,681},
				      {1026,505,524,434,750,832,447,799,0,901},
			      	  {884,543,905,467,400,559,681,665,901,0}};
		
		// Saisie des villes dans un vecteur 
		
		String Ville [] = {"Brest", "Grenoble", "Lille","Lyon","Marseille",
					      "Nantes","Paris","Rennes","Strasbourg","Toulouse"};
		
		
		/* Déclaration des variables "Sortie" et "Reessayer" afin de permettre à l'utilisateur
		de choisir de recommencer ou pas après la fin de l'algorithme */ 
		 
		boolean Sortie = false;
		String Reessayer;
		
		// Tant que la variable booléenne n'est pas égale à "true" alors on ne sort pas de la boucle "Tant que"
		while (Sortie != true)		
		{	
			// Affichage des règles 
			
			System.out.println("Bienvenue dans l'application: 'Distance entre les deux villes' \n "
					+ "Voici les règles de l'application :\n"
					+ "- Il s'agit d'un système qui permet à l'utilisateur de savoir la distance des deux villes. \n"
					+ "- L'utilisateur doit dans un premier temps saisir la ville de départ et ensuite la ville d'arrivée. \n"
					+ "- Le système va donc sortir une valeur en nombre qui sera la distance des deux villes. \n"
					+ "- Pour se faire, l'utilisateur doit saisir une ville présente dans la liste préenregistrée.\n"
					+ "- De plus, l'utilisateur doit aussi saisir la ville avec "
					+ " la première lettre en majuscule sous peine de recommencer la saisie.");
			
			System.out.println();
			
			System.out.println("Voici les villes disponibles : \n"
								+"Brest \n"
								+"Grenoble \n"
								+"Lille \n"
								+"Lyon \n"
								+"Marseille \n"
								+"Nantes \n"
								+"Paris \n"
								+"Rennes \n"
								+"Strasbourg \n"
								+"Toulouse \n");
			
			/* Déclaration des variables "VilleDepart" et "VilleArrivee" pour que l'utilisateur arrive 
			à saisir la ville de départ et la ville d'arrivée */
			
			String VilleDepart, VilleArrivee;
			
			// Saisie de l'utilisateur de la ville de départ
		
			VilleDepart = Saisie.lire_String("Veuillez saisir votre ville de départ avec la première lettre en majuscule !");
			
			/* Déclaration de la variable "VilleValide" pour vérifier que l'utilisateur saisisse la bonne ville présente 
		    dans le vecteur "Ville" et aussi en écrivant avec la première lettre en majuscule */
		
			boolean VilleValide;
			VilleValide = false;
			
			// Tant que la variable booléenne n'est pas égale à "true" alors on ne sort pas de la boucle "Tant que"
			
			while (VilleValide != true)
			{	
				// La boucle "Pour" va tourner en boucle jusqu'à la longueur du vecteur "Ville"
				for (int a=0; a<Ville.length;a++)
				{	
					/* La variable "VilleDepart" qui a été saisi par l'utilisateur va être comparé 
					par toutes les villes présentes dans le vecteur "Ville" */
					
					if(VilleDepart.equals(Ville[a]))
					{	
						/* Si la variable "VilleDepart" est identique à l'une à des villes présentes dans le vecteur "Ville"
						alors la variable "VilleValide" va être égale à "true" et sortir de la boucle "Tant que" */
						
						VilleValide = true;
						
					}
					
				}
				
				/* Si l'utilisateur n'a pas saisi la ville présente dans le système
				ou bien s'il n'a pas saisi la ville avec la première lettre en majuscule
				alors l'ordinateur lui redemande de saisir la ville de départ */
				
				if (VilleValide == false) VilleDepart = Saisie.lire_String("Erreur, vous n'avez pas saisi la ville présente dans le système,"
				+ " ou bien vous n'avez pas saisi la ville avec la première lettre en majuscule. Veuillez recommencer !");
				
				
			}
	
			// Saisie de l'utilisateur de la ville d'arrivée
			
			VilleArrivee = Saisie.lire_String("Veuillez saisir votre ville d'arrivée avec la première lettre en majuscule !");

			
			/* Déclaration de la variable "VilleValide2" pour vérifier que l'utilisateur saisisse la bonne ville présente 
		    dans le vecteur "Ville" et aussi en écrivant avec la première lettre en majuscule */
			
			boolean VilleValide2;
			VilleValide2 = false;
			
			// Tant que la variable booléenne n'est pas égale à "true" alors on ne sort pas de la boucle "Tant que"
			
			while (VilleValide2 != true)
			{
				// La boucle "Pour" va tourner en boucle jusqu'à la longueur du vecteur "Ville"
				
				for (int a=0; a<Ville.length;a++)
				{	
					/* La variable "VilleArrivee" qui a été saisi par l'utilisateur va être comparé 
					par toutes les villes présentes dans le vecteur "Ville" */
					
					if(VilleArrivee.equals(Ville[a]))
					{
						/* Si la variable "VilleArrivee" est identique à l'une à des villes présentes dans le vecteur "Ville"
						alors la variable "VilleValide" va être égale à "true" et sortir de la boucle "Tant que" */
						
						VilleValide2 = true;
					}
				}
				
				/* Si l'utilisateur n'a pas saisi la ville présente dans le système
				ou bien s'il n'a pas saisi la ville avec la première lettre en majuscule
				alors l'ordinateur lui redemande de saisir la ville d'arrivée */
				
				if (VilleValide2 == false) VilleArrivee = Saisie.lire_String("Erreur, vous n'avez pas saisi la ville présente dans le système,"
				+ " ou bien vous n'avez pas saisi la ville avec la première lettre en majuscule. Veuillez recommencer !");
				
			}
		
		
			/* Déclaration des variables "PositionVilleDepart" et "PositionVilleArrivee" 
			qui permettent de prélever la position des deux villes sous un nombre en entier */
			
			int PositionVilleDepart, PositionVilleArrivee;
			
			// Initialisation des deux variables
			PositionVilleDepart = 0;
			PositionVilleArrivee = 0;
			
			// La boucle "Pour" va tourner en boucle jusqu'à la longueur du vecteur "Ville"
			
			for (int i=0; i<Ville.length;i++)
			{
				/* La variable "VilleDepart" qui a été saisi par l'utilisateur va être comparé 
				par toutes les villes présentes dans le vecteur "Ville" */
				
				if(VilleDepart.equals(Ville[i]))
				{
					
					/* Lorsque la ville de départ est égale à la ville présente dans le vecteur
					  alors la variable "PositionVilleDepart" va prélever le numéro de tour 
					  qu'à fait la boucle "Pour" */
					
					PositionVilleDepart = i;
					
				}
			}
		
			// La boucle "Pour" va tourner en boucle jusqu'à la longueur du vecteur "Ville"
			
			for (int i=0; i<Ville.length;i++)
			{	
				/* La variable "VilleArrivee" qui a été saisi par l'utilisateur va être comparé 
				par toutes les villes présentes dans le vecteur "Ville" */
				
				if(VilleArrivee.equals(Ville[i]))
				{
					/* Lorsque la ville d'arrivée est égale à la ville présente dans le vecteur
					  alors la variable "PositionVilleArrivee" va prélever le numéro de tour 
					  qu'à fait la boucle "Pour" */
					
					PositionVilleArrivee = i;
					
				}
			}
			
			/* Si l'utilisateur choisit de taper une ville de départ qui a pour position supérieure à la ville d'arrivée
			alors les résultats de la variable "Distance" se retrouve alors erronés, c'est pour cela qu'on a inversé
			la recherche des colonnes et des lignes pour afficher le bon résultat. */
			
			if (PositionVilleDepart>PositionVilleArrivee)
			{	
				// Affichage des variables "VilleDepart", "VilleArrivee" et "Distance"
				
				System.out.println("Ville de départ = "+VilleDepart+ "  Ville d'arrivée = "+VilleArrivee+"  Distance = "+Mat[PositionVilleArrivee][PositionVilleDepart]+" kms");
			}
			
			/* Si l'utilisateur choisit de taper une ville de départ qui a pour position inférieure à la ville d'arrivée alors 
		 	on procède de manière normale en cherchant d'abord la ligne et ensuite la colonne dans la matrice. */
			
			else 
			{	
				// Affichage des variables "VilleDepart", "VilleArrivee" et "Distance"
				
				System.out.println("Ville de départ = "+VilleDepart+ "  Ville d'arrivée = "+VilleArrivee+"  Distance = "+Mat[PositionVilleDepart][PositionVilleArrivee]+" kms");
			}
			
			// Demande à l'utilisateur s'il veut recommencer 
			
			System.out.println();
			
			Reessayer = Saisie.lire_String("Voulez-vous continuer à chercher la distance ? Veuillez répondre par oui ou par non.");
				
			// Si le joueur saisit un autre mot que oui ou non, l'ordinateur va lui redemander la question.
			
			while (!Reessayer.equals("oui") && !Reessayer.equals("non"))
			{
				Reessayer = Saisie.lire_String("Vous n'avez pas saisi 'oui' ou 'non', veuillez recommencer !");
			}
				
			// Si le joueur répond oui alors il recommence l'application.
			
			if (Reessayer.equals("oui"))
			{
				Sortie = false;
				System.out.println();
			}

			// Si le joueur répond non alors il met fin à l'application.
			
			if (Reessayer.equals("non"))
			{
				Sortie = true;
				System.out.println();
				System.out.println("Merci d'avoir utiliser notre application !");
			}  
		}
	}
}
