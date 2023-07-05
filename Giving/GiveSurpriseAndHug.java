package Giving;

public class GiveSurpriseAndHug extends AbstractGivesSurprises {

    public GiveSurpriseAndHug(String bagType, int waitTime) {
        super(bagType, waitTime);
    }

    @Override
    public void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }
}
