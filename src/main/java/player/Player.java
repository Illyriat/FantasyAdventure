package player;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private String race;
    private int health;
    private int level;
//    private ArrayList<Items> items;


    public Player(String name, String race, int health, int level) {
        this.name = name;
        this.race = race;
        this.health = health;
        this.level = level;
//        this.items = items;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }
}
