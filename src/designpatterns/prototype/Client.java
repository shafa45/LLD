package designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.setName("ABC");
        bird1.setColor("White");
        bird1.setWeight(12);

        Sparrow sparrow1 = new Sparrow();
        sparrow1.setColor("Blue");
        sparrow1.setLegSize("hey");

        Crow crow1 = new Crow();
        crow1.setSound("Kooooooo");
        crow1.setWeight(34);


        List<Bird> birds = List.of(
                sparrow1,
                crow1,
                bird1
        );

        List<Bird> children = new ArrayList<>();

        for(Bird parent: birds) {
            children.add(parent.clone());
        }

        System.out.println("Done");

        Sparrow longleggedSparrow = new Sparrow();
        longleggedSparrow.setLegSize("hundred");

        Crow sweetSoundCrow = new Crow();
        sweetSoundCrow.setSound("kookoo");

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.registerBird("sweetSoundCrow", sweetSoundCrow);
        birdRegistry.registerBird("longleggedSparrow", longleggedSparrow);

        List<String> getBirdOfTypes = List.of(
                "sweetSoundCrow",
                "longleggedSparrow",
                "sweetSoundCrow"
        );

        List<Bird> requestedBirds = new ArrayList<>();

        for (String type: getBirdOfTypes) {
            requestedBirds.add(birdRegistry.getBird(type));
        }

        System.out.println("Done");
    }
}
