package reviews.data;

import java.util.Arrays;

public class Garage extends Business
{
    private float  price;
    private Reviews [] review;


    public Garage()
    {
        price = 0;
        review = null;
    }

    public Garage(String name, String location, float price , Reviews [] review) {
        super(name, location ,review);
        this.price = price;
        this.review=review;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "price=" + price +
                ", review=" + Arrays.toString(review) +
                '}';
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Reviews[] getReview() {
        return review;
    }

    public void setReview(Reviews[] review) {
        this.review = review;
    }


}
