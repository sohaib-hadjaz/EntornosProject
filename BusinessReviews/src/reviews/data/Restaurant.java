package reviews.data;

import java.util.Arrays;

public class Restaurant extends Business
{
    private String typefood;
    private Reviews [] review;


    public Restaurant(String typefood)
    {
        this.typefood = typefood;
        review = null ;
    }

    public Restaurant(String name, String location, String typefood ,
                      Reviews[] review   )
    {
        super(name, location,review);
        this.typefood = typefood;
        this.review = review;

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "typefood='" + typefood + '\'' +
                ", review=" + Arrays.toString(review) +
                '}';
    }

    public String getTypefood()
    {
        return typefood;
    }

    public void setTypefood(String typefood)
    {
        this.typefood = typefood;
    }

    public Reviews[] getReview() {
        return review;
    }

    public void setReview(Reviews[] review) {
        this.review = review;
    }
}
