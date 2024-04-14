import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        int year = 2024;
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }

        // Задача 2
        printVersion(1, 2021);

        // Задача 3
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays >= 0) {
            System.out.println("Досавка " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printVersion(int clientOS, int releaseYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (releaseYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (releaseYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Зайдите с Android или iOS устройства");
        }

    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return -1;
        }
    }
}