import java.util.ArrayList;

public class Library{
    private final String name;
    private ArrayList<Book> books;
    private ArrayList<Member> members; 

    public Library(String name){
        this.name = name;
    }

    static{
        System.out.println("Library system starting...");
    }

    {
        System.out.println("Library initialized.");
    }

    public String getName(){
        return name;
    }
    public void displayBooks(){
        for(Book book: books){
            System.out.println(book.ti);
        }
    }
    public void displayMembers(){
        for (Member member: members){

        }
    }

    public void addBook(Book book){
        System.out.println("adding book to the " + getName() + " Library." );
        books.add(book);
        System.out.println("book added successfully.");
    }
    public void registerMember(Member member){
        System.out.println("registering member to the " + getName() + " Library.");
    }
    public void borrowBook(Book book){

    }
    public void returnBook(Book book){}




}