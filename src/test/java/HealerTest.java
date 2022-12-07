import org.junit.Before;
import org.junit.Test;
import player.Healer;
import weapons.HealingTool;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer healer;
    HealingTool healingTool;

    @Before
    public void before() {
        healingTool = new HealingTool("Heals 'R' Us", "Heals allied players", 750);
        healer = new Healer("Aeson", "Elf", 20000, 21, healingTool);
    }

    @Test
    public void hasName() {
        assertEquals("Aeson", healer.getName());
    }

    @Test
    public void hasRace() {
        assertEquals("Elf", healer.getRace());
    }

    @Test
    public void hasHealth() {
        assertEquals(20000, healer.getHealth());
    }

    @Test
    public void hasLevel() {
        assertEquals(21, healer.getLevel());
    }

    @Test
    public void hasHealingTool() {assertEquals("Heals 'R' Us", healingTool.getName());}

    @Test
    public void hasHealingToolDescription() {
        assertEquals("Heals allied players", healingTool.getDescription());
    }

    @Test
    public void hasHealing() {
        assertEquals(750, healingTool.getHealing());
    }
}
