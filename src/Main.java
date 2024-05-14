public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int age = 20;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен %s , то он совершеннолетний \n", age);
        } else {
            System.out.printf("Если возраст человека равен %s , " +
                    "то он не достиг совершеннолетия, нужно немного подождать \n", age);
        }


        System.out.println("Задача 2");

        int temperature = 5;
        if (temperature <= 5) {
            System.out.printf("На улице %s градуса, нужно надеть шапку \n", temperature);
        } else {
            System.out.printf("На улице %s градусов, можно идти без шапки \n", temperature);
        }


        System.out.println("Задача 3");

        int speed = 80;
        if (speed > 60) {
            System.out.printf("Если скорость %s , то придется заплатить штраф \n", speed);
        } else {
            System.out.printf("Если скорость %s, то можно ездить спокойно \n", speed);
        }

        System.out.println("Задача 4");

        int agePeople = 13;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в детский сад \n", agePeople);
        }
        if (agePeople >= 7 && agePeople <= 17) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в школу \n", agePeople);
        }

        if (agePeople >= 18 && agePeople <= 24) {
            System.out.printf("Если возраст человека равен %s, то его место в университете \n", agePeople);
        }
        if (agePeople > 24) {
            System.out.printf("Если возраст человека равен %s, то ему пора ходить на работу \n", agePeople);
        }

        System.out.println("Задача 5");

        int ageKid = 5;
        if (ageKid < 5) {
            System.out.printf("Если возраст ребенка равен %s, то он не может кататься на аатракционе. \n", ageKid);
        }
        if (ageKid >= 5 && ageKid < 14) {
            System.out.printf("Если возраст ребенка равен %s, то он может кататься только в сопровождении " +
                    "взрослого. \n", ageKid);
        }
        if (ageKid >= 14) {
            System.out.printf("Если возраст ребенка %s , то он может кататься без сопровождения взрослого. \n", ageKid);
        }

        System.out.println("Задача 6");

        int peopleInTrain = 100;
        int trainCarriage = 102;
        int carriageSeat = 60;
        int carriageStand = trainCarriage - carriageSeat;
        if (peopleInTrain < 102) {
            System.out.println("Есть сидячее или стоячее место");
        } else {
            System.out.println("Мест нет");
        }

        System.out.println("Задача 7");

        int one = 888888888;
        int two = 99;
        int three = 555555555;

        if (one > two && one > three) {

            System.out.printf("Число %s большее \n", one);
        } else if (two > three) {
            System.out.printf("Число %s большее \n", two);
        } else {
            System.out.printf("Число %s большее \n", three);
        }
    }
}