package com.qa.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;

import com.qa.domain.Account;
import com.qa.service.repository.AccountDBRepository;

public class TestingAccountRepository {

	@Test
	public void shouldCreateAnAccount() {
		AccountDBRepository repository = new AccountDBRepository();
		Account account = new Account("Awais", "Ijaz", "1234");
		account = repository.createAnAccount(account);
		
		assertNotNull(account);
	}

	@Mock 
	public void shouldDeleteAnAccount() {

}
}
