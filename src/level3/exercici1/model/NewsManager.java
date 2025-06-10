package level3.exercici1.model;

import java.util.ArrayList;
import java.util.List;

public final class NewsManager {
    private List<Editor> editors;

    public NewsManager() {
        this.editors = new ArrayList<>();
    }

    public void addEditor(Editor editor) {
        if (!editorExists(editor.getDni())) {
            editors.add(editor);
        }
    }

    public void removeEditor(String dni) {
        editors.removeIf(editor -> editor.getDni().equals(dni));
    }

    public void addNewsToEditor(String dni, News news) {
        Editor editor = findEditor(dni);
        if (editor != null) {
            editor.addNews(news);
        }
    }

    public void removeNewsFromEditor(String dni, String headline) {
        Editor editor = findEditor(dni);
        if (editor != null) {
            editor.removeNews(headline);
        }
    }

    public List<News> getEditorNews(String dni) {
        Editor editor = findEditor(dni);
        return editor != null ? editor.getNews() : new ArrayList<>();
    }

    public Editor findEditor(String dni) {
        return editors.stream()
                .filter(editor -> editor.getDni().equals(dni))
                .findFirst()
                .orElse(null);
    }

    public boolean editorExists(String dni) {
        return editors.stream().anyMatch(editor -> editor.getDni().equals(dni));
    }

    public List<Editor> getEditors() {
        return editors;
    }
}