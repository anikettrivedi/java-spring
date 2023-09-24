package org.example.behavioralpatterns.memento;

public class TextWindowState {

    private final String text;

    public TextWindowState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}