package com.abhi.phonebook.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.phonebook.model.PhoneBook;
import com.abhi.phonebook.service.PhoneBookService;

@RestController
public class PhoneBookController {

	@Autowired
	PhoneBookService phoneBookService;

	@GetMapping("/getAllPhoneBook")
	private List<PhoneBook> getAllPhoneBook() {
		List<PhoneBook> phoneBookList = new ArrayList<PhoneBook>();
		phoneBookList = phoneBookService.getAllPhoneBook();
		return phoneBookList;
	}

	@GetMapping("/getPhoneBookById/{contactId}")
	private PhoneBook getPhoneBookById(@PathVariable("contactId") int contactId) {
		PhoneBook phoneBook = phoneBookService.getPhoneBookById(contactId);
		return phoneBook;
	}

	@PostMapping("/savePhoneNumber")
	private int savePhoneNumber(@RequestBody PhoneBook phoneBook) {
		phoneBookService.savePhoneBook(phoneBook);
		return phoneBook.getContactId();
	}

	@PutMapping("/updatePhoneNumber")
	private PhoneBook updatePhoneNumber(@RequestBody PhoneBook phoneBook) {
		phoneBookService.savePhoneBook(phoneBook);
		return phoneBook;
	}
	
	@DeleteMapping("/deletePhoneNumber/{contactId}")
	private void deletePhoneBookRecord(@PathVariable("contactId") int contactId) {
		phoneBookService.deletePhoneBookRecord(contactId);
	}

}
