import java.util.Scanner; 
import javax.lang.model.util.ElementScanner14;

public class Factorielle {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Voulez-vous introduire un nombre  OUI ou NON"); 
        boolean reponse = myObj.nextBoolean(); 

        while(reponse==true){
            System.out.println("Veuillez introduire un nombre");
            int nbr = myObj.nextInt(); 

            if(nbr==0 || nbr==1){
                System.out.println("Le factorielle de "+nbr+" est 1");

            }

            int cpt=1;
            int fact=nbr;

            if(nbr>=2){

            

                while(cpt<=nbr-1){
                    fact=fact*(nbr-cpt);

                    cpt=cpt+1;

                }

                System.out.println("Le factorielle de "+nbr+" est "+fact);

                System.out.println("Voulez-vous introduire une nouvelle valeur");
                reponse = myObj.nextBoolean(); 
            }

            

        }




    }



}