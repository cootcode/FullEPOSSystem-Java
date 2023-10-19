/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diwadikswobarg;

/**
 *
 * @author DawidGrabowski
 */
public class Product {
    public String Name;
    public double Price;
    
    public Product(String name, double price){
        this.Name = name;
        this.Price = price;
    }
    
    public String toString(){
        return this.Name + " £" + String.format("%.2f", this.Price);
    }
}