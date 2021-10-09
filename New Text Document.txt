import java.util.Scanner; 
import javax.lang.model.util.ElementScanner14;

public class Intervalle {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Veuillez introduire la borne min"); 
        int bemin = myObj.nextInt();   
    
        System.out.println("Veuillez introduire la borne max"); 
        int bemax = myObj.nextInt();
        
        while(bemin>bemax){

            System.out.println("Erreur, la borne min doit etre plus petite que la borne max"); 
            System.out.println("Veuillez introduire une nouvelle borne min"); 
            bemin= myObj.nextInt();

            System.out.println("Veuillez introduire une nouvelle borne max");
            bemax=myObj.nextInt(); 



        }
        
        //System.out.println("borne min" +bemin+" borne max "+ bemax); 

        System.out.println("Voulez-vous commencer true ou false"); 
        boolean reponse = myObj.nextBoolean();

        while(reponse==true){
            System.out.println("Veuillez introduire un nombre"); 
            int nombre=myObj.nextInt();

            if(nombre<bemax && nombre>bemin){
                System.out.println("Le nombre "+nombre+ " introduit est dans l'intervalle"); 

            }else{
                System.out.println("Le nombre "+nombre+ " introduit n'est PAS dans l'intervalle"); 

            }

            System.out.println("Voulez-Vs continuer true or false"); 
            reponse=myObj.nextBoolean();


        }

        
    }
}