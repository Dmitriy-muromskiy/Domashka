public class Main {

    public static void main(String[] args) {

        // task 1
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println(" Установите версию приложения для Android по ссылке");
        }

        // task 2

        int clientDeviceYear = 2015;
        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println(" Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOs == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println(" Установите версию приложения для Android по ссылке");
            }
        }

        // task 3

        int year = 2024;
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным ");
        } else {
            System.out.println(year + " год является не високосным ");
        }

        // task 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуестся дней: 3");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

        // task 5
        int monthNumber = 3;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Сейчас зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(" Сейчас весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(" Сейчас лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(" Сейчас осень");
                    break;
            }
        } else {
            System.out.println(" Такого месяца нет");
        }

    }


}
