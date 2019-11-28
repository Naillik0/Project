/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weapon;

import java.util.HashMap;

/**
 *
 * @author thomascantonny
 */
public class Storage {
   
    private HashMap<String,Items> ListOfItems;
    private int capacity;
    private int capacityMax;

    public HashMap<String, Items> getListOfItems() {
        return ListOfItems;
    }

    public void refresh(HashMap<String, Items> ListOfItems) {
        this.ListOfItems = ListOfItems;
    }
    
    public void addItem(Items i){
        if(this.ListOfItems.size() < this.capacityMax){
            ListOfItems.put(i.getName(),i);
            this.capacity ++;
        }
        else{
            System.out.println("");
        }
    }
    
    public void deleteItem(Items i){
        
    }
    
}
