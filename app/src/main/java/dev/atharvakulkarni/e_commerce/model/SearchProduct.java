package dev.atharvakulkarni.e_commerce.model;

public class SearchProduct
{
    private String title,price;
    private int images;

    public SearchProduct(String title, int images,String price)
    {
        this.title = title;
        this.images = images;
        this.price = price;
    }

    public String getTitle()
    {
        return title;
    }

    public int getImages()
    {
        return images;
    }

    public String getPrice()
    {
        return price;
    }
}