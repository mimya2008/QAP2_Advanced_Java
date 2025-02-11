public class Money {
    private long dollars;
    private long cents;

    // Constructor
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

    // Copy Constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Getters
    public long getDollars() {
        return dollars;
    }

    public long getCents() {
        return cents;
    }

    // Method to add Money
    public Money add(Money otherAmount) {
        long totalCents = this.toCents() + otherAmount.toCents();
        return new Money(totalCents / 100.0);
    }

    // Method to subtract two Money
    public Money subtract(Money otherAmount) {
        long totalCents = this.toCents() - otherAmount.toCents();
        return new Money(totalCents / 100.0);
    }

    // method for converting Money to cents
    private long toCents() {
        return (dollars * 100) + cents;
    }

    // compareTo method
    public int compareTo(Money other) {
        return Long.compare(this.toCents(), other.toCents());
    }

    // equals method
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    // toString method
    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
    }
}

