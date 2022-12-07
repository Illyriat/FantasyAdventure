import org.junit.Before;
import org.junit.Test;
import player.Caster;
import weapons.Staff;

import static org.junit.Assert.assertEquals;

public class CasterTest {

    Caster caster;
    Staff staff;

    @Before
    public void before() {
        staff = new Staff("Fire Stick", "Throws fire at enemies", 1600);
        caster = new Caster("Gandalf", "Human", 35000, 54, staff);
    }

    @Test
    public void hasName() {
        assertEquals("Gandalf", caster.getName());
    }

    @Test
    public void hasRace() {
        assertEquals("Human", caster.getRace());
    }

    @Test
    public void hasHealth() {
        assertEquals(35000, caster.getHealth());
    }

    @Test
    public void hasLevel() {
        assertEquals(54, caster.getLevel());
    }

    @Test
    public void hasStaff() {assertEquals("Fire Stick", staff.getName());}

    @Test
    public void hasStaffDescription() {
        assertEquals("Throws fire at enemies", staff.getDescription());
    }

    @Test
    public void hasStaffDamage() {
        assertEquals(1600, staff.getDamage());
    }
}
