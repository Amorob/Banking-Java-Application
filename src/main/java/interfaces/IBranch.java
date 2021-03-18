package interfaces;
import classes.Customer;

import java.util.ArrayList;

public interface IBranch {
    String getName();
    ArrayList<Customer> getCustomers();
    boolean newCustomer(String customerName, double initialTransaction);
    boolean addCustomerTransaction(String customerName, double transaction);
    Customer findCustomer(String customerName);

}
