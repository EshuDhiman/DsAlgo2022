package Concepts.CollectionsJava;
import java.util.*;

class Book{
    private int id;
    private String name;
    private String author;

    public Book(int Bookid , String bookName , String bookAuthor){
        this.id = Bookid;
        this.name = bookName;
        this.author = bookAuthor;
    }
    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setId(int BID){
        BID=id;
    }
    
    public String toString(){
        return "Book=[BOOK_ID="+id+" BOOK_NAME="+ name+" BOOK_AUTHOR="+author+"]\n\n";
    }

}
class Library{
    private LinkedList<Book> bookLinkedList = new LinkedList<Book>();

    public LinkedList getbookLinkedList(){
        return bookLinkedList;
    }
    public void setbookLinkedList(LinkedList tempBookList){
        this.bookLinkedList= tempBookList;

    }
    
    void addBook(Book e){
        bookLinkedList.push(e);

    }
     int sizeOfLibrary(){
        int size =bookLinkedList.size();   
        return size;
    }
    void displayAllBooksWithDetails(){
        System.out.println(bookLinkedList);
    }
   void FindBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE BOOK NAME");
        String BookName = sc.nextLine().toLowerCase();
        displayBookList(BookName);
        sc.close();
    }
    private void displayBookList(String name){
        Book e=null;
        String findBookName;
        for (int i = 0; i < bookLinkedList.size(); i++) {
            findBookName = bookLinkedList.get(i).getName();
            if(name.equals(findBookName)){
                e = bookLinkedList.get(i);
            }
            
           
        }
        if (e==null) {
            System.out.println("BOOK NOT FOUND");
            
        }
        else{
            System.out.println(e);
        }
        
        

    }
}
public class BookLLTask{
    public static void main(String[] args) {
        Library objLibrary = new Library();
        Book LifeOfEshu = new Book(101, "life of eshu", "eshudhiman");
        Book LifeOfHeard = new Book(102, "life of heard", "heard");
        objLibrary.addBook(LifeOfEshu);
        objLibrary.addBook(LifeOfHeard);
        objLibrary.displayAllBooksWithDetails();
        objLibrary.sizeOfLibrary();
        objLibrary.FindBook();


        
        
    }
}