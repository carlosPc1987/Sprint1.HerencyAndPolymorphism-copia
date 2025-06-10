package level1.exercise1.model;

public class PercussionInstrument extends Instrument {
    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    public String playInstrument() {
        return "now you listen  the Percussion Instrument " + getName() +
                " ,with this price " + getPrice() + " € , enjoy!!!";
    }
}







