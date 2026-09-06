import java.util.ArrayList;

public class Library{
    private final String name;
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void displayBooks(){
        for(Book book: books){

        }
    }
    public void displayMembers(){
        for (Member member: members){
            
        }
    }

    
    
    static{
        System.out.println("Library system starting...");
    }

    {
        System.out.println("Library initialized.");
    }

    public void addBook(Book book){
        System.out.println("adding book to the " + getName() + " Library." );
        books.add(book);
        System.out.println("book added successfully.");
    }
    public void registerMember(Member member){}
    public void borrowBook(Book book){}
    public void returnBook(Book book){}




}