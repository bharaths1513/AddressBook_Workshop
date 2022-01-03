package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Demo.Model.AddressBookModel;

public interface AddressBookRepository extends JpaRepository<AddressBookModel, Long> {

}
