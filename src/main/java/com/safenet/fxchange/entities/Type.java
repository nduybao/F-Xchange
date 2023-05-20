package com.safenet.fxchange.entities;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "types")
public class Type {
    @Id
    private ObjectId id;

    private String name;

    public Type() {
    }

    public Type(String name) {
        this.name = name;
    }
}
