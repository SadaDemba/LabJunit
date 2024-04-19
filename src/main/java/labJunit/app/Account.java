package labJunit.app;

public class Account {
    public double balance;

    public Account(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Le solde de départ ne peut pas être négatif");
        }
        this.balance = balance;
    }

    public double debitBalance(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant du débit doit être positif");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Le montant du débit dépasse le solde disponible");
        }

        balance -= amount;
        return balance;
    }

    public double creditBalance(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant du crédit doit être positif");
        }
        balance = balance + amount;
        return balance;
    }

}
