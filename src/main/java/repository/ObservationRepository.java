package repository;
import Model.Animal;
import Model.Location;
import Model.Observation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ObservationRepository implements IObservationRepository {

    private ArrayList<Observation> observationsJson = new ArrayList<>();
    private String fileName = "observation.json";

    public ObservationRepository(String fileName) {
        this.fileName = fileName;

    }

    public ObservationRepository() {

    }

    //Read from Json method
    public void readJsonFromFile() {
        try {

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            Observation[] observations = objectMapper.readValue(new File(fileName), Observation[].class);
            observationsJson.addAll(Arrays.asList(observations));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //write to Json method
    public void writeJsonToFile(String fileName, ArrayList<Observation> observations) {
        try {
            File file = new File(fileName);
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, observations);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //From json
    public ArrayList<Observation> getObservationsJson() {
        return observationsJson;
    }

    public void setObservationsJson(ArrayList<Observation> observationsJson) {
        this.observationsJson = observationsJson;
    }

    //Method to fetch all Observations
    public ArrayList<Observation> allObservations() {
        return new ArrayList<Observation>(observationsJson);
    }

    //Method to fetch one Observation
    public Observation fetchOneObservation(String obName) {
        Observation tempo = new Observation();
        for (Observation tmp : observationsJson) {
            if (tmp.getName().equals(obName)) {
                tempo = tmp;
                break;
            }
        }
        return tempo;
    }

    //Create Observation
    public void createObservation(
            int id,
            String name,
            Animal animal,
            LocalDate date,
            Location location,
            int amount,
            String pictureUrl,
            String notatfelt
    ) {
        int indexObservation = 0;
        // ObservationIndex index
        for (int i = 0; i < observationsJson.size(); i++) {
            if (observationsJson.get(i).getName().equals(name)) {
                indexObservation = i;
            }

        }
        //  observationsJson.get(indexObservation).
    }

    //Updating Observation
    public void updateObservation(
            int id,
            String name,
            Animal animal,
            LocalDate date,
            Location location,
            int amount,
            String pictureUrl,
            String notatfelt
    ) {

    }
    //Delete Observation
    public void deleteObservation(String obName) {

    }
}
