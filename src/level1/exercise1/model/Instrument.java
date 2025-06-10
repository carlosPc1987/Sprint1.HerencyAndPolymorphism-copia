package level1.exercise1.model;

public abstract class Instrument {
    protected String name;
    protected double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public double getPrice() {

        return price;
    }

    public abstract String playInstrument();

}



