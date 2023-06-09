package com.blockyourstocks.services;

import java.util.List;
import java.util.Map;

import com.blockyourstocks.entities.*;
import com.blockyourstocks.exceptions.*;

public interface CustomerService {
	public boolean login(String email,String password, Map<String, Customer> customers) throws InvalidDetailsException;

	public void register(Customer cus, Map<String, Customer> customers) throws DuplicateDataException;

	public boolean buyStock(String name, int qty, String email, Map<String, Stock> stocks,
			Map<String, Customer> customers, List<Transaction> transactions)
			throws InvalidDetailsException, StockException;
	
	public boolean sellStock(String name, int qty, String email, Map<String, Stock> stocks,
			Map<String, Customer> customers, List<Transaction> transactions)
			throws InvalidDetailsException, StockException;

	public boolean addMoneyToWallet(double amount, String email, Map<String, Customer> customers);
	
	public boolean withdrawMoneyFromWallet(double amount, String email, Map<String, Customer> customers);
	
	public double viewWalletBalance(String email, Map<String, Customer> customers);

	public Customer viewCustomerDetails(String email, Map<String, Customer> customers);

	public List<Customer> viewAllCustomers(Map<String, Customer> customers) throws StockException;

}


