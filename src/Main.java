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
        task9();
        task10();
    }
    public static void task1() {
        System.out.println("Задача 1");

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");

        for ( int i = 10; i > 0; i-- ) {
            System.out.println(i);
        }
    }
    public static void task3() {
        System.out.println("Задача 3");

        for ( int i = 0; i < 18; i = i + 2 ) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        for ( int i = 10; i > -11; i-- ) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        for ( int i = 1904; i < 2097; i = i + 4 ) {
            if ( i % 400 == 0 ) {
                System.out.println(i);
            }  else if ( i % 100 != 0) {
                    System.out.println(i);
                }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        for ( int i = 7; i <= 98; i = i + 7 ) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        for ( int i = 1; i <= 512; i = i * 2 ) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int solary = 29000;
        int total = 0;
        for ( int i = 1; i <= 12; i++ ) {
            total = total + solary;
            System.out.println( "Месяц " + i + ", сумма накоплений равна " + total + "рублей." );
        }
    }

    public static void task9() {
        System.out.println("Задача 9");

        int solary = 29000;
        int total = 0;
        for ( int i = 1; i <= 12; i++ ) {
            total = total + (total/100);
            total = total + solary;
            System.out.println( "Месяц " + i + ", сумма накоплений равна " + total + "рублей." );
        }
    }
    public static void task10() {
        System.out.println("Задача 10");
        int nomer = 1;
        int nomer2 = 1;
        System.out.println(nomer2);
        for ( int i = 0; i < 11; i++ ) {
            System.out.println(nomer);
            nomer = nomer + nomer2;
            nomer2 = nomer - nomer2 ;
        }
    }

}





