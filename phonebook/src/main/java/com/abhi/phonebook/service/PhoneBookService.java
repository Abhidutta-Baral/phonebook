package com.abhi.phonebook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.phonebook.model.PhoneBook;
import com.abhi.phonebook.repo.PhoneBookRepository;

@Service
public class PhoneBookService {

	@Autowired
	PhoneBookRepository phoneBookRepository;

	public PhoneBook getPhoneBookById(int contactId) {
		return phoneBookRepository.findById(contactId).get();
	}

	public List<PhoneBook> getAllPhoneBook() {
		List<PhoneBook> phoneList = new ArrayList<PhoneBook>();
		phoneList = phoneBookRepository.findAll();
		return phoneList;
	}

	public void savePhoneBook(PhoneBook phoneBook) {
		phoneBookRepository.save(phoneBook);
	}

	public void updatePhoneBook(PhoneBook phoneBook) {
		phoneBookRepository.save(phoneBook);
	}

	public void deletePhoneBookRecord(int contactId) {
		phoneBookRepository.deleteById(contactId);
	}
}
