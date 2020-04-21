package com.carwash.springbootmongodbsecurity.repository;

import com.carwash.springbootmongodbsecurity.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

}
