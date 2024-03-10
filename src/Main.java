public class Main {
    public static void main(String[] args) {
        // объявление переменных
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
















    }
}