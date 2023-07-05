package Giving;

public class GivesSurpriseAndApplause extends AbstractGivesSurprises {

    public GivesSurpriseAndApplause(String bagType, int waitTime) {
        super(bagType, waitTime);
    }

    @Override
    public void giveWithPassion() {
        System.out.println("Loud applause to you… For it is in giving that we receive.");
    }
}
