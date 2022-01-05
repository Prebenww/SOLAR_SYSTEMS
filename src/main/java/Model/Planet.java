package Model;

import java.util.ArrayList;

public class Planet {
    private String name;
    private String planetSystem;

    public Planet(String name, String planetSystem) {
        this.name = name;
        this.planetSystem = planetSystem;

    }

    public Planet() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanetSystem() {
        return planetSystem;
    }

    public void setPlanetSystem(String planetSystem) {
        this.planetSystem = planetSystem;
    }

    @Override
    public String toString() {
        return " planet " + name +
                " in the planetSystem " + planetSystem;
    }
}
