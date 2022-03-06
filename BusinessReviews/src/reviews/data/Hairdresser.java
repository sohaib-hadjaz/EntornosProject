package reviews.data;

import java.util.Arrays;

public class Hairdresser extends Business
{
    private boolean unisex ;
    private Reviews [] review;
    public Hairdresser()
    {
        unisex = false ;
        review = null ;
    }

    public Hairdresser(String name, String location, boolean unisex, Reviews[] review) {
        super(name, location ,review );
        this.unisex = unisex;
        this.review = review;
    }

    public Hairdresser(String name, String location ,Reviews [] review) {
        super(name, location,review);
    }

    public boolean isUnisex()
    {
        return unisex;
    }

    public void setUnisex(boolean unisex)
    {
        if(unisex = true)
        {
            System.out.println("unisex");
        }
        else
        {
            System.out.println("Not unisex");
        }
    }

    public Reviews[] getReview() {
        return review;
    }



    public void setReview(Reviews[] review) {
        this.review = review;
    }
    @Override
    public String toString() {
        return "Hairdresser{" +
                "unisex=" + unisex +
                ", review=" + Arrays.toString(review) +
                '}';
    }
}
