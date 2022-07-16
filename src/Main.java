public class Main {

    public static void main(String[] args) {
        int account = 200; //остаток на счете клиента
        int amount = 1001; //сумма пополнения счета
        int summ = account + amount; //итоговая сумма на счету клиента
        int bonus = amount / 100; //количество бонусов
        if (amount <= 1000) {
            bonus = 0;
        }
        System.out.println("Итоговая сумма на счету клиента " + summ + " руб.");
        System.out.println("Количество бонусов " + bonus + " руб.");
    }
}
