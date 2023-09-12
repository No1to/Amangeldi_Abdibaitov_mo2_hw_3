public class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
            System.out.println("Положено " + sum + " сом на счет. Текущий баланс: " + amount + " сом.");
        } else {
            System.out.println("Нельзя положить отрицательную сумму на счет.");
        }
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма больше, чем остаток на счете.", amount);
        }
        amount -= sum;
        System.out.println("Снято " + sum + " сом со счета. Текущий баланс: " + amount + " сом.");
    }
}