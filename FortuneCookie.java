import java.util.ArrayList;
import java.util.Random;

public class FortuneCookie implements ISurprise {

    private static ArrayList<String> quotes;
    private final String message;
    private static Random random;

    public FortuneCookie(String message) {
        this.message = message;
    }

    public static FortuneCookie generate() {
        if (FortuneCookie.quotes == null) {
            FortuneCookie.quotes = new ArrayList<>();
            FortuneCookie.quotes.add("May the Force be with you.");
            FortuneCookie.quotes.add("I'll be back.");
            FortuneCookie.quotes.add("My precious.");
            FortuneCookie.quotes.add("It’s what it is.");
            FortuneCookie.quotes.add("Aerodynamics are for people who can't build engines.");
            FortuneCookie.quotes.add("It's just a flesh wound.");
            FortuneCookie.quotes.add("All right, we'll call it a draw.");
            FortuneCookie.quotes.add("Potatoes. Boil ’em, mash ’em, stick ’em in a stew.");
            FortuneCookie.quotes.add("What about second breakfast");
            FortuneCookie.quotes.add("I’m here to help. Don’t eat the help.");
        }
        if (FortuneCookie.random == null) {
            FortuneCookie.random = new Random();
        }
        return new FortuneCookie(FortuneCookie.quotes.get(random.nextInt(99) % 10));
    }

    @Override
    public void enjoy() {
        System.out.println(this.message);
    }

}
