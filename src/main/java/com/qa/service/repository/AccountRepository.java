package com.qa.service.repository;

import com.qa.domain.Account;

public interface AccountRepository {

	String getAllAccounts();
	
	String countAllAccounts();
	
	String createAnAccount(Account account);
	
	String findAnAccount(Long id);
	
	String updateAnAccount();
	
	String deleteAccount(int id);
	
}
