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
public abstract class Weapon extends Items{
    
    
    private final String type;
    protected int DAMAGE;
    protected int DELAY;
    protected int ammo;
    protected int rank;
    protected int currentDelay;

    public Weapon(String type, int DAMAGE, int DELAY, int ammo, int rank,String name, int quantity, int price, boolean USABLE) {
        super(name,quantity,price,USABLE);
        this.type = type;
        this.DAMAGE = DAMAGE;
        this.DELAY = DELAY;
        this.ammo = ammo;
        this.rank = rank;
        this.currentDelay = 0;
        
        
    }
    
    public abstract void useW(Player s);
    
    public abstract boolean canShoot();
    
    public abstract void upgrade();
    
    @Override
    public String getName(){
        return(super.getName() + String.valueOf(this.rank));
    }
}
