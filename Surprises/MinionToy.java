package Surprises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MinionToy implements ISurprise {

    private static ArrayList<String> names;
    private final String name;
    private static Random random;

    public MinionToy(String name) {
        this.name = name;
    }

    public static MinionToy generate() {
        if (MinionToy.names == null) {
            MinionToy.names = new ArrayList<>(List.of("Dave", "Carl", "Kevin", "Stuart", "Jerry",
                                                        "Tim", "Mark", "Frank", "Brain", "Mike"));
        }
        if (MinionToy.random == null) {
            MinionToy.random = new Random();
        }
        return new MinionToy(MinionToy.names.get(random.nextInt(99) % 10));
    }

    @Override
    public void enjoy() {
        System.out.println("Hello, I'm " + this.name + ".");
    }
}
