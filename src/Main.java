public class Main {
    public static void main(String[] args) {
        // Задание №1
        byte b = -57;
        short s = 777;
        int i = 25464;
        long l = 64646L;
        float f = -46.57647f;
        double d = 647.6353555626;
        System.out.println("Значение переменной b с типом переменной byte равно " + b);
        System.out.println("Значение переменной s с типом переменной short равно " + s);
        System.out.println("Значение переменной i с типом переменной int равно " + i);
        System.out.println("Значение переменной l с типом переменной long равно " + l);
        System.out.println("Значение переменной f с типом переменной float равно " + f);
        System.out.println("Значение переменной d с типом переменной double равно " + d);

        //Задание №2

        float num1 = (float) 27.12;
        long num2 = 987678965549L;
        double num3 = 2.786;
        short num4 = 569;
        short num5 = -159;
        int num6 = 27897;
        byte num7 = 67;

        // Задание №3

        byte clasLydi = 23;
        byte clasAnni = 27;
        byte clasKati = 30;
        short paper = 480;
        int paperStudent = paper/(clasAnni + clasLydi + clasKati);
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");

        // Задание №4
        byte zaMinuts = 16 /2;
        short twentiMinuts = (short) (20 * zaMinuts);
        System.out.println("За 20 минут машина произвела " + twentiMinuts + " штук бутылок");

        short minutDay = 60 * 24;
        int zaDay = minutDay * 8;
        System.out.println("За сутки машина произвела " + zaDay + " штук бутылок");

        int truDay = zaDay * 3;
        System.out.println("За три дня машина произвела " + truDay + " штук бутылок");

        long month = zaDay * 30;
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

        // Задание №5

        byte allPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int whiteBrown = whitePaint + brownPaint;
        int allClass = allPaint/whiteBrown;
        int whiteCan = allClass * whitePaint;
        int brownCan = allClass * brownPaint;
        System.out.println("В школе, где " + allClass + " классов, нужно " + whiteCan + " банок белой краски и "
        + brownCan + " банок коричневой краски.");

        // Задание №6

        byte banans = 80;
        byte milk100 = 105;
        byte iceCream = 100;
        byte egg = 70;
        float mixerGr = (banans * 5) + (milk100 * 2) + (iceCream * 2) + (egg * 4);
        float mixerKg = mixerGr /1000;
        System.out.println("Вес спортзавтрака " + mixerGr + " гр." + "\n"
        + "Вес спортзавтрака " + mixerKg + " кг");

        // Задание №7

        int gramm = 7000;
        short lossWheight1 = 250;
        short lossWheight2 = 500;
        int lossDay1 = gramm / lossWheight1;
        int lossDay2 = gramm / lossWheight2;
        float averageValue = (float) (lossDay1 + lossDay2)/2;
        System.out.println("При худении по " + lossWheight1 + " грамм в день, чтоб сбросить 7 кг потребуемся "
        + lossDay1 + " дней");
        System.out.println("При худении по " + lossWheight2 + " грамм в день, чтоб сбросить 7 кг потребуемся "
        + lossDay2 + " дней");
        System.out.println("В среднем потребуется " + averageValue + " день");


        // Задание №8

        int masha = 67760;
        int den = 83690;
        int kris = 76230;
        float percent = 0.1f;

        int moneyMashaYear = masha * 12;
        int moneyDenYear = den * 12;
        int moneyKrisYear = kris * 12;


        float moneyMashaAfter = masha + (masha * percent);
        float moneyDenAfter = den + (den * percent);
        float moneyKrisAfter = kris + (kris * percent);


        float moneyMashaAfYear = moneyMashaAfter * 12;
        float moneyDenAfYear = moneyDenAfter * 12;
        float moneyKrisAfYear = moneyKrisYear * 12;


        float differMasha = moneyMashaAfYear - moneyMashaYear;
        float differDen = moneyDenAfYear - moneyDenYear;
        float differKris = moneyKrisAfYear - moneyKrisYear;
        System.out.println("Маша теперь получает " + moneyMashaAfter + " рублей. Годовой доход вырос на "
            + differMasha + " рублей.");
        System.out.println("Денис теперь получает " + moneyDenAfter + " рублей. Годовой доход вырос на "
                + differDen + " рублей.");
        System.out.println("Кристина теперь получает " + moneyKrisAfter + " рублей. Годовой доход вырос на "
                + differKris + " рублей.");































    }
}