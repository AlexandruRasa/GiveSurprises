package Containers;

import Surprises.ISurprise;

import java.util.ArrayList;

public class FIFOBag implements IBag {

    public ArrayList<ISurprise> sack;

    public FIFOBag() {
        this.sack = new ArrayList<>();
    }

    @Override
    public void put(ISurprise newSurprise) {
         if (newSurprise != null) {
            this.sack.add(newSurprise);
        }
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
            ISurprise x = this.sack.get(0);
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
