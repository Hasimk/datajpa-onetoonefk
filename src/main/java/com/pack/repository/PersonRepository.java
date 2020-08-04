package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
