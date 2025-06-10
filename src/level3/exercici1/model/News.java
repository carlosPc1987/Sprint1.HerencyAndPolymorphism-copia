package level3.exercici1.model;

public abstract class News {
    private String headline;
    private String text;
    private int score;
    private double price;

    public News(String headline) {
        this.headline = headline;
        this.text = "";
        this.score = calculateScore();
        this.price = calculatePrice();
    }

    public String getHeadline() {
        return headline;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public int getScore() {
        return score;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculatePrice();
    public abstract int calculateScore();
}