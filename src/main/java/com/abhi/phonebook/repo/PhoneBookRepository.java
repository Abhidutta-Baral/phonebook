package com.abhi.phonebook.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.phonebook.model.PhoneBook;

public interface PhoneBookRepository extends JpaRepository<PhoneBook, Integer> {

}
