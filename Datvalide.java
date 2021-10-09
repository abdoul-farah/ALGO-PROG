
import java.util.Scanner; // klld

import javax.lang.model.util.ElementScanner14;
public class Datvalide {
  public static void main(String[] args) {
	/*-------------------------*/

 Scanner myObj = new Scanner(System.in);
    
    
    int annee; 
	  int mois;
	  int jour;
	
    // Enter username and press Enter
    System.out.println("Enter jour"); 
    jour = myObj.nextInt();   

    System.out.println("Enter mois"); 
    mois = myObj.nextInt();   

    System.out.println("Enter année"); 
    annee = myObj.nextInt();   
       
    System.out.println("Votre Date est :  " + jour +" "+mois + " "+ annee);  





  /*-------------------------------------------------*/
	/*
   
   if(mois<1 || mois>12){
	   System.out.println("Date Invalide");    
   }
   else{
	   System.out.println("Date Valide");
	   
   }
   */
	/*-------------------------------------------------*/
  if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
    if(jour<=31 && jour>=1){
      System.out.println("Date Valide");
    }else{
      System.out.println("Date InValide");
    }
  }

  	/*-------------------------------------------------*/
    if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
      if(jour<=30 && jour>=1){
        System.out.println("Date Valide");
      }else{
        System.out.println("Date InValide");
      }
    }

  /*_______________________________*/
  
  if(mois==2){
    if(((annee % 4==0) && (annee % 100 !=0)) || (annee % 400 == 0)) {
      System.out.println("L'année "+ annee +" est bissextile");

        if(jour<=29 && jour>=1){
          System.out.println("Date Valide");
        }else{
          System.out.println("Date InValide");
        }
      }

        else{
          System.out.println("L'année "+ annee +" n'est pas bissextile");
          if(jour<=28 && jour>=1){
            System.out.println("Date Valide");
          }else{
            System.out.println("Date InValide");
          } 
        }




    }

    if(mois<1 || mois>12){
      System.out.println("Date Invalide");    
    }
    
  }
  }

