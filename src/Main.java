//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte apple = 127;
        System.out.println(apple);
        short cows = 32000;
        System.out.println(cows);
        int road = 2120000000;
        System.out.println(road);
        long money = 5800012345612331L;
        System.out.println(money);
        float sm = 2.4212333f;
        System.out.println(sm);
        double km = 1.1234567891123456;
        System.out.println(km);
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int totalStudents = class1 + class2 + class3;
        System.out.println(class1);
        System.out.println(class2);
        System.out.println(class3);
        System.out.println(totalStudents);
        short totalPaper = 480;
        System.out.println(totalPaper);
        int paperOneStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperOneStudent + " листов бумаги");
        byte bottle = 8;
        byte min = 1;
        int min20 = min * 20;
        int hour = min * 60;
        int minInDay = hour * 24;
        int minIn3Day = minInDay * 3;
        int minInMonth = minInDay * 30;
        System.out.println(bottle);
        System.out.println(min);
        System.out.println(hour);
        System.out.println(min20);
        System.out.println(minInDay);
        System.out.println(minIn3Day);
        System.out.println(minInMonth);
        int bottle20Min = bottle * min20;
        System.out.println("За 20 минут машина произвела " + bottle20Min + " штук бутылок");
        int bottleDay = bottle * minInDay;
        System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок");
        int bottle3Day = bottle * minIn3Day;
        System.out.println("За 3 дня машина произвела " + bottle3Day + " штук бутылок");
        int bottleMonth = bottle * minInMonth;
        System.out.println("За 1 месяц машина произвела " + bottleMonth + " штук бутылок");
        byte totalCans = 120;
        byte whiteCans = 2;
        byte brownCans = 4;
        System.out.println(totalCans);
        System.out.println(whiteCans);
        System.out.println(brownCans);
        int classCans = whiteCans + brownCans;
        System.out.println(classCans);
        int totalClass = totalCans / classCans;
        System.out.println(totalClass);
        int totalWhiteCans = whiteCans * totalClass;
        System.out.println(totalWhiteCans);
        int totalBrownCans = brownCans * totalClass;
        System.out.println(totalBrownCans);
        System.out.println("В школе где " + totalClass + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");
        byte banana = 80;
        byte milk100ml = 105;
        byte iceCream = 100;
        byte egg = 70;
        System.out.println(banana);
        System.out.println(milk100ml);
        System.out.println(iceCream);
        System.out.println(egg);
        int banana5Pieces = banana * 5;
        int milk200ml = milk100ml * 2;
        int iceCream2Pieces = iceCream * 2;
        int egg4pieces = egg * 4;
        System.out.println(banana5Pieces);
        System.out.println(milk200ml);
        System.out.println(iceCream2Pieces);
        System.out.println(egg4pieces);
        int totalGrams = banana5Pieces + milk200ml + iceCream2Pieces + egg4pieces;
        System.out.println("Вес спортзавтрака " + totalGrams + " грамм");
        float totalKilograms = totalGrams * 0.001f;
        System.out.println("Вес спортзавтрака " + totalKilograms + " килограмм");
        byte target = 7;
        int targetGram = target * 1000;
        System.out.println(target);
        System.out.println(targetGram);
        int days250Gram = targetGram / 250;
        System.out.println(days250Gram);
        int days500Gram = targetGram / 500;
        System.out.println(days500Gram);
        int averageDays = (days250Gram + days500Gram) / 2;
        System.out.println(averageDays);
        int mashaSalaryPerMonth = 67760;
        int denisSalaryPerMonth = 83690;
        int kristinaSalaryPerMonth = 76230;
        System.out.println(mashaSalaryPerMonth);
        System.out.println(denisSalaryPerMonth);
        System.out.println(kristinaSalaryPerMonth);
        int mashaSalary10Percent = (mashaSalaryPerMonth / 100) * 10;
        System.out.println(mashaSalary10Percent);
        int denisSalary10Percent = (denisSalaryPerMonth / 100) * 10;
        System.out.println(denisSalary10Percent);
        int kristinaSalary10Percent = (kristinaSalaryPerMonth / 100) * 10;
        System.out.println(kristinaSalary10Percent);
        int totalMashaSalaryPerMonth = kristinaSalaryPerMonth + kristinaSalary10Percent;
        System.out.println(totalMashaSalaryPerMonth);
        int totalDenisSalaryPerMonth = denisSalaryPerMonth + denisSalary10Percent;
        System.out.println(totalDenisSalaryPerMonth);
        int totalKristinaSalaryPerMonth = kristinaSalaryPerMonth + kristinaSalary10Percent;
        System.out.println(totalKristinaSalaryPerMonth);
        int mashaSalaryPerYear = mashaSalaryPerMonth * 12;
        int denisSalaryPerYear = denisSalaryPerMonth * 12;
        int kristinaSalaryPerYear = kristinaSalaryPerMonth * 12;
        System.out.println(mashaSalaryPerYear);
        System.out.println(denisSalaryPerYear);
        System.out.println(kristinaSalaryPerYear);
        int mashaSalaryPerYear10Percent = totalMashaSalaryPerMonth * 12;
        int denisSalaryPerYear10Percent = totalDenisSalaryPerMonth * 12;
        int kristinaSalaryPerYear10Percent = totalKristinaSalaryPerMonth * 12;
        System.out.println(mashaSalaryPerYear10Percent);
        System.out.println(denisSalaryPerYear10Percent);
        System.out.println(kristinaSalaryPerYear10Percent);
        int differenceMashaSalaryPerYear = mashaSalaryPerYear10Percent - mashaSalaryPerYear;
        int differenceDenisSalaryPerYear = denisSalaryPerYear10Percent - denisSalaryPerYear;
        int differenceKristinaSalaryPerYear = kristinaSalaryPerYear10Percent - kristinaSalaryPerYear;
        System.out.println(differenceMashaSalaryPerYear);
        System.out.println(differenceDenisSalaryPerYear);
        System.out.println(differenceKristinaSalaryPerYear);
        System.out.println("Маша теперь получает " + totalMashaSalaryPerMonth + " рублей. Годовой доход вырос на " + differenceMashaSalaryPerYear + " рублей");
        System.out.println("Маша теперь получает " + totalDenisSalaryPerMonth + " рублей. Годовой доход вырос на " + differenceDenisSalaryPerYear + " рублей");
        System.out.println("Маша теперь получает " + totalKristinaSalaryPerMonth + " рублей. Годовой доход вырос на " + differenceKristinaSalaryPerYear + " рублей");
    }
}