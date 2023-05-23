public class task2 {
    public static void main(String[] args) {
        double a = 3; // перший катет
        double b = 4; // другий катет

        // Обчислення гіпотенузи
        double c = Math.sqrt(a * a + b * b);

        // Обчислення площі
        double area = 0.5 * a * b;

        // Обчислення периметра
        double perimeter = a + b + c;

        System.out.println("Площа прямокутного трикутника: " + area);
        System.out.println("Периметр прямокутного трикутника: " + perimeter);
    }
}