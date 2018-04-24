package com.qa.service.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.qa.domain.Account;


import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;
import javax.transaction.Transactional;
import java.util.List;

@Transactional(SUPPORTS)
public class AccountDBRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	//Query function
	public List<Account> getAllAccounts(){
		 TypedQuery<Account> query = em.createQuery(
				"SELECT a From Account a", Account.class);
		return query.getResultList();	 
	}
	
	//Query function
	public int countAllAccounts(){
			TypedQuery<Integer> query = em.createQuery(
				"SELECT count(a) From Account a", int.class);
		return query.getSingleResult();
	}
	
	//Crud operation
	@Transactional(REQUIRED)
	public Account createAnAccount(Account account){
		em.persist(account);
		return account;	
	}
		
	//cRud operation
	public Account findAnAccount(Long id){
		return em.find(Account.class, id);	
	}
	
	//crUd operation
	@Transactional(REQUIRED)
	public String updateAnAccount(){
		return null;	
	}
	
	//cruD operation
	@Transactional(REQUIRED)
	public void deleteAccount(int id){
		em.remove(em.getReference(Account.class, id));
	}
}
