import java.util.ArrayList;

public class LIFOBag implements IBag {

    private ArrayList<ISurprise> sack;

    public LIFOBag() {
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
        if (this.sack.size() != 0) {
            ISurprise x = this.sack.get(this.sack.size() - 1);
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
