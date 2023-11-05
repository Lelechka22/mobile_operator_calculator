public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int rate = 100;
        int stepBonus = 1000;
        int upAmount = 2000;

        int bonus = 0;

        if (upAmount > stepBonus) {
            bonus = upAmount / rate;
        }

        int finalBalance = balance + upAmount + bonus;

        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонусные рубли: " + bonus);
    }
}