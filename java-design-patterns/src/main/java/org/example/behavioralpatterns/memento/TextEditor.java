package org.example.behavioralpatterns.memento;

public class TextEditor {

    private TextWindow textWindow;
    private TextWindowState savedTextWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text){
        textWindow.addText(text);
    }

    public String print(){
        return textWindow.getCurrentText();
    }

    // save text window state
    public void hitSave() {
        savedTextWindow = textWindow.save();
    }
    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }

}