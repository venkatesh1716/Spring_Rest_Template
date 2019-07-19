package com.bookrental.spring.springjpa.entity;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookID;

    private String authorname;
    private String title;
    private int isbn;
    private String academic;
    private int totalcount;
   /* @Column(name = "status", insertable=false, updatable = false, nullable = false,
            columnDefinition = "varchar(50) default 'available'")*/
    private String status;

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic;
    }

    public int getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(int totalcount) {
        this.totalcount = totalcount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", authorname='" + authorname + '\'' +
                ", title='" + title + '\'' +
                ", isbn=" + isbn +
                ", academic='" + academic + '\'' +
                ", totalcount=" + totalcount +
                ", status='" + status + '\'' +
                '}';
    }
}
