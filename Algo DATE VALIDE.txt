Abdoulrahman Farah

VARIABLES

	jour, mois, annee : entier 


DEBUT ALGORITHME 

	Ecrire("Veuillez introduire le jour")
	Lire(jour)

	Ecrire("Veuillez introduire le mois")
	Lire(mois)

	Ecrire("Veuillez introduire l'année")
	Lire(annee)
		


	if (mois<1 OR mois >12) 
		then Ecrire ("Date Invalide") 
	end if 
		____________________________________________________
	
	if (mois ==1 OR mois ==3 OR mois ==5 OR mois ==7 OR mois ==8 OR mois ==10 OR mois ==12) 
		if (jour<=31 AND jour>=1)	
			then Ecrire ("Date Valide")
		else     
			Ecrire ("Date Invalide") 
		end if 
	

	end if 
			______________________________________	

	if (mois ==4 OR mois ==6 OR mois ==9 OR mois ==11) 
		if (jour<=30 AND jour>=1)
			then Ecrire ("Date Valide")
	
		else 
			Ecrire ("Date Invalide") 
		end if 

	end if 


		_____________________________________________



_
	if(mois==2) 

		if (annee mod == 4 AND annee mod 100 <>0 ) OR (annee mod 400 ==0)
				
			if (jour<=29 AND jour>=1))
				then Ecrire ("Date Valide")
			else 
				Ecrire ("Date Invalide") 
			end if 

		else 
				
			if (jour<=28 AND jour>=1))
				then Ecrire ("Date Valide")
			else 
				Ecrire ("Date Invalide") 
			end if
		
		end if 
	end if 

				

FIN ALGORITHME

