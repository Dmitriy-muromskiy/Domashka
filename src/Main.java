public class Main {
    public static void main(String[] args) {
        // создание и присвоение значение переменным
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        // увеличение переменной на 4
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog + "\n" + cat + "\n" + paper);

        // уменьшение переменных на заданное значение
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        //создание переменной friend
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        // создание переменной frog
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        // взвешивание боксеров
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var summBoxer = boxer1 + boxer2;
        System.out.println("Масса боксеров равна " + summBoxer + " кг.");

        var oddsBoxer = boxer2 - boxer1;
        System.out.println("Разница между боксерами составляет - " + oddsBoxer + "кг.");

        // нахождение остатка на деление
        var division = boxer2 / boxer1;
        System.out.println("Остаток от деления равен - " + division);

        // решение задачи про сотрудинков и часов работы

        var allTime = 640;
        var jobTime = 8;
        var people = allTime / jobTime;
        System.out.println("Всего работников компании - " + people + " человек");

        people = people + 94;
        var maxJobTime = people * jobTime;
        System.out.println("Если в компании работает " + people +
                " то всего " + maxJobTime + " часов работы может быть поделено между сотрудниками");

    }
}