package player;

import weapons.HealingTool;

import java.util.ArrayList;

public class Healer extends Player{

    HealingTool healingTool;
    public Healer(String name, String race, int health, int level, HealingTool healingTool) {
        super(name, race, health, level);
        this.healingTool = healingTool;
    }

    public String getHealingToolName() {
        return healingTool.getName();
    }

    public String getHealingToolDescription() {
        return healingTool.getDescription();
    }

    public int getHealingToolHealing() {
        return healingTool.getHealing();
    }
}
