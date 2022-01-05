package Model;
import java.util.ArrayList;

public class LandSnail extends Invertebrate {

    private double kmtSpeed;

    public LandSnail(String name, String scienceName, ArrayList<Biome> biomes, int avrgLifespan, boolean endangered, int legsNumb, boolean canFly, boolean canSwim, double kmtSpeed) {
        super(name, scienceName, biomes, avrgLifespan, endangered, legsNumb, canFly, canSwim);
        this.kmtSpeed = kmtSpeed;
    }
    public LandSnail() {

    }

    public double getKmtSpeed() {
        return kmtSpeed;
    }

    public void setKmtSpeed(double kmtSpeed) {
        this.kmtSpeed = kmtSpeed;
    }
}
