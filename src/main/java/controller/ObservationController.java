package controller;
import io.javalin.Javalin;

import Model.Observation;
import io.javalin.http.Context;
import repository.IObservationRepository;

import java.util.ArrayList;

public class ObservationController {
    private IObservationRepository observationRepository;

    public ObservationController(IObservationRepository observationRepository) {
        this.observationRepository = observationRepository;
    }

    //Getting all observations
    public void allObservations(Context ctx) {
        ArrayList<Observation> observations = observationRepository.allObservations();
        ctx.json(observations);
    }

    public void fetchOneObservation(Context ctx) {
       ctx.json(observationRepository.allObservations());
    }

    //Bonustask put create, update and delete here.
}
