package interfaces;
import classes.Customer;

import java.util.ArrayList;

public interface IBranch {
    String getName();
    ArrayList<Customer> getCustomers();
    boolean newCustomer();
    boolean addCustomerTransaction();
    Customer findCustomer();

}
