package reviews.data;

import java.util.Arrays;

public class Reviews
{
    private Users user;
    private String comment;
    private int rating;


    public Reviews()
    {
        user = null ;
        comment = "";
        rating = 0;
    }

    public Reviews(Users user, String comment, int rating)
    {
        this.user = user;
        this.comment = comment;
        this.rating = rating;
    }

    public Users getUser()
    {
        return user;
    }

    public void setUser(Users user)
    {
        this.user = user;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        if(  0 < rating  &&  rating  <= 5)
        {
            this.rating = rating;
        }
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "user=" + user +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }

}
