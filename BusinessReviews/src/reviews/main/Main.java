package reviews.main;
import reviews.data.*;
import java.util.Scanner;


public class Main
{
    public static void main(String [] args)
    {
        Management ArrayManagement = new Management() ;
        ArrayManagement.initialize();

        Scanner cs = new Scanner (System.in);
        boolean CorrectLogin = false;
        String loginuser;
        String passuser;
        int option;

        System.out.println("Write your login");
        loginuser= cs.nextLine();
        System.out.println("Write your password");
        passuser= cs.nextLine();


        Users users;
        Reviews reviews ;

        users = ArrayManagement.login(loginuser,passuser);
        System.out.println(users);
    int optionList ;
        System.out.println("1-My Reviews");
        System.out.println("2-Business list");
        System.out.println("3-Top rated Busnisses");
        System.out.println("Edit My review");
        System.out.println("Wich Option you will chouse ?");
        optionList= cs.nextInt();

        switch (optionList)
        {
            case 1 :
                ArrayManagement.showReviews(users);
                break;
            case 2 :
                ArrayManagement.sortBusinessesByRating();
                break;
            case 3 :

                break;
            case 4 :

                break;
        }




    }
}
