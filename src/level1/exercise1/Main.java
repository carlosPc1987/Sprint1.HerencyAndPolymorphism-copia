package level1.exercise1;

import level1.exercise1.model.PercussionInstrument;
import level1.exercise1.model.StringInstrument;
import level1.exercise1.model.WindInstrument;

public class Main {
    public static void main(String[] args) {
        StringInstrument guitar = new StringInstrument("Guitar", 680.00);
        PercussionInstrument drums = new PercussionInstrument("Drums", 1500.00);
        WindInstrument flute = new WindInstrument("Flute", 115.00);

        System.out.println("\nLoading Instruments program...");

        System.out.println("\n"+guitar.playInstrument());
        System.out.println(drums.playInstrument());
        System.out.println(flute.playInstrument());
    }


}