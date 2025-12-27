package constructors.levelone;

//Book class
public class Book_ {

 public String ISBN;        // public
 protected String title;    // protected
 private String author;     // private

 // Constructor
 Book_(String ISBN, String title, String author) {
     this.ISBN = ISBN;
     this.title = title;
     this.author = author;
 }

 // Setter for author
 public void setAuthor(String author) {
     this.author = author;
 }

 // Getter for author
 public String getAuthor() {
     return author;
 }
}