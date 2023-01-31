public class Main {
    public static void main(String[] args) {

        int originalBill = 100;
        int refill = 1100;
        int bonus;

        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Баланс счёта: ");
        System.out.println((originalBill + refill + bonus) + " руб");
        System.out.println("Бонусов начислено: " +(bonus));

    }
}
