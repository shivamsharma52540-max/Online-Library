class Library{
    String[] books;
    int no_of_books ;
    Library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+ "  has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for(String Books: this.books){
            if(Books==null){
                continue;
            }
            System.out.println("* " +Books);
        }
    }
    void issuedBooks(String book){
        for(int i=0;i<this.books.length;i++) {
            if (this.books[i].equals(book)){
                System.out.println(book+ " The book has been issued!");
                this.books[i]=null;
               return ;
            }
        }
        System.out.println("this book does not exist");
    }
    void returnBook(String book){
      addBook(book);
    }
    /*
    void issueBook(String book){
        this.books[no_of_books]=book;
        no_of_books--;
        System.out.println(book+ "  has been issued!");
    }*/
}
public class online_Library {
    public static void main(String[] args) {
    Library CentralLibrary=new Library();
    CentralLibrary.addBook("The lost Child");
    CentralLibrary.issuedBooks("The lost Child");
    CentralLibrary.addBook("C++");
    CentralLibrary.addBook("Python");
    CentralLibrary.showAvailableBooks();
    System.out.println(CentralLibrary.no_of_books);
    }
}


