public class Main {
    public static void main(String[] args) {
        int deposit = 1000;
        int persent;

        if (deposit >= 1000) {
            persent = 10;
        } else {
            persent = 0;
        }

        long amount = 100;
        long bonus = (amount + deposit) / persent;

        System.out.println(bonus);
    }
}