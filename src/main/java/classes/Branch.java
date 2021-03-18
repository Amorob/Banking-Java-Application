package classes;

import interfaces.IBranch;

import java.util.ArrayList;

public class Branch implements IBranch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    @Override
    public boolean newCustomer(String customerName, double initialTransaction) {
        if(findCustomer(customerName)==null){
            this.customers.add(new Customer(customerName,initialTransaction));
            return true;
        }
        return false;
    }

    @Override
    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    @Override
    public Customer findCustomer(String customerName) {
        for(int i=0;i<this.customers.size();i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
