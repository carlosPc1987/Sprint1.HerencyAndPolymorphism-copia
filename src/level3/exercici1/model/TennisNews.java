package level3.exercici1.model;

public class TennisNews extends News {
    private String competition;
    private String players;

    public TennisNews(String headline, String competition, String players) {
        super(headline);
        this.competition = competition;
        this.players = players;
    }

    @Override
    public double calculatePrice() {
        double price = 150.0; // Base price

        if (players.toLowerCase().contains("federer") ||
                players.toLowerCase().contains("nadal") ||
                players.toLowerCase().contains("djokovic")) {
            price += 100.0;
        }

        return price;
    }

    @Override
    public int calculateScore() {
        int score = 4; // Base score

        if (players.toLowerCase().contains("federer") ||
                players.toLowerCase().contains("nadal") ||
                players.toLowerCase().contains("djokovic")) {
            score += 3;
        }

        return score;
    }
}