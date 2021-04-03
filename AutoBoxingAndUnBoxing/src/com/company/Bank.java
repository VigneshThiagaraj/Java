package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        Branch branch = findBranch(branchName);
        boolean flag = false;
        if (branch == null){
            branch = new Branch(branchName);
            branches.add(branch);
            flag = true;
        }
        return flag;
    }
    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        boolean flag = false;
        Branch branch = findBranch(branchName);
        if (branch != null){
            flag = branch.newCustomer(customerName,initialTransaction);
        }else {
            addBranch(branchName);
        }
        return flag;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        return (branch != null) ? branch.addCustomerTransaction(customerName, initialTransaction) : false;
    }
    private Branch findBranch(String branchName){
        Branch branch = null;
        for (int i =0; i<branches.size();i++){
            if(branches.get(i).getName().equalsIgnoreCase(branchName)) {
                branch = branches.get(i);
                break;
            }
        }
        return branch;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        boolean flag = false;
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branchName);
            ArrayList<Customer> customers = findBranch(branchName).getCustomers();
            for (int i = 0; i<customers.size(); i++) {
                System.out.println("Customer: " + customers.get(i).getName() + "[" + (i+1) + "]");
                if(printTransactions) {
                    ArrayList<Double> transactions = customers.get(i).getTransactions();
                    System.out.println("Transactions");
                    for(int j = 0; j <transactions.size(); j++){
                        System.out.println("[" + (j+1) + "]  Amount " + transactions.get(j));
                    }
                }
            }
            flag = true;
        }
        return flag;
    }
}
