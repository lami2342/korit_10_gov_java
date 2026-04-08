package study.ex04;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
@Builder

class Book{
    String name, author;String isbn; int price;
    Book(String name, String author, String isbn, int price){
        this.author = author;
        this.isbn = isbn;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return name +"(" + author + "," + price + "원)";
    }

}


class Library {
    HashMap<String, Book> libraryMap = new HashMap<>();

    void addBook(Book b) {
        libraryMap.put(b.isbn, b);}
        Book findByIsbn(String isbn){
            return libraryMap.get(isbn);
    }

    List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book b : libraryMap.values()){
            if (b.author.equals(author)) result.add(b);
        }
        return result;
    }

    List<Book> findByPriceRange(int min, int max) {
        List<Book> result = new ArrayList<>();
        for (Book b : libraryMap.values()) {
            if (b.price >= min && b.price <= max) result.add(b);
        }
        return result;
    }

    void printAll() {
        libraryMap.values().forEach(System.out::println);
    }





}

public class Ex19 {
    public static void main(String[] args) {
        String searchAuthor = "남궁성";
    }
}
