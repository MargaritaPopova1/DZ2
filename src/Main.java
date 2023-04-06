public class Main {
    public static void main(String[] args) {

        int cost = 7_300;
        int quantity = 20;
        int accrued_miles = 1;

        int miles = cost / quantity * accrued_miles;

        System.out.println("Бонусные мили: " + miles);
    }
}