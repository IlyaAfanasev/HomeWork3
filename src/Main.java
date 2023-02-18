import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("     Задача 1");
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
        System.out.println("     Задача 2");
        float someDate = 27.12f;
        System.out.println(someDate);
        long distanceToTheStar = 987678965549L;
        System.out.println(distanceToTheStar);
        double somethingSmall = 2.786;
        System.out.println(somethingSmall);
        short highAltitude = 569;
        System.out.println(highAltitude);
        short veryCold = -159;
        System.out.println(veryCold);
        int someMoneyOnTheCard = 27897;
        System.out.println(someMoneyOnTheCard);
        byte ageGrandfather = 67;
        System.out.println(ageGrandfather);
    }
    public static void task3() {
        System.out.println("     Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalSheets = 480;
        byte totalStudents = (byte) (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        short sheetsPerStudent = (short) (totalSheets/totalStudents);
        System.out.println("На каждого ученика рассчитано "+sheetsPerStudent+ " листов бумаги");

    }
    public static void task4() {
        System.out.println("     Задача 4");
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
    public static void task5() {
        System.out.println("     Задача 5");
        byte totalPaint = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass =4;
        byte totalPaintPerClass = (byte) (whitePaintPerClass+brownPaintPerClass);
        byte totalClasses = (byte) (totalPaint/totalPaintPerClass);
        byte totalWhitePaint = (byte) (totalClasses*whitePaintPerClass);
        byte totalBrownPaint = (byte) (totalClasses*brownPaintPerClass);
        System.out.println("В школе, где "+totalClasses+ " классов, нужно " + totalWhitePaint + " банок белой краски и "+totalBrownPaint+ " банок коричневой краски");

    }
    public static void task6() {
        System.out.println("     Задача 6");
        byte totalBananas = 5;
        byte weightOneBananaGr = 80;
        short totalMilkMl= 200;
        byte weight100MlMilkGr = 105;
        byte totalIceCream = 2;
        byte weightOneIceCreamGr = 100;
        byte eggs =4;
        byte weightOneEggsGr = 70;
        short totalWeightBreakfastGr = (short) (totalBananas*weightOneBananaGr+weight100MlMilkGr*2+totalIceCream*weightOneIceCreamGr+weightOneEggsGr*eggs);
        System.out.println(totalWeightBreakfastGr+ "гр");
        float toеatlWeightBreakfastKg = (float) (totalWeightBreakfastGr / 1000f);
        System.out.println(toеatlWeightBreakfastKg + "кг");


    }
    public static void task7() {
        System.out.println("     Задача 7");
        byte totalWeightKg = 7;
        short totalWeightGr = (short) (totalWeightKg*1000);
        short weightGr1= 250;
        short weightGr2 = 500;
        float averegeWeight = (weightGr1 + weightGr2)/2;
        short daysAtTheFirstOption = (short) (totalWeightGr/weightGr1);
        System.out.println("Потребуется " +daysAtTheFirstOption+ " при сжигании 250гр веса в день");
        short daysAtTheSecondOption = (short) (totalWeightGr/weightGr2);
        System.out.println("Потребуется " +daysAtTheSecondOption+ " при сжигании 500гр веса в день");
        float averege =totalWeightGr/averegeWeight;
        System.out.printf(Locale.US, "Потребуется %.1f дней в среднем%n" , averege);

    }
    public static void task8() {
        System.out.println("     Задача 8");
        int salaryMasha = 67760;
        int amountOfIncreaseMasha = salaryMasha/10;
        int increasedSalaryMasha =salaryMasha+amountOfIncreaseMasha;
        int annualSalaryMasha = salaryMasha*12;
        int increasedAnnualSalaryMasha = increasedSalaryMasha*12;
        int annualSalaryDifferenceMasha = increasedAnnualSalaryMasha % annualSalaryMasha;
        System.out.println("Маша теперь получает " +increasedSalaryMasha+ " рублей. Годовой доход вырос на " +annualSalaryDifferenceMasha+" рублей");
        int salaryDenis = 83690;
        int amountOfIncreaseDenis = salaryDenis/10;
        int increasedSalaryDenis =salaryDenis+amountOfIncreaseDenis;
        int annualSalaryDenis = salaryDenis*12;
        int increasedAnnualSalaryDenis = increasedSalaryDenis*12;
        int annualSalaryDifferenceDenis = increasedAnnualSalaryDenis % annualSalaryDenis;
        System.out.println("Денис теперь получает " +increasedSalaryDenis+ " рублей. Годовой доход вырос на " +annualSalaryDifferenceDenis+" рублей");
        int salaryKristina = 76230;
        int amountOfIncreaseKristina = salaryKristina/10;
        int increasedSalaryKristina =salaryKristina+amountOfIncreaseKristina;
        int annualSalaryKristina = salaryKristina*12;
        int increasedAnnualSalaryKristina = increasedSalaryKristina*12;
        int annualSalaryDifferenceKristina = increasedAnnualSalaryKristina % annualSalaryKristina;
        System.out.println("Кристина теперь получает " +increasedSalaryKristina+ " рублей. Годовой доход вырос на " +annualSalaryDifferenceKristina+" рублей");

    }
}
