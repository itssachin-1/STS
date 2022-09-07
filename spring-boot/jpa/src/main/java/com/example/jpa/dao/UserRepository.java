package com.example.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.jpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
