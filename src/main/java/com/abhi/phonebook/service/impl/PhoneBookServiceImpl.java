package com.abhi.phonebook.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.phonebook.model.PhoneBook;
import com.abhi.phonebook.repo.PhoneBookRepository;
import com.abhi.phonebook.service.PhoneBookService;

@Service
public class PhoneBookServiceImpl implements PhoneBookService {

	@Autowired
	PhoneBookRepository phoneBookRepository;

	public String savePhoneBook(PhoneBook phoneBook) {
		phoneBook = phoneBookRepository.save(phoneBook);
		int contactId = phoneBook.getContactId();
		if (contactId != 0) {
			return "Saved Contact";
		} else {
			return "Failed to save";
		}
	}

	public List<PhoneBook> getAllPhoneBook() {
		return phoneBookRepository.findAll();
	}

	public PhoneBook getPhoneBookById(int contactId) {
		Optional<PhoneBook> findById = phoneBookRepository.findById(contactId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	public String updatePhoneBook(PhoneBook phoneBook) {
		boolean existsById = phoneBookRepository.existsById(phoneBook.getContactId());
		if (existsById) {
			phoneBookRepository.save(phoneBook);
			return "Update Success";
		} else {
			return "No record found";
		}

	}

	public String deletePhoneBookRecord(int contactId) {

		boolean existsById = phoneBookRepository.existsById(contactId);
		if (existsById) {
			phoneBookRepository.deleteById(contactId);
			return "Record Delete Success";
		} else {
			return "No record found";
		}
	}

}
