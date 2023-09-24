package org.example.behavioralpatterns.memento;

public class TextWindow {

    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public String getCurrentText() {
        return currentText.toString();
    }

    // get immutable text window state with then currentText value when hitting save
    public TextWindowState save() {
        return new TextWindowState(currentText.toString());
    }

    // restore to last saved state
    public void restore(TextWindowState save) {
        currentText = new StringBuilder(save.getText());
    }
}