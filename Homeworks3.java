import java.util.Arrays;
public class Homeworks3 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("ехал грека через реку ", 5); // ехал грека через реку ехал грека через реку ехал грека через реку ехал грека через реку ехал грека через реку

        System.out.println(isLeapYear(2021)); // false
        System.out.println(isLeapYear(2020)); // true

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];

        System.out.println(createArray(5, 8));

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr)); //[1, 1, 0, 0, 1, 0, 1, 1, 0, 0]
        createNewArray(arr);
        System.out.println(Arrays.toString(arr)); // [0, 0, 1, 1, 0, 1, 0, 0, 1, 1]

        int[] arry = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        creatуArraySec(arry);
        System.out.println(Arrays.toString(arry));


        int[][] mul_arr = new int[4][4];
        creatуMultiArray(mul_arr);
        System.out.println(Arrays.toString(mul_arr));

    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if (a + b > 10 && a + b <= 20)
            return true;
        return false;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0)
            return true;
        return false;
    }

    private static void printString(String source, int repeat) {
        // проверить, что сумма a и b лежит между 10 и 20
        System.out.println(source.repeat(repeat));
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            return true;
        return false;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initalValue;
        }
        return array;
    }

    private static void createNewArray(int[] arr) {
        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        //  * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
    }

    private static void creatуArraySec(int[] arry) {
        // 3. 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] < 6)
            arry[i] = arry[i] * 2;
        } 
    }

    /**
     * @param mul_arr
     */
    private static void creatуMultiArray(int[][] mul_arr) {
        // 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        for (int i = 0; i < mul_arr.length; i++) {
            for (int j = 0, z = mul_arr.length - 1; j < mul_arr.length; j++, z--) {
                if (i == j || i == z) {
                    mul_arr[i][j] = 1;
                } else {
                    mul_arr[i][j] = 0;
                }
            }
        } 
    }

}




    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */
    