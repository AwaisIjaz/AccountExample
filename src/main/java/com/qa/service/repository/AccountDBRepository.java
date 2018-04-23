package com.qa.service.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional(SUPPORTS)
public class AccountDBRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	public String getAllAccounts(){
		return null;
	}
	
	public String findAnAccount(){
		return null;
		
	}
	
	@Transactional(REQUIRED)
	public String createAnAccount(){
		return null;
		
	}
	
	@Transactional(REQUIRED)
	public String updateAnAccount(){
		return null;
		
	}
	
	@Transactional(REQUIRED)
	public String deleteAccount(){
		return null;
		
	}
}
