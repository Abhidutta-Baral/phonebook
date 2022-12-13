package com.abhi.phonebook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="phone_book")
@Data
public class PhoneBook {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int contactId;
	String contactName;
	String contactEmail;
	int contactNumber;

}
