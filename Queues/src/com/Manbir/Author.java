package com.Manbir;

public class Author implements Comparable<Author> {
    String firstname;
    String lastName;
    String bookName;

    Author(String first, String last, String book) {
        this.firstname = first;
        this.lastName = last;
        this.bookName = book;
    }

    @Override
    public int compareTo(Author o) {
        int last = this.lastName.compareTo(o.lastName);
        return last == 0 ? this.firstname.compareTo(o.firstname) : last;
    }
}
