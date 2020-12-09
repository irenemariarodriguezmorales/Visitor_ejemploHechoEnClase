
package visitor;

public class Swordsman extends Soldier {

    public Swordsman(String name, int health) {
        super(name, health);
    }

    @Override
    public void toApplyMechanics(Mechanics mechanics) {
        mechanics.toApplyMovement(this);
    }
    
    @Override
    public Weapon toEquip() {
        return new Sword();
    }
    
}