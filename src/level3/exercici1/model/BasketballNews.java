package level3.exercici1.model;

public class BasketballNews extends News {
    private String competition;
    private String club;

    public BasketballNews(String headline, String competition, String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
    }

    @Override
    public double calculatePrice() {
        double price = 250.0; // Base price

        if (competition.equalsIgnoreCase("Euroleague")) {
            price += 75.0;
        }

        if (club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Real Madrid")) {
            price += 75.0;
        }

        return price;
    }

    @Override
    public int calculateScore() {
        int score = 4; // Base score

        if (competition.equalsIgnoreCase("Euroleague")) {
            score += 3;
        } else if (competition.equalsIgnoreCase("ACB")) {
            score += 2;
        }

        if (club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Real Madrid")) {
            score += 1;
        }

        return score;
    }
}