package level3.exercici1.application;

import level3.exercici1.model.*;

import java.util.Scanner;

public class RunMain {
    private NewsManager newsManager;
    private Scanner scanner;

    public RunMain() {
        this.newsManager = new NewsManager();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            showMenu();
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addEditor();
                    break;
                case 2:
                    removeEditor();
                    break;
                case 3:
                    addNewsToEditor();
                    break;
                case 4:
                    removeNewsFromEditor();
                    break;
                case 5:
                    showEditorNews();
                    break;
                case 6:
                    calculateNewsScore();
                    break;
                case 7:
                    calculateNewsPrice();
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\n=== Sports News Management System ===");
        System.out.println("1. Add Editor");
        System.out.println("2. Remove Editor");
        System.out.println("3. Add News to Editor");
        System.out.println("4. Remove News from Editor");
        System.out.println("5. Show Editor's News");
        System.out.println("6. Calculate News Score");
        System.out.println("7. Calculate News Price");
        System.out.println("8. Exit");
        System.out.print("Select an option: ");
    }

    private void addEditor() {
        System.out.print("Enter editor's DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Enter editor's name: ");
        String name = scanner.nextLine();

        Editor editor = new Editor(dni, name);
        newsManager.addEditor(editor);
        System.out.println("Editor added successfully.");
    }

    private void removeEditor() {
        System.out.print("Enter editor's DNI to remove: ");
        String dni = scanner.nextLine();
        newsManager.removeEditor(dni);
        System.out.println("Editor removed successfully.");
    }

    private void addNewsToEditor() {
        System.out.print("Enter editor's DNI: ");
        String dni = scanner.nextLine();

        if (!newsManager.editorExists(dni)) {
            System.out.println("Editor not found.");
            return;
        }

        System.out.println("Select news type:");
        System.out.println("1. Football");
        System.out.println("2. Basketball");
        System.out.println("3. Tennis");
        System.out.println("4. F1");
        System.out.println("5. Motorcycling");

        int type = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter news headline: ");
        String headline = scanner.nextLine();

        News news;
        switch (type) {
            case 1:
                System.out.print("Enter competition: ");
                String competition = scanner.nextLine();
                System.out.print("Enter club: ");
                String club = scanner.nextLine();
                System.out.print("Enter player: ");
                String player = scanner.nextLine();
                news = new FootballNews(headline, competition, club, player);
                break;
            case 2:
                System.out.print("Enter competition: ");
                competition = scanner.nextLine();
                System.out.print("Enter club: ");
                club = scanner.nextLine();
                news = new BasketballNews(headline, competition, club);
                break;
            case 3:
                System.out.print("Enter competition: ");
                competition = scanner.nextLine();
                System.out.print("Enter players: ");
                String players = scanner.nextLine();
                news = new TennisNews(headline, competition, players);
                break;
            case 4:
                System.out.print("Enter team: ");
                String team = scanner.nextLine();
                news = new F1News(headline, team);
                break;
            case 5:
                System.out.print("Enter team: ");
                team = scanner.nextLine();
                news = new MotorcyclingNews(headline, team);
                break;
            default:
                System.out.println("Invalid news type.");
                return;
        }

        newsManager.addNewsToEditor(dni, news);
        System.out.println("News added successfully.");
    }

    private void removeNewsFromEditor() {
        System.out.print("Enter editor's DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Enter news headline: ");
        String headline = scanner.nextLine();

        newsManager.removeNewsFromEditor(dni, headline);
        System.out.println("News removed successfully.");
    }

    private void showEditorNews() {
        System.out.print("Enter editor's DNI: ");
        String dni = scanner.nextLine();

        for (News news : newsManager.getEditorNews(dni)) {
            System.out.println("\nHeadline: " + news.getHeadline());
            System.out.println("Text: " + news.getText());
            System.out.println("Score: " + news.getScore());
            System.out.println("Price: " + news.getPrice() + "€");
        }
    }

    private void calculateNewsScore() {
        System.out.print("Enter editor's DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Enter news headline: ");
        String headline = scanner.nextLine();

        for (News news : newsManager.getEditorNews(dni)) {
            if (news.getHeadline().equals(headline)) {
                System.out.println("News score: " + news.getScore());
                return;
            }
        }
        System.out.println("News not found.");
    }

    private void calculateNewsPrice() {
        System.out.print("Enter editor's DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Enter news headline: ");
        String headline = scanner.nextLine();

        for (News news : newsManager.getEditorNews(dni)) {
            if (news.getHeadline().equals(headline)) {
                System.out.println("News price: " + news.getPrice() + "€");
                return;
            }
        }
        System.out.println("News not found.");
    }
}

