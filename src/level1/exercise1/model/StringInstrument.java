package level1.exercise1.model;

public class StringInstrument extends Instrument {
    public StringInstrument(String name, double price) {
        super(name, price);
    }

    public String playInstrument() {
        return "now you listen  the String Instrument " + getName() +
                " ,with this price " + getPrice() + " €, enjoy!!";
    }

}

