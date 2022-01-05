import Model.*;
import controller.ObservationController;
import io.javalin.Javalin;
import io.javalin.plugin.rendering.vue.VueComponent;
import repository.ObservationRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;


public class Application {

    public static void main(String[] args) {

        //Creating ArrayList for bioms
        ArrayList<Biome> biomesLocation1 = new ArrayList<Biome>();
        ArrayList<Biome> biomesLocation2 = new ArrayList<Biome>();
        ArrayList<Biome> biomesLocation3 = new ArrayList<Biome>();
        ArrayList<Biome> biomesLocation4 = new ArrayList<Biome>();

        //Creating biomes
        Biome biomRainforest = new Biome("Rainforest");
        Biome biomTundra = new Biome("Tundra");
        Biome biomSavanna = new Biome("Savanna");
        Biome biomAlpine = new Biome("Alpine");
        Biome biomDesert = new Biome("desert");
        Biome biomMarine = new Biome("Marine");

        //Creating planets
        Planet Neptune = new Planet("Netptune", "Solar System");
        Planet Earth = new Planet("Earth", "Solar System");
        Planet Mars = new Planet("Mars", "Solar System");
        Planet Venus = new Planet("Venus", "Solar System");

        //Creating locations and bioms for locations
        //Location 1
        biomesLocation1.add(biomRainforest);
        Location location1 = new Location("location1", -8.551563441247, 159.453472259818, Neptune, biomesLocation1);
        //Location 2
        biomesLocation2.add(biomTundra);
        Location location2 = new Location("location2", -8.551563441247, 159.453472259818, Earth, biomesLocation2);
        //Loacation3
        // Borderland between two bioms
        biomesLocation3.add(biomAlpine);
        biomesLocation3.add(biomTundra);
        Location location3 = new Location("location3", -8.551563441247, 159.453472259818, Mars, biomesLocation3);
        //Location 4
        biomesLocation4.add(biomAlpine);
        Location location4 = new Location("location4", -8.551563441247, 159.453472259818, Venus, biomesLocation4);

        //creating Amphibians
        PacmanFrog blobben = new PacmanFrog("Pacman-Frog", "Ceratophrys", biomesLocation2, 15, true, "Ceratophryidae");
        PythonSnake Python = new PythonSnake("Python", "Pythonidae", biomesLocation2, 30, true, true);

        //Creating invertabreas
        LandSnail landSnail = new LandSnail("land Snail", "Achatina fulica", biomesLocation1, 10, false, 0, false, false, 0.0047);

        //Createing Birds
        BlackHawk blackHawk = new BlackHawk("BlackHawk", "Buteo", biomesLocation3, 21, true, 0.730, true, true);

        // Creating local dates   //LocalDate I found information about here: https://beginnersbook.com/2017/10/java-localdate-compareto-method-example/
        LocalDate date3 = LocalDate.of(2020, 1, 22);
        LocalDate date2 = LocalDate.of(2020, 3, 26);
        LocalDate date1 = LocalDate.of(2020, 6, 26);
        LocalDate date4 = LocalDate.of(2020, 10, 26);

        // Creating Observations
        Observation observation1 = new Observation(1, "Observation 1", blobben, date1, location1, 1, "data:image/jpeg;base64,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", "This animal is a frog and was observed eating another animal before it jumped into a pound of water and dissapeared from sights.");
        Observation observation2 = new Observation(2, "Observation 2", Python, date2, location2, 1, "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQVC0ha2WDLbl3niBC6D_OsuBFMBn2__BLiHbZfBu11j5co_Kda&usqp=CAU", "A huge Python was spottet chilling in a tree. We observed it for 1 hour before it slowly moved away from the tree and dissapeared into the distance.");
        Observation observation3 = new Observation(3, "Observation 3", landSnail, date3, location3, 6, "https://www.snail-world.com/wp-content/uploads/Land_Snail_600.jpg", "A huge landsnail was spotted crawling slowly in the sun. It was not very fast and it left a trail of slime.");
        Observation observation4 = new Observation(4, "Observation 4", blackHawk, date4, location4, 1, "https://www.allaboutbirds.org/guide/assets/photo/71532811-480px.jpg", "A huge Hawk was spotted on the skies, it was circling a prey, but never striked.");

        System.out.println("************************************************************************************************************************************************");
        System.out.println(observation1);
        System.out.println(observation2);
        System.out.println(observation3);
        System.out.println(observation4);

        //Creating a list with observations
        ArrayList<Observation> observations = new ArrayList<Observation>();
        observations.add(observation1);
        observations.add(observation2);
        observations.add(observation3);
        observations.add(observation4);

        Collections.sort(observations);
        //Sorted by date.
        for (Observation o : observations) {
            System.out.println(o.getName() + " " + o.getDate());
        }
        //Calling read and write methods.
        ObservationRepository observationRepository = new ObservationRepository();
        observationRepository.writeJsonToFile("observation.json", observations);
        observationRepository.readJsonFromFile();

        //Starting the application
        Javalin app = Javalin.create().start();
        app.config.enableWebjars();

        //Makes the program show up in browser without having to change path.
        app.get("/", new VueComponent("observations-overview"));

        ObservationController observationController = new ObservationController(observationRepository);
        //Observations
        app.get("/api/observations", observationController::allObservations);

    }
}
