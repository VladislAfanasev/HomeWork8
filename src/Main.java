import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

// Задание №1. Объявите три массива
        // целочисленный массив
        int [] digits = new int [3];
        digits [0] = 1;
        digits [1] = 2;
        digits [2] = 3;
        // дробный массив
        double [] fractionalDigits = {1.57, 7.654, 9.986};
        // Произвольный массив
        int [] blaBlas = new int[6];
        blaBlas [0] = 27;
        blaBlas [1] = 7;
        blaBlas [2] = 96;
        blaBlas [3] = 34;

// Задание №2. Распечатать элементы каждого массива по порядку
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(fractionalDigits));
        System.out.println(Arrays.toString(blaBlas));
        System.out.println();

// Задание №3. Распечатать элементы каждого массива в обратном порядке
        for (int i=2; i>=0; i--) {
            System.out.print(digits[i]);
            if (i>0) {
                System.out.print(", ");
            } else {
                System.out.println();
                break;
            }
        }
        for (int o=2; o>=0; o--) {
            System.out.print(fractionalDigits[o]);
            if (o>0) {
                System.out.print(", ");
            } else {
                System.out.println();
                break;
            }
        }
        for (int u=5; u>=0; u--) {
            System.out.print(blaBlas[u]);
            if (u>0) {
                System.out.print(", ");
            } else {
                System.out.println();
                break;
            }
        }
        System.out.println();

// Задание №4. Распечатать первый массив изменив нечетные числа на четные
        for (int index=0; index< digits.length; index++) {
            if (digits[index] % 2 == 0) {
            }else {
                digits[index] = digits[index]+1;
            }
        }
        System.out.println(Arrays.toString(digits));

    }
}