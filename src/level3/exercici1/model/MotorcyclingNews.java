package level3.exercici1.model;

public class MotorcyclingNews extends News {
    private String team;

    public MotorcyclingNews(String headline, String team) {
        super(headline);
        this.team = team;
    }

    @Override
    public double calculatePrice() {
        double price = 100.0; // Base price

        if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) {
            price += 50.0;
        }

        return price;
    }

    @Override
    public int calculateScore() {
        int score = 3; // Base score

        if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) {
            score += 3;
        }

        return score;
    }
}