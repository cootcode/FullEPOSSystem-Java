/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diwadikswobarg;

import java.util.ArrayList;

/**
 *
 * @author DawidGrabowski
 */
public class Basket {
    private ArrayList<BasketItem> BasketItems = new ArrayList<>();
    //keep the classes and methods names keep lowercase
    public void AddToBasket(Product product, int quantity)
    {
        BasketItem newItem = new BasketItem(product, quantity);
        if(!this.BasketItems.contains(newItem))
        {
            this.BasketItems.add(newItem);
        }
        else 
        {
            int index = BasketItems.indexOf(newItem);
            this.BasketItems.get(index).addQuantity(quantity);
        }
    }
    
    public double GetTotalPrice()
    {
        double total = 0;
        
        for(BasketItem item : this.BasketItems)
        {
            total += item.getTotalPrice();
        }
        
        return total;
    }
    
    public void ClearBasket()
    {
        BasketItems.clear();
    }
    
    
    public String toString()
    {
        String result = "";
        for(BasketItem item : BasketItems){
            result += item.toString() + "\n";
        }
        return result;
    }
}
