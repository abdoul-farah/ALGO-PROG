import java.util.Scanner; 
import javax.lang.model.util.ElementScanner14;

public class Maxpos {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Voulez-vous introduire un nombre  OUI ou NON"); 
        boolean reponse = myObj.nextBoolean(); 

        int postmax=0;
        int postmin=0;

        int dec=0;

        int max=0;
        int min=0;

        

        while(reponse==true){
            System.out.println("Veuillez introduire un nombre");
            int nbr = myObj.nextInt(); 


            dec=dec+1;
            if(dec==1){
                 max=nbr;
                min=nbr;
            }else{

                if(nbr>max){
                    max=nbr;
                    postmax=dec;
                }

                if(nbr<min){
                    min=nbr;
                    postmin=dec;
                }
        
            }

            System.out.println("Voulez-vous introduire une nouvelle valeur");
            reponse = myObj.nextBoolean();

        }

        System.out.println("Le maximum est "+max+ " et est à la position "+postmax);
        System.out.println("Le minimum est "+min+ " et est à la position "+postmin);




    }



}