package Giving;

import Containers.FactoryBag;
import Containers.IBag;
import Surprises.ISurprise;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGivesSurprises {

    private IBag recipient;
    private int waitTime;

    public AbstractGivesSurprises(String bagType, int waitTime) {
        this.recipient = FactoryBag.getInstance().makeBag(bagType);
        this.waitTime = waitTime;
    }

    public void put(ISurprise newSurprise) {
        this.recipient.put(newSurprise);
    }

    public void put(IBag surprises) {
        this.recipient.put(surprises);
    }

    public void give() {
        ISurprise x =  this.recipient.takeOut();
        if (x != null) {
            x.enjoy();
        }
    }

    public void giveAll() {
        int it = this.recipient.size();
        for (int i = 0; i < it; i++) {
            give();
            try {
                TimeUnit.SECONDS.sleep(this.waitTime); // number of seconds to sleep
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public boolean isEmpty() {
        return this.recipient.isEmpty();
    }

    abstract void giveWithPassion();

}
