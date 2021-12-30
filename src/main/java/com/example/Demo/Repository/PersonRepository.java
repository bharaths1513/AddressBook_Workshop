package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Model.PersonModel;

@Repository
public interface PersonRepository extends JpaRepository<PersonModel, Long>{

}
