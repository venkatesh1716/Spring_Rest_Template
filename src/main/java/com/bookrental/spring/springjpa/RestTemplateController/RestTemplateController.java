package com.bookrental.spring.springjpa.RestTemplateController;
import com.bookrental.spring.springjpa.entity.Book;
import com.bookrental.spring.springjpa.entity.Borrower;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;

@RestController
public class RestTemplateController {

    RestTemplate restTemplate= new RestTemplate();

    String uri1="http://localhost:8888/borrowers/";
    String uri="http://localhost:8888/books/";

    @RequestMapping(value = "template/books",produces = "application/json",method = RequestMethod.GET)
    public String getAllBooks(){
        HttpHeaders headers= new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<>(headers);
        return  restTemplate.exchange(uri, HttpMethod.GET,
                entity,String.class).getBody();
    }

    @RequestMapping(value = "/template/books/{id}",produces = "application/json",method = RequestMethod.GET)
    public String getBooksById(@PathVariable int id){
        HttpHeaders headers= new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<>(headers);
        return  restTemplate.exchange(uri+id, HttpMethod.GET,
                entity,String.class).getBody();
    }

    @RequestMapping(value = "/template/books", produces = "application/json",method = RequestMethod.POST)
    public ResponseEntity<Void> addBook(@RequestBody Book book){
        HttpHeaders headers= new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Book> entity= new HttpEntity<>(book, headers);
          restTemplate.exchange(uri, HttpMethod.POST,
                entity,String.class).getBody();
          return new ResponseEntity<>(headers,HttpStatus.CREATED);
    }
    @RequestMapping(value = "/template/books{id}",produces = "application/json",method = RequestMethod.PUT)
    public String updateBook(@PathVariable int id , @RequestBody Book book){
        HttpHeaders headers= new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Book> entity= new HttpEntity<>(book,headers);
        return  restTemplate.exchange(uri+id, HttpMethod.PUT,
                entity,String.class).getBody();
    }

    @RequestMapping(value = "/template/books/{id}",produces = "application/json",method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable int id){
        HttpHeaders headers= new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Book> entity= new HttpEntity<>(headers);
        ResponseEntity<String> response=restTemplate.exchange(uri+id,
         HttpMethod.DELETE, entity, String.class);
        return response.getBody();
    }

    @RequestMapping(value = "template/borrowers",produces = "application/json",method = RequestMethod.GET)
    public String getAllBorrowers(){
        HttpHeaders headers= new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<>(headers);
        return  restTemplate.exchange(uri1, HttpMethod.GET,
                entity,String.class).getBody();
    }

    @RequestMapping(value = "/template/borrowers/{id}",produces = "application/json",method = RequestMethod.GET)
    public String getBorrowerById(@PathVariable int id){
        HttpHeaders headers= new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<>(headers);
        return  restTemplate.exchange(uri1+id, HttpMethod.GET,
                entity,String.class).getBody();
    }
    @RequestMapping(value = "/template/borrowers", produces = "application/json",method = RequestMethod.POST)
    public ResponseEntity<Void> RentBook(@RequestBody Borrower borrower){
        HttpHeaders headers= new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Borrower> entity= new HttpEntity<>(borrower, headers);
        restTemplate.exchange(uri1, HttpMethod.POST,
                entity,String.class).getBody();
        return new ResponseEntity<>(headers,HttpStatus.CREATED);
    }
    @RequestMapping(value = "/template/borrowers{id}",produces = "application/json",method = RequestMethod.PUT)
    public String updateBorrower(@PathVariable int id , @RequestBody Borrower borrower){
        HttpHeaders headers= new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Borrower> entity= new HttpEntity<>(borrower,headers);
        return  restTemplate.exchange(uri1+id, HttpMethod.PUT,
                entity,String.class).getBody();
    }

    @RequestMapping(value = "/template/borrowers/{id}",produces = "application/json",method = RequestMethod.DELETE)
    public String deleteBorrower(@PathVariable int id){
        HttpHeaders headers= new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Book> entity= new HttpEntity<>(headers);
        ResponseEntity<String> response=restTemplate.exchange(uri1+id,
                HttpMethod.DELETE, entity, String.class);
        return response.getBody();
    }


}

