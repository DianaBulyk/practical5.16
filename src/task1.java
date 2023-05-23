import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(41) - 20; // генеруємо число від -20 до 20

        System.out.println("Випадкове число: " + number);
    }
}