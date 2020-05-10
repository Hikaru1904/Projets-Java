package MonPackage;

public class Tricomptage 
{

	public static void main(String[] args) 
	{
  
		// Déclaration des variables 
		
		int X,n,i,Nombre,j;
		
		// Déclaration des variables indicées
		
		int t[];
		int c[];
	
		t=new int [50];
		c=new int [50];
		
		/* Tant que l'utilisateur n'aura pas saisi un nombre supérieur à 3,
		 l'ordinateur recommencera la procédure de saisie. */
		
		do 
		{
	   
			n=Saisie.lire_int("Saisir un nombre entier supérieur à 3: ");
	   
		}
		
		while(n<3);
		
		// L'utilisateur saisit les valeurs qui seront remplies dans le vecteur t.
		for (i=0; i<n;i++) 
		{
			t[i] = Saisie.lire_int("Saisir une valeur: ");
		}
		
		// L'ordinateur remplit les valeurs du vecteur c par O en fonction de la longueur de n.
		for (i=0; i<n;i++) 
		{
			c[i] = 0;
		}
		
		j=0;
		i=0;
		
		// La boucle "Tant que" s'arrêtera lorsque toutes les valeurs du vecteur seront vérifiées
		// Le but de cette boucle est d'attribuer la position numérique des nombres.
		while (j<n)
		{
			i=j+1;
			while (i<=(n-1))
			{
				if (t[j] < t[i])
				{
					c[i]=c[i] +1;
				}
				
				else 
				{
					
					c[j]=c[j] +1;
				}
				
				i++;
			}
			j++;
	   
		}
		
		// Affichage de la position numérique des nombres
		for(j=0;j<n;j++)
		{
			System.out.print(c[j] + " ");
	   
		}
   
		System.out.println();
		Nombre=0;
		
		// Tri des nombres dans l'ordre croissant en fonction de la position numérique des nombres
		while (Nombre <= (n-1))
		{
			j=0;
			while (c[j] != Nombre)
			{
				j++;
			}
	   
			X= t[Nombre];
			t[Nombre]=t[j];
			t[j]= X;
	   
			Nombre = Nombre+1;
			j = Nombre +1;

	   
		}
		
		System.out.println();
		
		// Affichage des nombres dans l'ordre croissant
		
		for (j=0;j<n;j++)
		{
			System.out.println(t[j] +" ");
		}
   
	}

}
