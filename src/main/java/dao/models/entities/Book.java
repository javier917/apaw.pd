package dao.models.entities;

import java.util.ArrayList;
import java.util.List;

public class Book {
    int id;

    String isbn;

    List<Author> authors;

    List<Theme> themes;

    public Book(int id, String isbn, List<Author> authors, List<Theme> themes) {
        assert authors.size() >= 1;
        assert themes.size() >= 1;
        this.id = id;
        this.isbn = isbn;
        this.authors = new ArrayList<Author>();
        this.themes = themes;

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public int getId() {
        return id;
    }

}
