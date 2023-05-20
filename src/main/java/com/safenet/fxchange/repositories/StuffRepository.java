package com.safenet.fxchange.repositories;

import com.safenet.fxchange.entities.Stuff;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuffRepository extends MongoRepository<Stuff, ObjectId> {
}
