public class Main {
    public static void main(String[] args) {

        int originalBill = 100;
        int refill = 1100;
        boolean bill = refill > 100;
        int bonus = refill / 100;
        int finalBill;

        if (bill) {
            finalBill = originalBill + refill + bonus;
        } else {
            finalBill = originalBill + refill;
        }
        System.out.println("Баланс счёта: ");
        System.out.println((finalBill) + " руб");
        System.out.println("Бонусов начислено: " +(bonus));

    }
}
