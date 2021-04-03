package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double transactions){
        Customer customer = findCustomer(customerName);
        boolean flag = false;
        if (customer == null) {
            customer = new Customer(customerName,transactions);
            customers.add(customer);
            flag = true;
        }
        return flag;
    }

    public boolean addCustomerTransaction(String customerName, double transactions){
        Customer customer = findCustomer(customerName);
        boolean flag = false;
        if (customer != null) {
            customer.addTransaction(transactions);
            flag = true;
        }
        return flag;

    }

    private Customer findCustomer(String customerName){
        Customer customer = null;
        for (int i =0; i<customers.size();i++){
            if(customers.get(i).getName().equalsIgnoreCase(customerName)) {
                customer = customers.get(i);
                break;
            }
        }
        return customer;
    }
}
