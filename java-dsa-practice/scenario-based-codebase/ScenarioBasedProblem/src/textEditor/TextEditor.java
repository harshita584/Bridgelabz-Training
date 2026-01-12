package textEditor;

import java.util.Stack;

class Action {
    String type;  
    String text;

    Action(String type, String text) {
        this.type = type;
        this.text = text;
    }
}

public class TextEditor {
    private String content = "";
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    // Insert operation
    public void insert(String text) {
        content += text;
        undoStack.push(new Action("INSERT", text));
        redoStack.clear(); // new action clears redo stack
        System.out.println("Inserted: " + text);
    }

    // Delete operation
    public void delete(int length) {
        if (length > content.length()) {
            length = content.length();
        }
        String deletedText = content.substring(content.length() - length);
        content = content.substring(0, content.length() - length);
        undoStack.push(new Action("DELETE", deletedText));
        redoStack.clear();
        System.out.println("Deleted: " + deletedText);
    }

    // Undo operation
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();
        if (action.type.equals("INSERT")) {
            content = content.substring(0, content.length() - action.text.length());
        } else if (action.type.equals("DELETE")) {
            content += action.text;
        }
        redoStack.push(action);
        System.out.println("Undo performed");
    }

    // Redo operation
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();
        if (action.type.equals("INSERT")) {
            content += action.text;
        } else if (action.type.equals("DELETE")) {
            content = content.substring(0, content.length() - action.text.length());
        }
        undoStack.push(action);
        System.out.println("Redo performed");
    }

    public void display() {
        System.out.println("Current Text: " + content);
    }


    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.insert("Hello");
        editor.insert(" World");
        editor.display();

        editor.delete(6);
        editor.display();

        editor.undo();
        editor.display();

        editor.redo();
        editor.display();
    }
}
