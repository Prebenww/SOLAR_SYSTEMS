package Model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = LandSnail.class, name = "LandSnail"),

})

public class Invertebrate extends Animal {
    private int legsNumb;
    private boolean canFly;
    private boolean canSwim;

    public Invertebrate(String name, String scienceName, ArrayList<Biome> biomes, int avrgLifespan, boolean endangered, int legsNumb, boolean canFly, boolean canSwim) {
        super(name, scienceName, biomes, avrgLifespan, endangered);
        this.legsNumb = legsNumb;
        this.canFly = canFly;
        this.canSwim = canSwim;
    }

    public Invertebrate() {

    }

    public int getLegsNumb() {
        return legsNumb;
    }

    public void setLegsNumb(int legsNumb) {
        this.legsNumb = legsNumb;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }
}
