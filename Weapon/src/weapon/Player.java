/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weapon;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author thomascantonny
 */
public class Player {
    private final String NAME;
    private int hp;
    private final static int MAX_HP = 20;
    //rank ?
    private HashMap<Integer,Weapon> tabWeapons ;
    private Storage iventory;

    public Player(String NAME, HashMap<Integer, Weapon> tabWeapons, Storage iventory) {
        this.NAME = NAME;
        this.hp = MAX_HP;
        this.tabWeapons = tabWeapons;
        this.iventory = iventory;
    }

    public Storage getIventory() {
        return iventory;
    }

    public int getHp() {
        return hp;
    }

    public void repair(int hp) {
        this.hp += hp;
    }

    public void useWeapon(int numWeapon, Player s){
        Weapon w = tabWeapons.get(numWeapon);
        w.useW(s);
        
    }
    
    public void takeDamage(int d){
        this.hp -=d;
        System.out.println(this.NAME + "lose :  " + d + " life point");
    }
    
    public boolean IsDestroy(){
        return this.hp <=0;
    
    }
    
    public void equipWeapon(Weapon w){
        if(tabWeapons.size() < 2){
            tabWeapons.put(tabWeapons.size() + 1, w);
        }
        else{
            int key = removeWeapon();
            tabWeapons.put(key, w);
        }
    }
    
    public int removeWeapon(){
        Scanner scan = new Scanner(System.in);
        for(int i = 1; i < tabWeapons.size(); i++){
            System.out.println(i + "You have :" + tabWeapons.get(i).getName());
           
        }
        int answer = scan.nextInt();
        while(answer != 1 || answer != 2){
        System.out.println("Quelle arme voulez-vous remplacer ? ");
        answer = scan.nextInt();
        }
        tabWeapons.remove(answer);
        return answer;
             
    }   
    
    
    public void useThisItem(String name){
        HashMap<String,Items> liste = this.iventory.getListOfItems();
        Items i = liste.get(name);
        Items.effect(this);
        i.addQuantity(-1);
        liste.replace(name, i);
        iventory.refresh(liste);
        this.iventory = this.getIventory();
    }

} 
//rank pour la vie
//upRank() a faire