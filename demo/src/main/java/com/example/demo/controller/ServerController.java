package com.example.demo.controller;

import com.example.demo.Service.ServerService;
import com.example.demo.model.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

// Annotation
@RestController
public class ServerController {
    @Autowired
    private ServerService serverService;

    // Find server by ID
    @GetMapping("/findServer/{id}")
    public ResponseEntity<?> getServer(@PathVariable BigInteger id){
        return serverService.getServer(id);
    }

    //Find All servers when ID is not provided
    @GetMapping("/findServer")
    public List<Server> getServers() {
        return serverService.getServers();
    }

    //Add a new server object
    @PostMapping("/addServer")
    public String saveServer(@RequestBody Server server){
       return serverService.saveServer(server);
    }

    //Delete a server by given ID
    @DeleteMapping("/deleteServer/{id}")
    public String deleteServer(@PathVariable BigInteger id){
       return serverService.deleteServer(id);
    }

    //Find all the servers whose name contains a given string
    @GetMapping("/server/{name}")
    public List<Optional<Server>> findServer(@PathVariable String name){
        return serverService.findServer(name);
    }
}
