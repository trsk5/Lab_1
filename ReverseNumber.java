public class ReverseNumber {
    public static void main(String[] args) {
        int number = 412;
        int reversedNumber = 0;

        // Реверсуємо трьохзначне число
        while(number != 0) {
            int digit = number % 10; // Отримуємо останню цифру
            reversedNumber = reversedNumber * 10 + digit; // Додаємо цифру до реверсованого числа
            number /= 10; // Видаляємо останню цифру з початкового числа
        }

        System.out.println("Реверснуте число: " + reversedNumber);
    }
}
