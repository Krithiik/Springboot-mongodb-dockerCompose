package com.example.demo.model;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigInteger;

// Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Servers")

// Class
public class Server {
    @Id
    private BigInteger _id;
    private String name;
    private String language;
    private String framework;


    //Getter Methods
    public BigInteger getId(){
        return this._id;
    }
    public String getName(){
        return this.name;
    }

    public String getLanguage(){
        return this.language;
    }

    public String getFramework(){
        return this.framework;
    }


    //Setter Methods
    public void setId(BigInteger _id) {
        this._id = _id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLanguage(String language){
        this.language = language;
    }
    public void setFramework(String framework){
        this.framework = framework;
    }
}
