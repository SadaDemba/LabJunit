package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestBankAccount {
    @Test
    void testCredit1() {
        Account account = new Account(100);
        assertEquals(150, account.creditBalance(50));
    }

    @Test
    void testCredit2() {
        Account account = new Account(100);
        try {
            account.creditBalance(-50);
        } catch (IllegalArgumentException e) {
            assertEquals("Le montant du crédit doit être positif", e.getMessage());
        }

    }

    @Test
    void testDebit1() {
        Account account = new Account(100);
        assertEquals(40, account.debitBalance(60));
    }

    @Test
    void testDebit2() {
        Account account = new Account(100);
        try {
            account.debitBalance(150);
        } catch (IllegalArgumentException e) {
            assertEquals("Le montant du débit dépasse le solde disponible", e.getMessage());
        }

    }
}
