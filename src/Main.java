import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    static void task1() {
        System.out.println("Задача 1");
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите возраст. Значение должно быть больше 0");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    static void task2() {
        System.out.println("Задача 2");
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите значение температуры С");
        int temp = scanner.nextInt();
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
    }
    static void task3() {
        System.out.println("Задача 3");
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите значение скорости. Значение должно быть больше 0");
        int speed = scanner.nextInt();
        if (speed > 60) {
            System.out.println("Если скорость равна " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость равна " + speed + ", можно ездить спокойно");
        }
    }
    static void task4() {
        System.out.println("Задача 4");
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите возраст. Значение должно быть больше 0");
        int age = scanner.nextInt();
        if (age <= 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать ");
        } else if (age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else if (age <= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        } else System.out.println("Если возраст человека равен " + age + ", то ему пора отдохнуть");
    }
    static void task5() {
        System.out.println("Задача 5");
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите возраст. Значение должно быть больше 0");
        int age = scanner.nextInt();
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        } else if (age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
    }
    static void task6() {
        System.out.println("Задача 6");
        int allSeatCount = 102;
        int allSittingPlaceCount = 60;
        int allStandingPlaceCount = allSeatCount - allSittingPlaceCount;
        int currentSeatCount = 0;
        int currentSittingPlaceCount = 0;
        int currentStandingSeatCount = 0;
        Scanner scanner = new Scanner(System.in);
        while (currentSeatCount < allSeatCount) {
            System.out.println("Введите тип места, которое хотите занять: 1 - сидячее, 2- стоячее, 3 - завершить бронирование");
            int type = scanner.nextInt();
            switch (type) {
                case (1):
                    System.out.println("Введите кол-во сидячих мест, которые хотите занять");
                    int bookingSeatCount = scanner.nextInt();
                    String messageOne = "Забронировать " + bookingSeatCount + " невозможно, доступно к бронированию: " +
                            (allSittingPlaceCount - currentSittingPlaceCount) + " сидячих мест и " +
                            (allStandingPlaceCount - currentStandingSeatCount) + " стоячих мест";
                    if ((currentSeatCount + bookingSeatCount) > allSeatCount) {
                        System.out.println(messageOne);
                        break;
                    } else if ((currentSittingPlaceCount + bookingSeatCount) > allSeatCount) {
                        System.out.println(messageOne);
                        break;
                    } else {
                        currentSeatCount += bookingSeatCount;
                        currentSittingPlaceCount += bookingSeatCount;
                        System.out.println("Забронировано " + bookingSeatCount + " сидячих мест");
                        break;
                    }
                case (2):
                    System.out.println("Введите кол-во стоячих мест, которые хотите занять");
                    int bookingStandingCount = scanner.nextInt();
                    String messageTwo = "Забронировать " + bookingStandingCount + " невозможно, доступно к бронированию: " +
                            (allSittingPlaceCount - currentSittingPlaceCount) + " сидячих мест и " +
                            (allStandingPlaceCount - currentStandingSeatCount) + " стоячих мест";
                    if ((currentSeatCount + bookingStandingCount) > allSeatCount) {
                        System.out.println(messageTwo);
                        break;
                    } else if ((currentStandingSeatCount + bookingStandingCount) > allStandingPlaceCount) {
                        System.out.println(messageTwo);
                        break;
                    } else {
                        currentSeatCount += bookingStandingCount;
                        currentSittingPlaceCount += bookingStandingCount;
                        System.out.println("Забронировано " + bookingStandingCount+ " сидячих мест");
                        break;
                    }
                case (3):
                    System.out.println("Бронировоание завершено");
                    currentSeatCount = 102;
                    break;
            }
        }

    }
    static void task7() {
        System.out.println("Задача 7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа");
        System.out.println("Введите значение числа a");
        int a = scanner.nextInt();
        System.out.println("Введите значение числа b");
        int b = scanner.nextInt();
        System.out.println("Введите значение числа c");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println("Большее из 3х числе а = " + a);
        } else if (b > a && b > c) {
            System.out.println("Большее из 3х числе b = " + b);
        } else System.out.println("Большее из 3х числе c = " + c);
    }
}