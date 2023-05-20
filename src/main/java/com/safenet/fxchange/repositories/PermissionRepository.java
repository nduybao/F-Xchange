package com.safenet.fxchange.repositories;

import com.safenet.fxchange.entities.Permission;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends MongoRepository<Permission,Integer> {
}
