public class Main {
    public static void main(String[] args) {

        int balance = 100; // рублей
        int replenishment = 1_200; // рублей

        int bonus;
        if (replenishment > 1_000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int results = balance + replenishment + bonus;

        System.out.println("Итоговый счет: " + results);
        System.out.println("Начисленные бонусы: " + bonus);
    }
}
