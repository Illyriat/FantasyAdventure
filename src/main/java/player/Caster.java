package player;

import weapons.Staff;

public class Caster extends Player{

    Staff staff;
    public Caster(String name, String race, int health, int level, Staff staff) {
        super(name, race, health, level);
        this.staff = staff;
    }

    public String getStaffName() {
        return staff.getName();
    }

    public String getStaffDescription() {
        return staff.getDescription();
    }

    public int getStaffDamahe() {
        return staff.getDamage();
    }
}
