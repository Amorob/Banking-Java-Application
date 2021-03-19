package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {
    Branch branch;


    @Before
    public void setUp() throws Exception {
        // Creating a new branch
        branch = new Branch("seven");
        branch.newCustomer("John",152.35);
    }

    @Test
    public void getName() {
        assertEquals("seven",branch.getName());
    }

    @Test
    public void getCustomers() {
        assertEquals("John",branch.getCustomers().get(0).getName());
    }

    @Test
    public void newCustomer() {
        assertTrue(branch.newCustomer("David",62.23));
        assertFalse(branch.newCustomer("John",25.32));
    }

    @Test
    public void addCustomerTransaction() {
        //   test
        assertTrue( branch.addCustomerTransaction("John",35.22));
        assertFalse(branch.addCustomerTransaction("David",23.11));
    }
}