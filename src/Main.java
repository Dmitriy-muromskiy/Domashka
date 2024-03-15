public class Main {
    public static void main(String[] args) {

        // Задание №1
        byte y = 18;
        if (y > 17) {
            System.out.println("Если возраст человека равен " + y + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + y
                    + " ,то он не достиг совершеннолетния, нужно немного подождать ");
        }
        // Задание №2
        byte g = 4;
        if (g < 5) {
            System.out.println("На улице " + g + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + g + " градусов, можно идти без шапки");
        }

        // Задание №3

        byte s = 61;
        if (s > 60) {
            System.out.println("Если скорость " + s + " ,то прийдется заплатить штраф");
        } else {
            System.out.println("Если скорость " + s + " ,то можно ездить спокойно");
        }

        // Задание №4

        byte hum = 45;
        if (hum >= 2 && hum < 6) {
            System.out.println("Если возраст человека равен " + hum + " ,то ему нужно ходить детский сад");
        } if (hum >= 7 && hum < 18) {
            System.out.println("Если возраст человека равен " + hum + " ,то ему нужно ходить в школу");
        } if (hum >= 18 && hum <= 24) {
            System.out.println("Если возраст человека равен " + hum + " ,то его место в университете");
        } if (hum > 24) {
            System.out.println("Если возраст человека равен " + hum + " ,то ему пора ходить на работу");
        }

        // Задание №5

        byte kids = 14;
        if (kids < 5 ) {
            System.out.println("Если возраст ребенка равен " + kids + " ,то ему нельзя кататься на аттракционе");
            }
        if ( kids > 5 && kids < 14) {
            System.out.println("Если возраст ребенка равен " + kids
                    + " ,то ему можно кататься на аттракционе в сопровождении взрослого");
            }
        if ( kids >= 14) {
            System.out.println("Если возраст ребенка равен " + kids
                    + " ,то ему можно кататься на аттракционе без сопровождении взрослого");

        }
        // Задание №6

        short allPlace = 102;
        short sitPl = 60;
        short standPl = (short) (allPlace - sitPl);
        short ticketSit = 59;
        short ticketStand = 42;
        short freePlaceSit = (short) (sitPl - ticketSit);
        short freePlaceStand = (short) (standPl - ticketStand);
        int freePlace = allPlace - (freePlaceStand + freePlaceSit);
        if ( freePlace >= allPlace) {
            System.out.println("В вагон нет свободных мест");
            } else {
            System.out.println("В вагоне есть " + freePlaceSit + " сидячих мест и " +
                    freePlaceStand + " стоячих мест");
            }

        // Задание №7



    }
}