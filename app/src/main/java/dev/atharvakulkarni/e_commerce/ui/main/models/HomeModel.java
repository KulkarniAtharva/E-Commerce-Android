package dev.atharvakulkarni.e_commerce.ui.main.models;

public class HomeModel
{
    private String cart;

    public HomeModel(String cart)
    {
        this.cart = cart;
    }

    public HomeModel()
    {

    }

    public String getCart()
    {
        return cart;
    }

    public void setCart(String cart)
    {
        this.cart = cart;
    }
}
