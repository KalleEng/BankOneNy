public class Functions extends ContactsFromFile {
    private double balance;


    public Functions(double initialSaldo) {
        this.balance = initialSaldo;
    }

    public Functions() {

    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " kronor sattes in på ditt konto");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = (balance - amount);
            System.out.println(amount + " kronor togs ut från ditt konto");
        } else {
            System.out.println("Du har inte tillräckligt med pengar på kontot");
        }
    }

    public void showBalance() {
        System.out.println("Ditt saldo är: " + setTextYellow + balance + turnOffTextYellow);
    }

    public void pay(double amount) {
        if (balance >= amount) {
            balance = (balance - amount);
            System.out.println("Betalning på " + amount + "kr" + " registrerades");
        } else {
            System.out.println("Du har inte tillräckligt med pengar på kontot");
        }

    }

    public void loan(double amount) {
        balance += amount;
        System.out.println("Du fick lån på " + amount + " kr");
    }
}
