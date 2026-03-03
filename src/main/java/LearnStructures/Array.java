package LearnStructures;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        String[] strings;
        int[] ints;

        var strings2 = new String[5]; // сейчас все элементы - null
        var strings3 = new String[]{"Skyrim", "Fallout"};

        String[][] matrix = {
                {"1", "Al"},
                {"2", "Kara"}
        };

        var arrayInt = new int[]{3, 453, 34, 65, 65};
        int length = arrayInt.length;
        System.out.println("длина = " + length);
        System.out.println("элемент индекса 2 = " + arrayInt[2]);

        var randomEl = arrayInt[new Random().nextInt(arrayInt.length)];
        System.out.println("случайный элемент = " + randomEl);

        for (int i : arrayInt) {
            System.out.print(i + " ");
        }
    }
}
