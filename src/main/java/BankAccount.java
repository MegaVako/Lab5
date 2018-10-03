import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        accountType = accountCategory;
        Bank.newAccountOpened();
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public boolean takeMoney(final double amount) {
        if (getAccountBalance() >= amount) {
            accountBalance -= amount;
            System.out.println(ownerName + " has " + accountBalance + " in his/her bank rn");
            return true;
        } else {
            System.out.println("Withdraw money failed");
            return false;
        }
    }
    public void depositeMoney(final double amount) {
        accountBalance += amount;
        System.out.println(ownerName + " has " + accountBalance + " in his/her bank rn");
    }
    public double getAccountBalance() {
        return accountBalance;
    }
}
