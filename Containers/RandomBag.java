import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag {

    private ArrayList<ISurprise> sack;
    private static Random random;

    public RandomBag() {
        this.sack = new ArrayList<>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        this.sack.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        if (bagOfSurprises.equals(this)) {
            return;
        }
        int it = bagOfSurprises.size();
        for (int i = 0; i < it; i++) {
            ISurprise x = bagOfSurprises.takeOut();
            if (x != null) {
                this.sack.add(x);
            }
        }
    }

    @Override
    public ISurprise takeOut() {
        if (random == null) {
            random = new Random();
        }
        if (this.sack.size() != 0) {
            ISurprise x = this.sack.get(random.nextInt(this.sack.size()));
            this.sack.remove(x);
            return x;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return this.sack.size() == 0;
    }

    @Override
    public int size() {
        return this.sack.size();
    }
}
