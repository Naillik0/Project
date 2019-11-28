/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weapon ;

/**
 *
 * @author thomascantonny
 */
public class Bombe extends Weapon {

    public Bombe(String type, int DAMAGE, int DELAY, int ammo, int rank, String name, int quantity, int price, boolean USABLE) {
        super(type, DAMAGE, DELAY, ammo, rank, name, quantity, price, USABLE);
    }

    

    @Override
    public void useW(Player s) {
        if(canShoot()){
            this.ammo --;
            s.takeDamage(this.DAMAGE); // a faire
            this.currentDelay = this.DELAY;//surement osef chiant
        }
        else
            System.out.println("L'arme n'est toujours pas prete à l'utilisation");
    }

    @Override
    public boolean canShoot() {
        return this.ammo != 0 && this.currentDelay == 0;
    }

    @Override
    public void upgrade() {
        this.rank ++;
        this.DAMAGE = this.DAMAGE*2;
    }

    @Override
    public void useItem(Player s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
