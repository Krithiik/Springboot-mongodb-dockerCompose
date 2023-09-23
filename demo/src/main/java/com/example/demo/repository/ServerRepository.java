package com.example.demo.repository;

import com.example.demo.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface ServerRepository extends MongoRepository<Server, BigInteger> {
    //For finding all servers that contains the given name using regex parameter
    // in mongodb.
    @Query("{'name':{$regex: ?0 }}")
    List<Optional<Server>> findAllServersContainingName(String name);
}
