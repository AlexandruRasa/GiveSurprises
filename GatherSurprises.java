import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {

    private static Random random;
    private static GatherSurprises instance;
    private static ArrayList<ISurprise> surprises;

    private GatherSurprises() {
    }

    public static GatherSurprises getInstance() {
        if (GatherSurprises.instance == null) {
            GatherSurprises.instance = new GatherSurprises();
        }
        return GatherSurprises.instance;
    }

    public ArrayList<ISurprise> gather(int n) {
        GatherSurprises.surprises = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            GatherSurprises.surprises.add(gather());
        }
        return GatherSurprises.surprises;
    }

    public ISurprise gather() {
        if (GatherSurprises.random == null) {
            GatherSurprises.random = new Random();
        }
        switch (random.nextInt(3)) {
            case 0:
                return FortuneCookie.generate();
            case 1:
                return Candies.generate();
            case 2:
                return MinionToy.generate();
            default:
                return null;
        }
    }

    public IBag moveToBag() {
        IBag x = FactoryBag.getInstance().makeBag("LIFO");
        int it;
        if (GatherSurprises.surprises != null) {
            it = GatherSurprises.surprises.size();
        } else {
            it = 0;
        }
        for (int i = 0; i < it; i++) {
            x.put(GatherSurprises.surprises.get(0));
            GatherSurprises.surprises.remove(0);
        }
        return x;
    }

}
