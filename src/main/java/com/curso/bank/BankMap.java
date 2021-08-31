package com.curso.bank;

import java.util.HashMap;
import java.util.Map;

public class BankMap {
  private static Map<String,CustomerList> customers;

  static {
    customers = new HashMap<String, CustomerList>();
  }

  private BankMap() {
    // this constructor should never be called
  }

  public static void addCustomer(String f, String l, String dni) {
	  customers.put(dni, new CustomerList(f, l));  
  }
  
  public static void addCustomer(CustomerList c, String dni) {
	  customers.put(dni, c);  
  }
  

  public static int getNumOfCustomers() {
    return customers.size();
  }
  
  public static CustomerList getCustomer(String dni) {
    return customers.get(dni);
  }
}
