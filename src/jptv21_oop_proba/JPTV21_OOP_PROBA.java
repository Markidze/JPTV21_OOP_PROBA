/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21_oop_proba;

import java.util.HashSet;
import java.util.Set;
import myclass.Author;
import myclass.Book;

/**
 *
 * @author pupil
 */
public class JPTV21_OOP_PROBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstname("Aleksandr");
        author1.setLastname("Pushkin");
        Book book = new Book();
        book.setCaption("Evgeniy Onegin");
        Author[] authors = new Author[1];
        authors[0] = author1;
        book.setAuthors(authors);
        System.out.println(book.toString());
        
        Book book2 = new Book();
        book2.setCaption("zolotoy teljonok");
        Author author2 = new Author();
        author2.setFirstname("Ilja");
        author2.setLastname("Ilf");
        Author author3 = new Author();
        author3.setFirstname("Evgeniy");
        author3.setLastname("Petrov");
        Author[] authors2 = new Author[2];
        authors2[0]=author2;
        authors2[1]=author3;
        book2.setAuthors(authors2);
        System.out.println(book2.toString());
        
        Book book3 = new Book();
        book3.setCaption("Happy Potniy Harry");
        Author author4 = new Author();
        author4.setFirstname("Ilja");
        author4.setLastname("Deniskov");
        Author[] authors4 = new Author[1];
        authors4[0] = author4;
        book3.setAuthors(authors4);
        System.out.println(book3.toString());
        
        Book book4 = new Book();
        book4.setCaption("Basni");
        Author author5 = new Author();
        author5.setFirstname("Ivan");
        author5.setLastname("Krilov");
        Author[] authors5 = new Author[1];
        authors5[0] = author5;
        book4.setAuthors(authors5);
        System.out.println(book4.toString());
        
        Book book5 = new Book();
        book5.setCaption("Guys in space in 1992");
        Author author6 = new Author();
        author6.setFirstname("Andrei");
        author6.setLastname("Nikitin");
        Author[] authors6 = new Author[1];
        authors6[0] = author6;
        book5.setAuthors(authors6);
        System.out.println(book5.toString());
    }
      
}
