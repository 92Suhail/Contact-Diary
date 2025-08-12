package com.contactdiary.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contactdiary.entites.User;



@Repository
public interface UserRepo extends JpaRepository<User, String> {
    // extra methods db relatedoperations
    // custom query methods
    // custom finder methods

    // Optional<User> findByEmail(String email);
    //we have neccsary to write the logic of above and below function because
    //this will done by spring JPA as findBy + FieldName, eg.: findByEmail
    // Optional<User> findByEmailAndPassword(String email, String password);

    // Optional<User> findByEmailToken(String id);

}