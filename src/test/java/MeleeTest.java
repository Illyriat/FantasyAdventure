import org.junit.Before;
import org.junit.Test;
import player.Melee;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class MeleeTest {

    Melee melee;
    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon("Sword", "Pointy blade", 1200);
        melee = new Melee("Razum Dar", "Elf", 24000, 1, 340, weapon);
    }

    @Test
    public void hasName() {
        assertEquals("Razum Dar", melee.getName());
    }

    @Test
    public void hasRace() {
        assertEquals("Elf", melee.getRace());
    }

    @Test
    public void hasHealth() {
        assertEquals(24000, melee.getHealth());
    }

    @Test
    public void hasLevel() {
        assertEquals(1, melee.getLevel());
    }

    @Test
    public void hasStrength() {assertEquals(340, melee.getStrength());}

    @Test
    public void hasWeapon() {assertEquals("Sword", melee.getWeaponName());}

    @Test
    public void hasWeaponDescription() {assertEquals("Pointy blade", melee.getWeaponDescription());}

    @Test
    public void hasWeaponDamage() {assertEquals(1200, melee.getWeaponDamage());}
}
