package com.bookrental.spring.springjpa.doa;

import com.bookrental.spring.springjpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {

/*
    @Query(value = "SELECT * FROM book where bookID=3",nativeQuery = true)
    List<Book> getAllbook();*/

    /*@Modifying
    @Transactional
    @Query(value = "UPDATE book SET status='deleted' WHERE isbn=:id",nativeQuery = true)
    void  deleteBookByBookID(int id);*/


}
