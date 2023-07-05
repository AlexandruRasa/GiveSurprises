package Surprises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Candies implements ISurprise {

    private final int numberOfCandies;
    private final String flavor;
    private static ArrayList<String> types;
    private static Random random;


    public Candies(int numberOfCandies, String flavor) {
        this.numberOfCandies = numberOfCandies;
        this.flavor = flavor;
    }

    public static Candies generate() {
        if (Candies.types == null) {
            Candies.types = new ArrayList<>(List.of("chocolate", "jelly", "apples", "vanilla","lemon",
                                                    "coffee", "strawberry", "caramel", "mint", "grape"));
        }
        if (Candies.random == null) {
            Candies.random = new Random();
        }
        return new Candies(random.nextInt(99),Candies.types.get(random.nextInt(99 ) % 10));
    }
    
    @Override
    public void enjoy() {
        System.out.println(this.numberOfCandies + " " + this.flavor + " candies.");
    }
}
