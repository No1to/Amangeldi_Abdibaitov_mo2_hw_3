public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000);

        while (true) {
            try {
                account.withDraw(6000);
            } catch (LimitException le) {
                double remainingAmount = le.getRemainingAmount();
                System.out.println("Попытка снять больше, чем остаток на счете. Снято " + remainingAmount + " сом.");
                break;
            }
        }
    }
}