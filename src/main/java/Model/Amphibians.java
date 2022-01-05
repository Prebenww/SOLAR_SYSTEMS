package Model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PythonSnake.class, name = "PythonSnake"),
        @JsonSubTypes.Type(value = PacmanFrog.class, name = "PacmanFrog")

})
public class Amphibians extends Animal {

    private boolean needWater;


    public Amphibians(String name, String scienceName, ArrayList<Biome> biomes, int avrgLifespan, boolean needWater) {
        super(name, scienceName, biomes, avrgLifespan);
        this.needWater = needWater;
    }
    public Amphibians() {

    }


    public boolean isNeedWater() {
        return needWater;
    }

    public void setNeedWater(boolean needWater) {
        this.needWater = needWater;
    }
}
