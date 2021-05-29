public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int topUpBalance = 900;
        int bonus = topUpBalance / 100;

        if (topUpBalance > 1000) {
            System.out.println(bonus);
        }
        if (topUpBalance < 1000)
        { bonus = 0;
        }
        int totalBalance = accountBalance + topUpBalance + bonus;
        System.out.println(totalBalance);

}}
