package Model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Invertebrate.class, name = "Invertebrate"),
        @JsonSubTypes.Type(value = Bird.class, name = "Bird"),
        @JsonSubTypes.Type(value = Amphibians.class, name = "Amphibians"),
})
public class Animal {

    private String name;
    private String scienceName;
    private ArrayList<Biome> biomes;
    private int avrgLifespan;
    private boolean endangered;


    public Animal(String name, String scienceName, ArrayList<Biome> biomes, int avrgLifespan, boolean endangered) {
        this.name = name;
        this.scienceName = scienceName;
        this.biomes = biomes;
        this.avrgLifespan = avrgLifespan;
        this.endangered = endangered;
    }

    public Animal(String name, String scienceName, ArrayList<Biome> biomes, int avrgLifespan) {

    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScienceName() {
        return scienceName;
    }

    public void setScienceName(String scienceName) {
        this.scienceName = scienceName;
    }

    public ArrayList<Biome> getBiomes() {
        return biomes;
    }

    public void setBiomes(ArrayList<Biome> biomes) {
        this.biomes = biomes;
    }

    public int getAvrgLifespan() {
        return avrgLifespan;
    }

    public void setAvrgLifespan(int avrgLifespan) {
        this.avrgLifespan = avrgLifespan;
    }

    public boolean isEndangered() {
        return endangered;
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", scienceName='" + scienceName + '\'' +
                ", biomes=" + biomes +
                ", avrgLifespan=" + avrgLifespan +
                ", endangered=" + endangered +
                '}';
    }
}
