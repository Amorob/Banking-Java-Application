package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() throws Exception {
        //       creating a new customer
        customer = new Customer("Daniel",250.06);
    }

    @Test
    public void getName() {
        //       test result should return the Daniel
        assertEquals("Daniel", customer.getName());
    }

    @Test
    public void getTransactions() {
        //
        assertEquals(250.06,(double) customer.getTransactions().get(0), 0.00);
    }

    @Test
    public void addTransaction() {
        // Add a transaction
        customer.addTransaction(200);

        //   test
        assertEquals(2, customer.getTransactions().size());
    }
}