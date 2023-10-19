/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diwadikswobarg;

/**
 *
 * @author DawidGrabowski
 */
public class BasketItem
{
    private Product Item;
    private int Quantity;
    
    public BasketItem(Product item, int quantity)
    {
        this.Item = item;
        this.Quantity = quantity;
    }
    public void addQuantity(int quantity)
    {
        this.Quantity += quantity;
    }
   
    public double getTotalPrice()
    {
        return this.Item.Price * this.Quantity;
    }
    
    public String toString(){
        return this.Quantity + " " + this.Item.Name + " - £" + String.format("%.2f", this.Item.Price);
    }
    
    @Override
    public boolean equals(Object item) {
        return (this.Item.Name.equals(((BasketItem)item).Item.Name));
    }
}
