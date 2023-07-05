package Containers;

public final class FactoryBag implements IBagFactory {

    private static FactoryBag instance;

    private FactoryBag() {
    }

    public static FactoryBag getInstance() {
        if (FactoryBag.instance == null) {
            FactoryBag.instance = new FactoryBag();
        }
        return instance;
    }

    @Override
    public IBag makeBag(String type) {
        switch (type.toUpperCase()) {
            case "FIFO":
                return new FIFOBag();
            case "LIFO":
                return new LIFOBag();
            default:
                return new RandomBag();
        }
    }

}
