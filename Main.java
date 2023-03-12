public class Main {
    public static void main(String[] args) {

        GatherSurprises.getInstance().moveToBag();
        GiveSurpriseAndHug surprise0 = new GiveSurpriseAndHug("Random", 2);
        surprise0.give();

        surprise0.put(GatherSurprises.getInstance().moveToBag());
        GatherSurprises.getInstance().gather(10);
        surprise0.put(GatherSurprises.getInstance().moveToBag());
        GatherSurprises.getInstance().gather();
        GatherSurprises.getInstance().gather(10);
        surprise0.give();
        surprise0.giveAll();

        System.out.println();
        GivesSurpriseAndApplause surprise1 = new GivesSurpriseAndApplause("abc",1);
        surprise1.put(GatherSurprises.getInstance().gather());
        surprise1.put(GatherSurprises.getInstance().gather());
        surprise1.put(GatherSurprises.getInstance().gather());
        surprise1.give();
        surprise1.giveAll();

        System.out.println();
        GivesSurpriseAndSing surprise2 = new GivesSurpriseAndSing("Lifo",1);
        surprise2.isEmpty();
        GatherSurprises.getInstance().gather(5);
        surprise2.put(GatherSurprises.getInstance().moveToBag());
        surprise2.giveAll();
        Test q = new Test("random", 3);
        q.put(GatherSurprises.getInstance().gather());

    }

}
