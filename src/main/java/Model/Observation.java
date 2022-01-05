package Model;

import java.time.LocalDate;
import java.util.Collections;

public class Observation implements Comparable<Observation> {

    private int id;
    private String name;
    private Animal animal;
    private LocalDate date; // Local date
    private Location location;
    private int amount;
    private String pictureUrl;
    private String notatfelt;

    public Observation(int id, String name, Animal animal, LocalDate date, Location location, int amount, String pictureUrl, String notatfelt) {
        this.id = id;
        this.name = name;
        this.animal = animal;
        this.date = date;
        this.location = location;
        this.amount = amount;
        this.pictureUrl = pictureUrl;
        this.notatfelt = notatfelt;
    }

    public Observation() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getNotatfelt() {
        return notatfelt;
    }

    public void setNotatfelt(String notatfelt) {
        this.notatfelt = notatfelt;
    }

    @Override
    public String toString() {
        return "Observation number: " + id + " with the name " + name + " a " + animal +
                " was spotted, the date is " + date + " and the location is " + location +
                ". " + amount + " animals where spotted. picture:  " + pictureUrl + ". Notes:  " + notatfelt + ".";
    }

    @Override
    public int compareTo(Observation o) {
        return this.date.compareTo(o.date);
    }
}

