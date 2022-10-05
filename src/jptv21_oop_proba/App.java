/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21_oop_proba;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import myclass.Author;
import myclass.Book;


/**
 *
 * @author pupil
 */
public class App {
    public void run() {
        Book book = createBook("Evgeniy Onegin");
        book.addAuthor(createAuthor("Aleksandr","Pushkin"));
        Book book1 = createBook("Dubrovskiy");
        book.addAuthor(createAuthor("Aleksandr","Puskin"));
        book.addAuthor(createAuthor("Lev","Tolstoi"));
        Book[] books = {book, book1};
        
        System.out.println(Arrays.toString(books));
}
    private Book createBook(String caption){
        Book book = new Book();
        book.setCaption(caption);
        return book;
    }
    private Author createAuthor(String firstname, String lastname){
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
}