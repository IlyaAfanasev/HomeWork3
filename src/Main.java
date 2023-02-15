public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        byte variableOne = 3;
        System.out.println("Значение переменной variableOne с типом byte равно " + variableOne);
        short variableTwo = -13857;
        System.out.println("Значение переменной variableTwo с типом short равно " + variableTwo);
        int variableThree = 1359846582;
        System.out.println("Значение переменной variableThree с типом int равно " + variableThree);
        long variableFour = -78568478231L;
        System.out.println("Значение переменной variableFour с типом long равно " + variableFour);
        float variableFive = 3.14f;
        System.out.println("Значение переменной variableFive с типом float равно " + variableFive);
        double variableSix = 587.879642354;
        System.out.println("Значение переменной variableSix с типом double равно " + variableSix);


    }
    public static void task2() {
        float someDate = 27.12f;
        System.out.println(someDate);
        long distanceToTheStar = 987678965549L;
        System.out.println(distanceToTheStar);
        float somethingSmall = 2.786f;
        System.out.println(somethingSmall);
        short highAltitude = 569;
        System.out.println(highAltitude);
        short veryCold = -159;
        System.out.println(veryCold);
        short someMoneyOnTheCard = 27897;
        System.out.println(someMoneyOnTheCard);
        byte ageGrandfather = 67;
        System.out.println(ageGrandfather);
    }
    public static void task3() {
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalSheets = 480;
        byte totalStudents = (byte) (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        short sheetsPerStudent = (short) (totalSheets/totalStudents);
        System.out.println("На каждого ученика рассчитано "+sheetsPerStudent+ " листов бумаги");

    }
    public static void task4() {
        byte bottlesIn2minutes = 16;
        short bottlesIn20minutes = (short) (bottlesIn2minutes * 10);
        System.out.println("За 20 минут машина произвела "+bottlesIn20minutes+ " штук бутылок");
        short bottlesADay = (short) (bottlesIn20minutes*3*24);
        System.out.println("За один день машина произвела "+bottlesADay+ " штук бутылок");
        int bottlesIn3Days = bottlesADay*3;
        System.out.println("За 3 дня машина произвела "+bottlesIn3Days+ " штук бутылок");
        int bottlesPerMount = bottlesADay*30;
        System.out.println("За один месяц машина произвела "+bottlesPerMount+ " штук бутылок");


    }
}
