import java.util.Scanner; 


public class Plusgrand {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);

        System.out.println("Veuillez introduire un nombre compris entre 10 et 20");

        System.out.println("Voulez-vous commencer true or false"); 
        boolean reponse = myObj.nextBoolean();

        int max=20;
        int min=10;

        while(reponse == true)  {
            System.out.println("Entrez un nombre"); 
            int nbr=myObj.nextInt();

            if(nbr<=max && nbr>=min){
                
                System.out.println("C'est dedans"); 
                reponse=false;


            }

            else if(nbr<max){
                System.out.println("Plus Grand !"); 
                reponse=true;


            }
            else{
                System.out.println("Plus Petit !"); 
                reponse=true;

            }





          //  System.out.println("Voulez-vous introduire un nouveau nombre true or false"); 
           // reponse = myObj.nextBoolean();
        }


      






    }




}