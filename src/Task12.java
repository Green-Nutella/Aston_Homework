import java.util.Arrays;

public class Task12 {
    public static void numberMultiply() {
        int[] arrayMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arrayMultiply.length; i++) {
            if (arrayMultiply[i] < 6) {
                arrayMultiply[i] = arrayMultiply[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrayMultiply));
    }

}
