package lesson_2;

import java.util.Arrays;

public class Task10 {
    public static void myArray() {
        int[] firstArray = {1, 1, 0, 1, 0, 0, 0, 1, 1, 0};

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == 1) {
                firstArray[i] = 0;
            }else {
                firstArray[i] = 1;
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }
}

