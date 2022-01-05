package Model;

import java.util.ArrayList;

public class PacmanFrog extends Amphibians {

    private String Family;

    public PacmanFrog(String name, String scienceName, ArrayList<Biome> biomes, int avrgLifespan, boolean needWater, String family) {
        super(name, scienceName, biomes, avrgLifespan, needWater);
        Family = family;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public PacmanFrog() {

    }

    @Override
    public String toString() {
        return "PacmanFrog " +
                "in the " + Family + " family";
    }
}
