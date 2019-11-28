/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weapon;

/**
 *
 * @author thomascantonny
 */

public abstract class Items {

    static void effect(Player aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String name;
    private int quantity;
    private int price;
    private boolean usable;
    
    public Items(String name, int quantity, int price,boolean usable) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.usable=usable;
    }

    

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isUsable() {
        return usable;
    }
   
    
    public abstract void useItem(Player s);
    
    
        
    
    
    
    
}

