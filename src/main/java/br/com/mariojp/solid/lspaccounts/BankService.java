package br.com.mariojp.solid.lspaccounts;

public class BankService {

    // Único método que resolve os dois testes:
    public void processWithdrawal(Account acc, double amount) {
        if (acc instanceof Withdrawable) {
            ((Withdrawable) acc).withdraw(amount);
        }
        // se não for Withdrawable (SavingsAccount), não faz nada
    }
}
