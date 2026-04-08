package study.ex04;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Data
@AllArgsConstructor

class Book2{
    String name, author;String isbn; int price;
}
interface Library2 {
    void addBook(Book b);
    List<Book> findByIsbn(String isbn);
    List<Book> findByAuthor(String author);
    List<Book> findByPriceRange(int min, int max);
    void printAll();
}

class LibraryImpl implements Library2 {

    private Map<String, Book> bookMap;

    @Override
    public void addBook(Book b) {
        bookMap.put(b.getIsbn(), b);
    }

    @Override
    public List<Book> findByIsbn(String isbn) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookMap.values()) {
            if (book.getIsbn().equals(isbn)) foundBooks.add(book);
        }
        return foundBooks;

    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookMap.values()) {
            if (book.getAuthor().equals(author))foundBooks.add(book);
        }

        return foundBooks;
    }

    @Override
    public List<Book> findByPriceRange(int min, int max) {
        List<Book> foundBooks = List.of();
        for (Book book : bookMap.values()) {
            if (book.getPrice()>=min && book.getPrice()<=max)foundBooks.add(book);
        }

        return foundBooks;
    }

    @Override
    public void printAll() {
        for (Book book : bookMap.values()) {
        System.out.println(book);

    }
}


public class Ex19_2 {

    public static void main(String[] args) {
        String searchAuthor = "남궁성";
        Library library = new Library();
        library.addBook(new Book("자바의 정석","남궁성","978-1",35000));
        library.addBook(new Book("스프링 입문","김영한","978-1",32000));
        library.addBook(new Book("이펙티브 자바","조슈아","978-1",36000));
    }
}
}
