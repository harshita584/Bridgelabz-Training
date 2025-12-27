package constructors.levelone;

//Subclass
class EBook extends Book_ {

 String format;

 EBook(String ISBN, String title, String author, String format) {
     super(ISBN, title, author);
     this.format = format;
 }

 void display() {
     System.out.println("ISBN: " + ISBN);          // public
     System.out.println("Title: " + title);        // protected
     System.out.println("Author: " + getAuthor()); // private via method
     System.out.println("Format: " + format);
 }

 public static void main(String[] args) {

     EBook eb = new EBook(
             "9780439708180",
             "Harry Potter",
             "J.K. Rowling",
             "PDF"
     );

     eb.display();

     // Change author using setter
     eb.setAuthor("Joanne Rowling");
     System.out.println("Updated Author: " + eb.getAuthor());
 }
}