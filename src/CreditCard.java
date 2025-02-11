// Problem#3:

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); // Using copy constructor
        this.balance = new Money(0.0); // Initial balance is zero
    }

    // Accessor for balance (returns a new Money object to ensure security)
    public Money getBalance() {
        return new Money(balance);
    }

    // Accessor for credit limit (returns a new Money object to ensure security)
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Get owner details as a string
    public String getPersonals() {
        return owner.toString();
    }

    // Method to charge an amount to the credit card
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Method to make a payment on the credit card
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
