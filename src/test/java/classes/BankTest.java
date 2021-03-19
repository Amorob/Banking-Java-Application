package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;

    @Before
    public void setUp() throws Exception {
        bank = new Bank("TestBank");

        //    adding a branch to a bank
        bank.addBranch("branch one");

        //    adding Bismark to branch one
        bank.addCustomer("branch one","Bismark",200.00);
    }

    @Test
    public void addBranch() {
        //      test should return true and be able to add branch
        assertTrue(bank.addBranch("new branch"));

        //      test should return false because branch one already exist
        assertFalse(bank.addBranch("branch one"));
    }

    @Test
    public void addCustomer() {
        //      test should return true and be able to add customer(Robertson)
        assertTrue(bank.addCustomer("branch one","Robertson",100.00));

        //      test should return false because customer(Bismark) already exist
        assertFalse(bank.addCustomer("branch one", "Bismark",500.00));
    }

    @Test
    public void addCustomerTransaction() {
        //      test should return true because customer(Bismark) already exist
        assertTrue(bank.addCustomerTransaction("branch one","Bismark",200.00));

        //      test should return false because customer(Thomas) does not exist
        assertFalse(bank.addCustomerTransaction("branch one", "Thomas",200.00));
    }

    @Test
    public void listCustomers() {
        //      test should return true because branch already exist
        assertTrue(bank.listCustomers("branch one", true));

        //      test should return false because branch does not exist
        assertFalse(bank.listCustomers("new branch", false));
    }
}