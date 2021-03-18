package interfaces;
import classes.Branch;

public interface IBank {
    boolean addBranch(String branchName);

    boolean addCustomer(String branchName, String customerName, double initialaAmount);

    boolean addCustomerTransaction(String branchName, String customerName, double amount);

    Branch findBranch(String branchName);

    boolean listCustomers(String branchName, boolean showTransactions);
}
