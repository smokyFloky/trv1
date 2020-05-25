import java.util.Random;
import java.util.Scanner;

public class MaibClass {

    public static int doubleInterval;
    public static void main(String[] args) {


        System.out.println("Veuillez appuyer sur : \n 1 pour jouer \n 2 pour voir les stats \n 3 pour sortir \n 4 rejouer");
        Scanner scanMenu = new Scanner(System.in);
        int f = scanMenu.nextInt();
        int index = 0;
        int globScore = 0;
        switch (f) {

            case 1:
                System.out.println("jouer");



                    while(globScore<100) {
                        //glob = scoreBoard();
                        if(jouer()){
                         globScore+=100;
                        System.out.println("Votre score est " +   globScore);
                    }}


                System.out.println("Veuillez appuyer sur : \n 2 pour voir les stats \n 4 pour sortir");
                Scanner scan = new Scanner(System.in);
                int y = scan.nextInt();

             switch (y) {
                 case 2:
                     System.out.println("Score Board");
                     System.out.println("Votre score est " + globScore);
                     break;

                 case 5:
                     break;

             }






            case 3:
                System.out.println("exit");

                break;
            case 4:
                doubleInterval*=2;
                System.out.println("jouer");



                while(globScore<100) {
                    //glob = scoreBoard();
                    if(jouer()){
                        globScore+=100;
                        System.out.println("Votre score est " +   globScore);
                    }}
                break;


        }
    }


     public static boolean jouer() {



            System.out.println("\n Choisissez un numero quelconque ");
            Scanner scan = new Scanner(System.in);
            String type = scan.nextLine();

            System.out.println("jaffiche pour tester " + type);

            int f = Integer.parseInt(type);
            Random r = new Random();
           doubleInterval = r.nextInt(5);


            System.out.println(doubleInterval);

            if (f < doubleInterval) {
                System.out.println("numero choisi est plus petit que le numero desiré");
                return false;

            }
            else if (f > doubleInterval) {System.out.println("numero choisi est plus grand que le numero desiré"); return false;  }

            System.out.println("***** YOU WON ******");
            return true;



        }






}
