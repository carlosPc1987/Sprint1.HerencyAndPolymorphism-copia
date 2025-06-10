package level3.exercici1.model;

public class FootballNews extends News {
    private String competition;
    private String club;
    private String player;

    public FootballNews(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    @Override
    public double calculatePrice() {
        double price = 300.0; // Base price

        if (competition.equalsIgnoreCase("Champions League")) {
            price += 100.0;
        }

        if (club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Real Madrid")) {
            price += 100.0;
        }

        if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
            price += 50.0;
        }

        return price;
    }

    @Override
    public int calculateScore() {
        int score = 5; // Base score

        if (competition.equalsIgnoreCase("Champions League")) {
            score += 3;
        } else if (competition.equalsIgnoreCase("League")) {
            score += 2;
        }

        if (club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Real Madrid")) {
            score += 1;
        }

        if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
            score += 1;
        }

        return score;
    }
}