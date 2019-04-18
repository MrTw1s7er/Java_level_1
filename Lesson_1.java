/**
 * Lesson 1
 * @author Ivan Protasov
 * @version .....
 */
public class Lesson_1 {

    public static void main(String[] args) {
        // №2
        dataTypes();
        // №3
        System.out.println(calculate(1,2,3,4));
        System.out.println(calculate(1,2,3,0));
        System.out.println(calculate(1,2,0,4));
        // №4
        System.out.println(checkSum(4,4));
        System.out.println(checkSum(5,7));
        System.out.println(checkSum(11,20));
        // №5
        checkPositiveOrNegative(-5);
        checkPositiveOrNegative(5);
        checkPositiveOrNegative(0);
        // №6
        System.out.println(checkNegative(-5));
        System.out.println(checkNegative(5));
        // №7
        welcomeNAme("Ivan");
        // №8
        checkYears(4);
        checkYears(100);
        checkYears(1995);
        checkYears(400);
    }

    /**
     * 2.
     * Создать переменные всех пройденных типов данных, и инициализировать их значения.
     */

    static void dataTypes() {
        byte b = -128, e = 127;
        short s = -32768, t = 32767;
        int i = -2147483648, n = 2147483647;
        long l = -9223372036854775808L, g = 9223372036854775807L;
        float f = 120.0f;
        double d = 15.72775;
        boolean o = true, a = false;
        char c = 'A';
        String str = "Hello";
    }

    /**
     * 3.
     * Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные
     * параметры этого метода.
     */

    static double calculate(double a, double b, double c, double d) {
        return a * (b + c / d);
    }

    /**
     * 4.
     * Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
     * от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
     */

    static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    /**
     * 5.
     * Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
     * положительное ли число передали, или отрицательное; ​Замечание: ноль считаем положительным числом.
     */

    static void checkPositiveOrNegative(int a) {
        System.out.println(a + " является" + ((a >= 0) ? " положительным" : " отрицательным"));
    }

    /**
     * 6.
     * Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
     * если число отрицательное;
     */

    static boolean checkNegative(int a) {
        return a < 0;
    }

    /**
     * 7.
     * Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести
     * в консоль сообщение «Привет, указанное_имя!»
     */

    static void welcomeNAme(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /**
     * 8.
     * *Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4 - йгод
     * является високосным, кроме каждого 100 - го, при этом каждый 400  й– високосный.
     */

    static void checkYears(int y) {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println(y + " Високосный");
        }else
            System.out.println(y + " Обычный");
    }
}