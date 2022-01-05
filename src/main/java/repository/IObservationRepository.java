package repository;

import Model.Animal;
import Model.Location;
import Model.Observation;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IObservationRepository {

    //Method to fetch all Observations
    ArrayList<Observation> allObservations();

    //Method to fetch one Observation
    Observation fetchOneObservation(String obName);

    //Create Observation
    void createObservation(
             int id,
             String name,
             Animal animal,
             LocalDate date,
             Location location,
             int amount,
             String pictureUrl,
             String notatfelt
    );

    //Updating Observation
    void updateObservation(
            int id,
            String name,
            Animal animal,
            LocalDate date,
            Location location,
            int amount,
            String pictureUrl,
            String notatfelt
    );

    //Delete Observation
    void deleteObservation(String obName);


}
