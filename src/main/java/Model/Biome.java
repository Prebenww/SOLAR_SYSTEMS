package Model;

public class Biome {
    private String name;
    private String type; //terrestrial, marine, highlands etc

    public Biome() {

    }

    public Biome(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
