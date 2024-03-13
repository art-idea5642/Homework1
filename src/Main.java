public class Main {
    public static void main(String[] args) {
     // Задача 1
     int a = 12;
     byte tonyStark = 2;
     short smallBox = 12735;
     long oil = 12_745_392L;
     float x = 134.745f;
     double z = 123.4567891011121314;
     System.out.println("Значение переменной a с типом int равно " + a);
     System.out.println("Значение переменной tonyStark с типом byte равно " + tonyStark);
     System.out.println("Значение переменной smallBox с типом short равно " + smallBox);
     System.out.println("Значение переменной oil с типом long равно " + oil);
     System.out.println("Значение переменной x с типом float равно " + x);
     System.out.println("Значение переменной z с типом double равно " + z);
     // Задача 2
     float р = 27.12f;
     long b = 987678965549L;
     float c = 2.786f;
     int d = 569;
     int e = -159;
     int f = 27897;
     int g = 67;
     // Задача 3
     int class1 = 23;
     int class2 = 27;
     int class3 = 30;
     int totalStudents = class1 + class2 + class3;
     int totalPaper = 480;
     int paperForOne = totalPaper/totalStudents;
     System.out.println("По " + paperForOne + " листов достанется каждому ученику");
     // Задача 4
     int productivity = 16;
     int time = 2;
     int oneMinuteProductivity = productivity/time;
     int time2 = 20;
     int productivity2 = oneMinuteProductivity*time2;
     System.out.println("За " + time2 + " минут машина произвела " +  productivity2 + " штук бутылок");
     int time3Hours = 24;
     int time3Minutes = time3Hours*60;
     int productivityDay = oneMinuteProductivity*time3Minutes;
     System.out.println("За " + time3Hours + " часа машина произвела "
             + productivityDay + " штук бутылок");
     int days = 3;
     int time4ThreeDays = time3Minutes*days;
     int productivity3Days = oneMinuteProductivity*time4ThreeDays;
     System.out.println("За " + days + " дня машина произвела "
             + productivity3Days + " штук бутылок");
     int month = 1;
     int daysInMonth = 30;
     int minutesInMonth = daysInMonth * month * time3Minutes;
     int productivityMonth = oneMinuteProductivity * minutesInMonth;
     System.out.println("За " + month + " месяц машина произвела "
             + productivityMonth + " штук бутылок");
     //Задача 5
     int totalColors = 120;
     int whiteOneClass = 2;
     int blackOneClass = 4;
     int totalOneClass = whiteOneClass + blackOneClass;
     int totalClasses = totalColors/totalOneClass;
     float whiteRatio = (float) whiteOneClass/totalOneClass;
     System.out.println(whiteRatio);
     float whiteTotal = whiteRatio*totalColors;
     float blackTotal = totalColors - whiteTotal;
     System.out.println("В школе, где " + totalClasses + " классов, нужно " + whiteTotal +
             " банок белой краски и " + blackTotal + " банок коричневой краски");
     // Задача 6
     int bananas = 5;
     int weightOneBanana = 80;
     int totalWeightBananas = bananas * weightOneBanana;
     int milk = 200;
     int gramsIn100 = 105;
     int totalWeightMilk = milk*gramsIn100/100;
     int iceCream = 2;
     int weightOneIceCream = 100;
     int totalWeightIceCream = iceCream * weightOneIceCream;
     int eggs = 4;
     int weightOneEgg = 70;
     int totalWeightEgg = eggs * weightOneEgg;
     int totalWeight = totalWeightEgg + totalWeightIceCream + totalWeightMilk + totalWeightBananas;
     float totalWeightKg = (float) totalWeight / 1000;
     System.out.println("Вес завтрака " + totalWeight + " грамм, или " + totalWeightKg + " килограмм");
     // Задача 7
     int goal = 7;
     int goalInGrams = goal * 1000;
     int day1 = 250;
     int totalDays1 = goalInGrams/day1;
     int day2 = 500;
     int totalDays2 = goalInGrams/day2;
     int middleDays = (totalDays1 + totalDays2)/2;
     System.out.println("Дней на похудение в первом случае - " + totalDays1);
     System.out.println("Дней на похудение во втором случае - " + totalDays2);
     System.out.println("Дней на похудение в среднем - " + middleDays);
     // Задача 8
     int salaryMasha = 67760;
     int salaryDenis = 83690;
     int salaryKristina = 76230;
     float salaryMashaNextYear = salaryMasha*1.1f;
     int salary1 = Math.round(salaryMashaNextYear);
     float salaryDenisNextYear = salaryDenis*1.1f;
     int salary2 = Math.round(salaryDenisNextYear);
     float salaryKristinaNextYear = salaryKristina*1.1f;
     int salary3 = Math.round(salaryKristinaNextYear);
     float yearDifferenceMasha = salaryMasha*12*0.1f;
     int difference1 = (int) yearDifferenceMasha;
     float yearDifferenceDenis = salaryDenis*12*0.1f;
     int difference2 = (int) yearDifferenceDenis;
     float yearDifferenceKristina = salaryKristina*12*0.1f;
     int difference3 = (int) yearDifferenceKristina;
     System.out.println("Зарпалата Маши в новом году будет " + salary1 + " рублей");
     System.out.println("Зарпалата Дениса в новом году будет " + salary2 + " рублей");
     System.out.println("Зарпалата Кристины в новом году будет " + salary3 + " рублей");
     System.out.println("Разница годовой зарплаты Маши будет " + difference1 + " рублей");
     System.out.println("Разница годовой зарплаты Дениса будет " + difference2 + " рублей");
     System.out.println("Разница годовой зарплаты Кристины будет " + difference3 + " рублей");

    }
}