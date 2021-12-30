package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Demo.Model.PersonModel;

public interface PersonRepository extends JpaRepository<PersonModel, Long>{

}
