package level1.exercise1.model;

public class WindInstrument extends Instrument {
    public WindInstrument(String name, double price) {
        super(name, price);
    }

    public String playInstrument() {
        return "now you listen  Wind Instrument \" " + getName() +
                " ,with this price " + getPrice() + " € , enjoy!!!";
    }
}





