package Model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BlackHawk.class, name = "BlackHawk")

})
public class Bird extends Animal {

    private double avgWeight;
    private boolean canFly;

    public Bird(String name, String scienceName, ArrayList<Biome> biomes, int avrgLifespan, boolean endangered, double avgWeight, boolean canFly) {
        super(name, scienceName, biomes, avrgLifespan, endangered);
        this.avgWeight = avgWeight;
        this.canFly = canFly;
    }

    public Bird() {

    }

    public double getAvgWeight() {
        return avgWeight;
    }

    public void setAvgWeight(double avgWeight) {
        this.avgWeight = avgWeight;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
