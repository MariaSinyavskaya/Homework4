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

    public static void task1() {
        System.out.println("Задача 1:");
        int ageFistVariant = 25;
        int ageSecondVariant = 16;
        if (ageFistVariant >= 18) {
            System.out.println("Если возраст человека равен " + ageFistVariant + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + ageFistVariant + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        if (ageSecondVariant >= 18) {
            System.out.println("Если возраст человека равен " + ageSecondVariant + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + ageSecondVariant + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2:");
        int temperatureFirstVariant = 8;
        int temperatureSecondVariant = -3;
        if (temperatureFirstVariant >= 5) {
            System.out.println("На улице " + temperatureFirstVariant + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperatureFirstVariant + " градусов, нужно надеть шапку");
        }
        if (temperatureSecondVariant >= 5) {
            System.out.println("На улице " + temperatureSecondVariant + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperatureSecondVariant + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3:");
        int speedExampleOne = 58;
        int speedExampleTwo = 75;
        if (speedExampleOne > 60) {
            System.out.println("Если скорость " + speedExampleOne + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedExampleOne + " км/ч, то можно ездить спокойно");
        }
        if (speedExampleTwo > 60) {
            System.out.println("Если скорость " + speedExampleTwo + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedExampleTwo + " км/ч, то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4:");
        int age = 22;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ",то ему пора спать");
        } else if (age <= 6) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в детский сад");
        } else if (age <= 18) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в школу");
        } else if (age < 24) {
            System.out.println("Если возраст человека равен " + age + ",то то его место в университете");
        } else if (age <= 60) {
            System.out.println("Если возраст человека равен " + age + ",то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ",то он может отдохнуть");
        }
        //Второй вариант написания условного оператора
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ",то ему пора спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ",то то его место в университете");
        } else if (age >= 24 && age <= 60) {
            System.out.println("Если возраст человека равен " + age + ",то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ",то он может отдохнуть");
        }
    }
    public static void task5() {
        System.out.println("Задача 5:");
        int ageOfChild = 7;
        if (ageOfChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ",то ему нельзя кататься на аттракционе");
        } else if (ageOfChild >= 5 && ageOfChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ",то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ",то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6:");
        int wagonCapacity = 102;
        int seatPlaces = 60;
        int passengersNumber = 74;
        boolean standingAndSeatedPlaces = passengersNumber < seatPlaces;
        boolean onlyStandingPlaces = passengersNumber >= seatPlaces && passengersNumber < wagonCapacity;
        boolean noPlaces = passengersNumber >= wagonCapacity;
        if (standingAndSeatedPlaces) {
            System.out.println("В вагоне остались и сидячие, и стоячие места");
        } else if (onlyStandingPlaces) {
            System.out.println("В вагоне остались только стоячие места");
        } else if (noPlaces) {
            System.out.println("В вагоне не осталось мест");
        }
    }
    public static void task7() {
        System.out.println("Задача 7:");
        int one = 10;
        int two = 18;
        int three = 13;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше остальных");
        } else {
            System.out.println("Число " + three + " больше остальных");
        }
    }
}