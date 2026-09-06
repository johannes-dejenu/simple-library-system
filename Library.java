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

    
    
    static{
        System.out.println("Library system starting...");
    }

    {
        System.out.println("Library initialized.");
    }

    public void addBook(Book book){

    }




}