package dev.atharvakulkarni.e_commerce.model;

public class Cart
{
    private String cart;

    public Cart(String cart)
    {
        this.cart = cart;
    }

    public Cart()
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