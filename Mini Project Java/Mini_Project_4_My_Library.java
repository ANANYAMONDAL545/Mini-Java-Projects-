class Library{
    String [] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added.");
    }

    void showAvailableBooks(){
        System.out.println("Available books are:");
        for(String book: books){
            if(book == null ){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i] == book){
                System.out.println("Your book "+book+" has been issued! ");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Sorry! This book is not available in the library.");
    }void returnBook(String book){
        addBook(book);
    }
}


public class Mini_Project_4_My_Library {
    public static void main(String[] args) {
    Library MyLibrary = new Library();

    MyLibrary.addBook("Ramayana");
    MyLibrary.addBook("Programming in java");
    MyLibrary.addBook("C++");

    MyLibrary.showAvailableBooks();

    MyLibrary.issueBook("C++");
    MyLibrary.issueBook("Python Programming");

    MyLibrary.returnBook("C++");
    MyLibrary.showAvailableBooks();
int numberOfBooks = MyLibrary.no_of_books;
        System.out.println("Total number of available books is: " +numberOfBooks);
    }
}
