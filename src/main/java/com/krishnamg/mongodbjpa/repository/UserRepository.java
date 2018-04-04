package com.krishnamg.mongodbjpa.repository;

import com.krishnamg.mongodbjpa.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
