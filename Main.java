public class Main {
    public static void main(String[] args) {

        GatherSurprises.moveToBag();
        GiveSurpriseAndHug surprise0 = new GiveSurpriseAndHug("Random", 2);
        surprise0.give();

        surprise0.put(GatherSurprises.moveToBag());
        GatherSurprises.gather(10);
        surprise0.put(GatherSurprises.moveToBag());
        GatherSurprises.gather();
        GatherSurprises.gather(10);
        surprise0.give();
        surprise0.giveAll();

        System.out.println();
        GivesSurpriseAndApplause surprise1 = new GivesSurpriseAndApplause("abc",1);
        surprise1.put(GatherSurprises.gather());
        surprise1.put(GatherSurprises.gather());
        surprise1.put(GatherSurprises.gather());
        surprise1.give();
        surprise1.giveAll();

        System.out.println();
        GivesSurpriseAndSing surprise2 = new GivesSurpriseAndSing("Lifo",1);
        surprise2.isEmpty();
        GatherSurprises.gather(5);
        surprise2.put(GatherSurprises.moveToBag());
        surprise2.giveAll();


    }

}