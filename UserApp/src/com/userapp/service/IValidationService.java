package com.userapp.service;

public interface IValidationService {
	boolean validateUsername(String username) throws NameExistsException;
	boolean validatepassword(String password) throws TooShortException,TooLongException
	if password = (length < =6 )
	return true
	}

}
