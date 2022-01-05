package Model;

import java.util.ArrayList;

public class BlackHawk extends Bird{

    private boolean dangerous;

    public BlackHawk(String name, String scienceName, ArrayList<Biome> biomes, int avrgLifespan, boolean endangered, double avgWeight, boolean canFly, boolean dangerous) {
        super(name, scienceName, biomes, avrgLifespan, endangered, avgWeight, canFly);
        this.dangerous = dangerous;
    }

    public BlackHawk() {

    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    @Override
    public String toString() {
        return "BlackHawk{" +
                "dangerous=" + dangerous +
                '}';
    }
}
