package bookstoread;

import java.util.*;
import java.util.stream.Collectors;

public class BookShelf {
    private final Book books = new Book();
    public Book books() {
        return Collections.unmodifiableList(books);
    }

    public void add(String...bookToAdd) {
        books.addAll(Arrays.asList(bookToAdd));
    }

    public List<String> arrange() {
        return books.stream().sorted().collect(Collectors.toList());
    }


}