package com.abhi.phonebook.service;

import java.util.List;

import com.abhi.phonebook.model.PhoneBook;

public interface PhoneBookService {

	public String savePhoneBook(PhoneBook phoneBook);

	public PhoneBook getPhoneBookById(int contactId);

	public List<PhoneBook> getAllPhoneBook();

	public String updatePhoneBook(PhoneBook phoneBook);

	public String deletePhoneBookRecord(int contactId);
}
