package level3.exercici1.model;

public class F1News extends News {
    private String team;

    public F1News(String headline, String team) {
        super(headline);
        this.team = team;
    }

    @Override
    public double calculatePrice() {
        double price = 100.0; // Base price

        if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")) {
            price += 50.0;
        }

        return price;
    }

    @Override
    public int calculateScore() {
        int score = 4; // Base score

        if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")) {
            score += 2;
        }

        return score;
    }
}