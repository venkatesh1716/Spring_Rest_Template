package com.bookrental.spring.springjpa.doa;


import com.bookrental.spring.springjpa.entity.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowerRepo extends JpaRepository<Borrower, Integer> {

}
