import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(101); // генеруємо випадкове число від 0 до 100

        int digitCount = String.valueOf(number).length(); // визначаємо кількість цифр

        System.out.println("Згенероване число: " + number);
        System.out.println("Кількість цифр: " + digitCount);
    }
}