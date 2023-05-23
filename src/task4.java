import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int attempts = 2; // Кількість спроб
        int[] targetSequence = new int[3]; // Правильна послідовність
        int[] userSequence = new int[3]; // Послідовність, введена користувачем

        // Генеруємо правильну послідовність
        for (int i = 0; i < 3; i++) {
            targetSequence[i] = random.nextInt(3) + 1; // Генеруємо число від 1 до 3
        }

        System.out.println("Ласкаво просимо до гри Лотерея!");
        System.out.println("Вам потрібно відгадати послідовність трьох чисел від 1 до 3.");

        while (attempts > 0) {
            System.out.println("Спроба " + (3 - attempts + 1));

            // Введення послідовності користувачем
            for (int i = 0; i < 3; i++) {
                System.out.print("Введіть число " + (i + 1) + ": ");
                userSequence[i] = scanner.nextInt();
            }

            // Перевірка правильності введеної послідовності
            boolean isCorrect = true;
            for (int i = 0; i < 3; i++) {
                if (userSequence[i] != targetSequence[i]) {
                    isCorrect = false;
                    break;
                }
            }

            if (isCorrect) {
                System.out.println("Вітаємо! Ви вгадали правильну послідовність!");
                break;
            } else {
                System.out.println("Введена послідовність неправильна.");
                attempts--;
            }
        }

        if (attempts == 0) {
            System.out.println("Гра закінчилася. Ви не вгадали правильну послідовність.");
        }
    }
}