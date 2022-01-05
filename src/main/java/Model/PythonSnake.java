package Model;

import java.util.ArrayList;

public class PythonSnake extends Amphibians {

    private boolean poisonous;

    public PythonSnake(String name, String scienceName, ArrayList<Biome> biomes, int avrgLifespan, boolean needWater, boolean poisonous) {
        super(name, scienceName, biomes, avrgLifespan, needWater);
        this.poisonous = poisonous;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public PythonSnake() {

    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    @Override
    public String toString() {
        return "PythonSnake{" +
                "poisonous=" + poisonous +
                '}';
    }
}
