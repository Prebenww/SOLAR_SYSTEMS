package Model;

import java.util.ArrayList;

public class Location {

    private String name;
    private double longitude;
    private double latitude;
    private Planet planet;
    ArrayList<Biome> biomesLocation1 = new ArrayList<Biome>();
    ArrayList<Biome> biomesLocation2 = new ArrayList<Biome>();
    ArrayList<Biome> biomesLocation3 = new ArrayList<Biome>();
    ArrayList<Biome> biomesLocation4 = new ArrayList<Biome>();

    public ArrayList<Biome> getBiomesLocation1() {
        return biomesLocation1;
    }

    public Location() {

    }

    public void setBiomesLocation1(ArrayList<Biome> biomesLocation1) {
        this.biomesLocation1 = biomesLocation1;
    }

    public ArrayList<Biome> getBiomesLocation2() {
        return biomesLocation2;
    }

    public void setBiomesLocation2(ArrayList<Biome> biomesLocation2) {
        this.biomesLocation2 = biomesLocation2;
    }

    public ArrayList<Biome> getBiomesLocation3() {
        return biomesLocation3;
    }

    public void setBiomesLocation3(ArrayList<Biome> biomesLocation3) {
        this.biomesLocation3 = biomesLocation3;
    }

    public ArrayList<Biome> getBiomesLocation4() {
        return biomesLocation4;
    }

    public void setBiomesLocation4(ArrayList<Biome> biomesLocation4) {
        this.biomesLocation4 = biomesLocation4;
    }

    public Location(ArrayList<Biome> biomesLocation1, ArrayList<Biome> biomesLocation2, ArrayList<Biome> biomesLocation3, ArrayList<Biome> biomesLocation4) {
        this.biomesLocation1 = biomesLocation1;
        this.biomesLocation2 = biomesLocation2;
        this.biomesLocation3 = biomesLocation3;
        this.biomesLocation4 = biomesLocation4;

    }

    public Location(String name, double longitude, double latitude, Planet planet, ArrayList<Biome> biomes) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.planet = planet;


    }

    @Override
    public String toString() {
        return
                "name: " + name + " at the longitude: " + longitude +
                " and latitude " + latitude +
                " at " + planet +
                "  and in biome=" + biomesLocation1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

}
