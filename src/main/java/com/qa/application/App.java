package com.qa.application;

import com.qa.domain.Account;
import com.qa.service.AccountService;
import com.qa.util.JSONUtil;

public class App {

	public static void main(String[] args) {
		AccountService service = new AccountService();
		JSONUtil util = new JSONUtil();
		Account johnBloggs = new Account("John", "Doe", "1234");
		Account janeBloggs = new Account("Jane", "Doe", "1235");
		Account jimBloggs = new Account("Jim", "Taylor", "1236");
		service.addAccountFromMap(johnBloggs);
		service.addAccountFromMap(janeBloggs);
		service.addAccountFromMap(jimBloggs);
		String mapAsJSON = util.getJSONForObject(service.getAccountMap());
		System.out.println("This is the account map as JSON " + mapAsJSON);

	}

}
