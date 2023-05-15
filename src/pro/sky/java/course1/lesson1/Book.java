package pro.sky.java.course1.lesson1;

import java.util.Objects;

public class Book {
    private Author author;
    private String name;
    private int year;

    public Book(Author author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String toString() {
        return "Автор: " + getAuthor() + ", Название: " + getName() + ", Год написания: " + getYear();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, year);
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
