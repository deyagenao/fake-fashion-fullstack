package com.deyaniragenao.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class User {

	private String emailAddress;
	private String password;
}
