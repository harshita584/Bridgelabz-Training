package com.linkedlist.doublylinkedlist;

//Node class for storing text states
class TextState {
 String text;
 TextState next;
 TextState prev;

 TextState(String text) {
     this.text = text;
     next = null;
     prev = null;
 }
}

//Text editor class
class TextEditor {

 private TextState head;
 private TextState tail;
 private TextState current;

 private int size = 0;
 private int maxSize = 10;   // limit for undo/redo history

 // add new text state
 void addState(String text) {

     // if we type after undo, clear redo history
     if (current != tail) {
         TextState temp = current.next;
         while (temp != null) {
             TextState next = temp.next;
             temp.prev = null;
             temp.next = null;
             temp = next;
             size--;
         }
         current.next = null;
         tail = current;
     }

     TextState newNode = new TextState(text);

     if (head == null) {
         head = tail = current = newNode;
         size = 1;
         return;
     }

     tail.next = newNode;
     newNode.prev = tail;
     tail = newNode;
     current = newNode;
     size++;

     // remove oldest state if size exceeds limit
     if (size > maxSize) {
         head = head.next;
         head.prev = null;
         size--;
     }
 }

 // undo operation
 void undo() {
     if (current == null || current.prev == null) {
         System.out.println("Nothing to undo");
         return;
     }
     current = current.prev;
 }

 // redo operation
 void redo() {
     if (current == null || current.next == null) {
         System.out.println("Nothing to redo");
         return;
     }
     current = current.next;
 }

 // display current text
 void showCurrentState() {
     if (current == null) {
         System.out.println("Editor is empty");
     } else {
         System.out.println("Current Text: " + current.text);
     }
 }
}

//Main class
public class UndoRedoEditor {
 public static void main(String[] args) {

     TextEditor editor = new TextEditor();

     editor.addState("H");
     editor.addState("He");
     editor.addState("Hel");
     editor.addState("Hell");
     editor.addState("Hello");

     editor.showCurrentState();

     editor.undo();
     editor.showCurrentState();

     editor.undo();
     editor.showCurrentState();

     editor.redo();
     editor.showCurrentState();

     editor.addState("Hello World");
     editor.showCurrentState();

     editor.redo();   // redo not possible after new typing
 }
}

