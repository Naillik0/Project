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
public class Blaster extends Weapon{

    public Blaster(String type, int DAMAGE, int DELAY,int ammo, int rank, String name, int quantity, int price, boolean USABLE) {
        super(type, DAMAGE, DELAY, ammo, rank, name, quantity, price, USABLE);
    }

    
    @Override
    public void upgrade(){
        //prix a gerer
        this.rank ++;
        this.DAMAGE = this.DAMAGE*2;
        
    }
    
    @Override
    public boolean canShoot(){
        return true;
    }
    

    @Override
    public void useW(Player s){
        if(canShoot()){
            s.takeDamage(this.DAMAGE); // a faire
            this.currentDelay = this.DELAY;//surement osef chiant
        }
    }

    @Override
    public void useItem(Player s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
