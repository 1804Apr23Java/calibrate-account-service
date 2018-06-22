package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.beans.Account;
import com.revature.repository.AccountRepository;
import com.revature.service.AccountService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
public class AccountMicroServiceTest {
	
//	@TestConfiguration
//	static class AccountServiceTestContextConfiguration {
//		
//		@Bean
//		public AccountService accountService() {
//			return new AccountService();
//		}
//		
//	}
//		
//	@Autowired
//	AccountService accountService;
//	
//	@MockBean
//	private AccountRepository accountRepository;
//	
//	@Test 
//	public void getOneAccountTest() {
//		assertEquals(2, accountService.getAccount(2).getId());
//	}
	
//	@Test 
//	public void getAllAccountsTest() {
//		assertEquals(2, accountService.getAllAccounts().size());
//	}
//	
//	@Test 
//	public void addAccountTest() {
//		Account account = new Account("JJ", "M", "pass", "j@email.com", false, true);
//		assertEquals(1, accountService.addAccount(account).getId());
//	}
//	
//	@Test 
//	public void updateEmailTest() {
//
//		assertEquals("j@email.com", accountService.updateEmail(3, "j@email.com").getEmail());
//	}
//	
//	@Test 
//	public void updateFirstNameTest() {
//		assertEquals("JJ", accountService.updateFirstName(2, "JJ").getFirstName());
//
//	}
//	
//	@Test 
//	public void updateLastNameTest() {
//		assertEquals("LastName", accountService.updateLastName(2, "LastName").getLastName());
//
//	}
//	
//	@Test
//	public void testUserCanLogin() {
//		assertEquals("shivam.aashir@gmail.com", accountService.login("shivam.aashir@gmail.com", "password").getEmail());	
//	}
//	
//	@Test 
//	public void testUserLoginFails() {
//		assertNull(accountService.login("shivam.aashir@gmail.com", "notpass"));	
//	}
}