public class Main {
    public static void main(String[] args) {

        int balance1 = 150; // начальный счет
        int amount = 1200; // сумма пополнения
        int bonus; //количество начисляемых бонусов


        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int balance2 = balance1 + amount + bonus; // итоговый счет

        System.out.println("Начисленный бонус:" + bonus);
        System.out.println("Итоговый счет:" + balance2);
    }
}