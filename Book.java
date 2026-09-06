public class Book{

    public record BookInfo(String title, String author, int price){}

    enum BookStatus {
        AVAILABLE,
        BORROWED
    }

}