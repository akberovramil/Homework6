public class Main {
    public static void main(String[] args) {
        //Задача 1
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }
        //Задача 2
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }
        //Задача 3
        for (int c = 0; c <= 17; c += 2 ) {
            System.out.println(c);
        }
        //Задача 4
        for (int d = 10; d >= - 10; d-- ) {
            System.out.println(d);
        }
        //Задача 5
        for (int e = 1904; e <= 2096; e += 4) {
            System.out.println(e + " год является високосным");
        }
        //Задача 6
        for (int f = 7; f <= 98; f += 7) {
            System.out.println(f);
        }
        //Задача 7
        for (int g = 1; g <= 512; g *= 2) {
            System.out.println(g);
        }
        //Задача 8
        int pay = 29000;
        int total = 0;
        for (int m = 1; m <= 12; m ++) {
            total = total + pay;
            System.out.println(" Месяц " + m + " сумма накоплений равна " + total);
        }
        //Задача 9
        int payNew = 29000;
        int totalNew = 0;
        for (int n = 1; n <= 12; n++) {
            totalNew = totalNew + totalNew/100;
            totalNew = totalNew + payNew;

            System.out.println("Месяц " + n + " сумма накоплений равна " + totalNew + " руб.");
        }

    }
}
