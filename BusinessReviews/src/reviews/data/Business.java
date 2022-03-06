package reviews.data;

import java.util.Arrays;

abstract public class Business implements Comparable<Business>
{
    private String name;
    private String location;
    private Reviews[] review;
    public Business()
    {
        name = "";
        location="";
        review = null ;
    }

    public Business(String name, String location , Reviews[] review)
    {
        this.name = name;
        this.location = location;
        this.review=review;
    }
    public void reviewAverage()
    {

    }

    @Override
    public String  toString() {
        return "Business{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", review=" + Arrays.toString(review) +
                '}';
    }

    @Override
    public int compareTo(Business other)
    {
        return name.compareTo(other.name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public Reviews[] getReview() {
        return review;
    }

    public void setReview(Reviews[] review) {
        this.review = review;
    }
}
