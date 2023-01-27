public class GivesSurpriseAndSing extends AbstractGivesSurprises {

    public GivesSurpriseAndSing(String bagType, int waitTime) {
        super(bagType, waitTime);
    }

    @Override
    public void giveWithPassion() {
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
    }
}
