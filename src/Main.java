public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задача 6
        var firstBoxerWeight = 78.2;
        System.out.println("Масса первого боксёра = " + firstBoxerWeight + "кг");
        var secondBoxerWeight = 82.7;
        System.out.println("Масса второго боксёра = " + secondBoxerWeight + "кг");
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксёров = " + firstBoxerWeight + " + " + secondBoxerWeight + " = " + totalWeight + "кг");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница веса боксёров = " + secondBoxerWeight + " - " + firstBoxerWeight + " = " + weightDifference + "кг");
        // Задача 7
        var remainder = secondBoxerWeight%firstBoxerWeight;
        System.out.println("Остаток от деления = " + remainder);
        // Задача 8
        var totalHours = 640;
        System.out.println("Всего часов работы = " + totalHours);
        var hoursForOne = 8;
        System.out.println("Один сотрудник посвящает работе " + hoursForOne + " часов");
        var totalEmployees = totalHours/hoursForOne;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        totalHours = hoursForOne*totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalHours + " часов может быть поделено между сотрудниками.");


    }
}