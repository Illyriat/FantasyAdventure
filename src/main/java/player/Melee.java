package player;

import weapons.Weapon;

public class Melee extends Player{

    private int strength;

    Weapon weapon;

    public Melee(String name, String race, int health, int level, int strength, Weapon weapon) {
        super(name, race, health, level);
        this.strength = strength;
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeaponName() {
        return weapon.getName();
    }

    public String getWeaponDescription() {return weapon.getDescription();}

    public int getWeaponDamage() { return weapon.getDamage(); }
}
