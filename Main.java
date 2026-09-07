public class Main {
    public static void main(String[] args) {
        Library library1 = new Library("Abrehot");


        BookInfo info1 = new BookInfo("Normal People", "Sally Rooney", 25);
        Book book1 = new Book();
        book1.setInfo(info1);

        BookInfo info2 = new BookInfo("I want you to be happy", "Jem Calder", 30);
        Book book2 = new Book();
        book2.setInfo(info2);

        Member member1 = new FacultyMember("Jason");
        Member member2 = new StudentMember("Johannes");

        library1.addBook(book1);
        library1.addBook(book2);

        library1.registerMember(member1);
        library1.registerMember(member2);

        

    }
}
