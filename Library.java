import java.util.ArrayList;
public class Library{
    private final String name;
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>(); 

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
            System.out.println(book.getInfo().title());
        }
    }
    public void displayMembers(){
        for (Member member: members){
            System.out.println(member.getName());
        }
    }

    public void addBook(Book book){
        System.out.println("adding " + book.getInfo().title() +  " to the " + getName() + " Library." );
        System.out.println();
        books.add(book);
        book.setStatus(BookStatus.AVAILABLE);
        System.out.println("book added successfully.");
        System.out.println();
    }
    public void registerMember(Member member){
        System.out.println("registering " + member.getName() + " to the " + getName() + " Library.");
        System.out.println();
        members.add(member);
        System.out.println(member.getName() + " is registered successfully.");
        System.out.println();
    }
    public void borrowBook(Book book){
        book.setStatus(BookStatus.BORROWED);
    }
    public void returnBook(Book book){
        book.setStatus(BookStatus.AVAILABLE);
    }

}