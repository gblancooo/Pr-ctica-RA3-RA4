package Pràctica_RA3_RA4;

import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTest {

    @Test
    public void testDepositAmount() throws Exception {
        // Caso de éxito: Depósito de una cantidad válida
        Account account = new Account("Flor Martinez", "1000-1234-56-123456789", 2500);
        account.depositAmount(500);
        assertEquals(3000.0, account.getBalance(), 0.001); // Verifica que el saldo sea 3000.0
    }

    @Test(expected = Exception.class)
    public void testDepositAmountNegative() throws Exception {
        // Caso de error: Depósito de una cantidad negativa
        Account account = new Account("Flor Martinez", "1000-1234-56-123456789", 2500);
        account.depositAmount(-500); // Debe lanzar una excepción
    }

    @Test
    public void testWithdrawAmount() throws Exception {
        // Caso de éxito: Retiro de una cantidad válida
        Account account = new Account("Flor Martinez", "1000-1234-56-123456789", 2500);
        account.withdrawAmount(500);
        assertEquals(2000.0, account.getBalance(), 0.001); // Verifica que el saldo sea 2000.0
    }

    @Test(expected = Exception.class)
    public void testWithdrawAmountNegative() throws Exception {
        // Caso de error: Retiro de una cantidad negativa
        Account account = new Account("Flor Martinez", "1000-1234-56-123456789", 2500);
        account.withdrawAmount(-500); // Debe lanzar una excepción
    }

    @Test(expected = Exception.class)
    public void testWithdrawAmountInsufficientBalance() throws Exception {
        // Caso de error: Retiro de más dinero del disponible
        Account account = new Account("Flor Martinez", "1000-1234-56-123456789", 2500);
        account.withdrawAmount(3000); // Debe lanzar una excepción
    }
}