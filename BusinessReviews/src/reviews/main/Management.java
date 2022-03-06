package reviews.main;
import reviews.data.*;
import java.util.Arrays;

public class Management
{
//*Aqui ya has declarado que el array es global a si que no hace falta que lo delcaras
// otra vez en las otras clases */
    private Users[] ArrayUsers;
    private Business[] ArrayBusiness;
    private Reviews[] ArrayReviews;
    int posicion = 0 ;
    public void initialize()
    {
        ArrayUsers = new Users[10];
        ArrayUsers[0]= new Users("sohaib","1");
        ArrayUsers[1]= new Users("paula","2");
        ArrayUsers[2]= new Users("Bill","3");
        ArrayUsers[3]= new Users("Jonn","4");
        ArrayUsers[4]= new Users("Brock","5");
        ArrayUsers[5]= new Users("Jack","6");
        ArrayUsers[6]= new Users("Elon","7");
        ArrayUsers[7]= new Users("Jeff","8");
        ArrayUsers[8]= new Users("Tim","9");
        ArrayUsers[9]= new Users("Steve","0");

        /*The End of the array of the users and to string */
        /*Now We are going with review array */
         ArrayReviews = new Reviews[2];
        ArrayReviews[0] = new Reviews
                ( ArrayUsers[0],"No comment",9);
        ArrayReviews[1] = new Reviews
                ( ArrayUsers[1],"No comment",9);


        ArrayBusiness = new Business[6];
        ArrayBusiness[0]=new Garage
                ("name","localizacion1",1, ArrayReviews);
        ArrayBusiness[1]=new Garage
                ("name2","localizacion2",2, ArrayReviews);
        ArrayBusiness[2]=new Hairdresser
                ("name2","localizacion2",true, ArrayReviews);
        ArrayBusiness[3]=new Hairdresser
                ("name2","localizacion2",false, ArrayReviews);

        ArrayBusiness[4]=new Restaurant
                ("name2","localizacion2","shit", ArrayReviews);
        ArrayBusiness[5]=new Restaurant
                ("name2","localizacion2","shit", ArrayReviews);
    }
    public Users login(String login, String password)
    {
        for (int x = 0  ; x < ArrayUsers.length ; x++)
        {
            if(login.equals(ArrayUsers[x].getLogin())     &&
                    password.equals( ArrayUsers[x].getPassword()))
            {
                posicion = x ;
                return ArrayUsers[posicion];
            }
        }
        System.out.println("No fond");
        return null;
    }

    public void showReviews(Users users  )
    {
        int x;
        int y ;
        for ( x = 0 ; x < ArrayBusiness.length ; x++ )
        {
            for ( y = 0 ; y < ArrayBusiness[x].getReview().length ; y++ )
            {
                 if(users.equals( ArrayBusiness[x].getReview()[y].getUser()))
                {
                    System.out.println(ArrayBusiness[x].getReview()[y]);
                }
            }
        }
    }
    public void sortBusinessesByRating()
    {
        Arrays.sort(ArrayBusiness);
        for (int x = 0 ; x < ArrayBusiness.length ; x++)
        {
            System.out.println(ArrayBusiness[x]);
        }
    }

}
