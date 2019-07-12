package com.abc.demo.repository;



import com.abc.demo.model.Content;

// import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends MongoRepository<Content,String> {    

    // List<String> findAllByContentURL();
}