package level3.exercici1.model;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private final String dni;
    private String name;
    private static double salary = 1500.0;
    private List<News> news;

    public Editor(String dni, String name) {
        this.dni = dni;
        this.name = name;
        this.news = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double newSalary) {
        salary = newSalary;
    }

    public List<News> getNews() {
        return news;
    }

    public void addNews(News news) {
        this.news.add(news);
    }

    public void removeNews(String headline) {
        news.removeIf(n -> n.getHeadline().equals(headline));
    }
}