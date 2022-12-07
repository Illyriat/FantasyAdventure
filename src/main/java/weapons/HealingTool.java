package weapons;

public class HealingTool {

    private String name;
    private String description;
    private int healing;

    public HealingTool(String name, String description, int healing) {
        this.name = name;
        this.description = description;
        this.healing = healing;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHealing() {
        return healing;
    }
}
