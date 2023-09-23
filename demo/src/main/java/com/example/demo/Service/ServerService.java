package com.example.demo.Service;

import com.example.demo.Exceptions.NoRecordFoundException;
import com.example.demo.model.Server;
import com.example.demo.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class ServerService {
    @Autowired
    private ServerRepository repo;

    //Find a particular server given ID
    public ResponseEntity<?> getServer(@PathVariable BigInteger id){
        Optional<Server> optionalServer = repo.findById(id);
        Server server = optionalServer.orElseThrow(() -> new NoRecordFoundException("Server with id:" + id.toString() + " not found"));
        return new ResponseEntity<>(server, HttpStatus.OK);
    }

    //Find All server objects in the Repository
    public List<Server> getServers() {
        return repo.findAll();
    }

    //Add a new server object to the Repository
    public String saveServer(@RequestBody Server server){
        repo.save(server);
        return "Added Server Successfully";
    }

    //Check for the server with ID and then delete it.
    public String deleteServer(@PathVariable BigInteger id){
        Optional<Server> optionalServer = repo.findById(id);
        optionalServer.orElseThrow(() -> new NoRecordFoundException("Server with id:" + id.toString() + " not found. So it cannot be deleted."));
        repo.deleteById(id);
        return "Deleted Server Successfully";
    }

    //Find all the servers whose name contains a given string as a substring
    public List<Optional<Server>> findServer(@PathVariable String name){
        return repo.findAllServersContainingName(name);
    }
}
